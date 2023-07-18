package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.desktops.Desktops;
import com.tutorialsninja.pages.homepage.TopMenu;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DesktopTest extends BaseTest {

    List<String> originalProductsName;
    List<String> afterSortByZToAProductsName;
    Desktops desktop ;
    TopMenu menu ;
    @BeforeMethod(groups = {"sanity","smoke","regrassion"})
    public void inIT(){
        desktop = new Desktops();
        menu = new TopMenu();

    }
    //
    @Test(groups = {"sanity", "regression"})
    public void verifyProductArrangeInReverseAlphaBaticalOrder() {
        menu.clickonDesktopTab();
        menu.selectMenu("Show AllDesktops");
        desktop.originalProductsName();
        desktop.selectSortByPositionZToA();
        desktop.afterSortByZToAProductsName();
        Assert.assertEquals(afterSortByZToAProductsName, originalProductsName, "Product is not displayed in descending order");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() {
        menu.clickonDesktopTab();
        menu.selectMenu("Show AllDesktops");
        desktop.selectSortByPositionAToZ();
        desktop.selectProduct();
        String actualProduct = "HP LP3065";
        String expectedProduct = getTextFromElement(By.xpath("//a[contains(text(),'HP LP3065')]"));
        Assert.assertEquals(actualProduct, expectedProduct, "HP LP3065 is not display");
        desktop.selectProduct();
        desktop.selectDate();
        desktop.selectAllDate();
        desktop.setEnterqty();
        desktop.setAddToCart();
        String actualPrintMessage = "Success: You have added HP LP3065 to your shopping cart!";
        String expectedPrintMessage = getTextFromElement(By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible"));
        Assert.assertEquals(actualPrintMessage, expectedPrintMessage, "Product not add to cart");
        desktop.successMessageDisplay();
        String actualShoppingCart = "Shopping Cart";
        String expectedShoppingCart = getTextFromElement(By.xpath("//div[@id='content']//h1"));
        Assert.assertEquals(actualShoppingCart, expectedShoppingCart, "Product name not display");
        String actualDeliveryDate = "2022-11-30";
        String expectedDeliveryDate = getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]\")).contains(\"2023-11-30\"));"));
        Assert.assertEquals(actualDeliveryDate, expectedDeliveryDate, "Delivery date is not display");
        String actualVerifyProduct = "Product21";
        String expectedVerifyProduct = getTextFromElement(By.xpath("//td[contains(text(),'Product 21')]"));
        Assert.assertEquals(actualVerifyProduct, expectedVerifyProduct, "Model not matches");
        String actualCost = "£74.73";
        String expectedCost = getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]"));
        Assert.assertEquals(actualCost, expectedCost, "Total not match");


    }
}
