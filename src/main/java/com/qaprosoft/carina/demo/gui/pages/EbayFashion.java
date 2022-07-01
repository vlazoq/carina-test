package com.qaprosoft.carina.demo.gui.pages;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EbayFashion extends AbstractPage {


    @FindBy(xpath="//button[@id=\"s0-17-12-0-1[0]-0-0-27[1]-0-toggle-button\"]/span")
    private ExtendedWebElement men;

    @FindBy(xpath="//li[@id=\"s0-17-12-0-1[0]-0-0-27[1]-0\"]/ul/li")
    private List<ExtendedWebElement> menCategories;


    public EbayFashion(WebDriver driver) {
        super(driver);
    }


    public void clickMen() {
        men.click();
    }


    public EbayMensClothing selectMensClothing(String category){
        for (ExtendedWebElement menCategory : menCategories){
            String currentCategory = menCategory.getText();
            if (category.equalsIgnoreCase(currentCategory)) {
                menCategory.click();
                return new EbayMensClothing(driver);
            }
        }
        throw new RuntimeException("Unable to open Men's Category: " + category);
    }





}
