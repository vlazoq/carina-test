/*
 * Copyright 2013-2021 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.components.compare.ModelSpecs;
import com.qaprosoft.carina.demo.gui.components.compare.ModelSpecs.SpecType;
import com.qaprosoft.carina.demo.gui.pages.CompareModelsPage;
import com.qaprosoft.carina.demo.gui.pages.EbayFashion;
import com.qaprosoft.carina.demo.gui.pages.EbayHome;
import com.qaprosoft.carina.demo.gui.pages.HomePage;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * This sample shows how create Web test with dependent methods which shares existing driver between methods.
 * 
 * @author qpsdemo
 */
public class WebSampleTestEbay implements IAbstractTest {
    EbayHome ebayHome = null;


    @BeforeSuite
    public void startDriver() {
        ebayHome = new EbayHome(getDriver());
    }

/*
    @Test
    @MethodOwner(owner = "victor")
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testOpenPage() {
        ebayHome.open();
        Assert.assertTrue(ebayHome.isPageOpened(), "Home page is not open");
    }
*/
    @Test
    @MethodOwner(owner = "victor")
    @TestLabel(name = "feature", value = {"web", "regression"})
    public void testFashion() {
        ebayHome.open();
        EbayFashion fashion = ebayHome.getFashion();
        Assert.assertTrue(fashion.isPageOpened(), "Home page is not open");
    }








}
