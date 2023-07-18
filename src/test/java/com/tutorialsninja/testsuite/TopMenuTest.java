package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.homepage.TopMenu;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    TopMenu menu ;

    @BeforeMethod(groups = {"sanity","smoke","regrassion"})
    public void inIT(){
        menu = new TopMenu();

    }
    //
    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        // selectBrowser("Chrome");
        menu.clickonDesktopTab();
        menu.selectMenu("Show AllDesktops");
        String expectedText = "Desktops";
        String actualText = getTextFromElement(By.xpath("//h2[contains(text(),'Desktops')]"));
        Assert.assertEquals(actualText, expectedText, "Desktop text is not displayed");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        menu.clickonLaptopsNotebooks();
        menu.selectMenu("Show AllLaptops & Notebooks");
        String expectedText = "Laptops & Notebooks";
        String actualText = getTextFromElement(By.xpath("//h2[contains(text(),'Laptops & Notebooks')]"));
        Assert.assertEquals(actualText, expectedText, "Laptop and Notebook is not Dispalyed");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        menu.getcomonentelement();
        menu.selectMenu("ShowAllComponents");
        String expectedText = "Show AllComponents";
        String actualText = getTextFromElement(By.xpath("//h2[contains(text(),'Components')]"));
        Assert.assertEquals(actualText, expectedText, "Component is not display");
    }
}
