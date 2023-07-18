package com.tutorialsninja.pages.desktops;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Desktops extends Utility {

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByZtoA;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement product;

    @CacheLookup
    @FindBy(xpath = "By.xpath(//div[@class = 'input-group date']//button));")
    WebElement deliveryDate;

    @CacheLookup
    @FindBy(name = "quantity")
    WebElement enterQty1;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement successMessage;

    ArrayList<String> originalProductsName = new ArrayList<>();
    ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();

    public void selectSortByPositionZToA() {
        selectByVisibleTextFromDropDown(sortByZtoA, "Name (Z - A)");
    }

    public void selectSortByPositionAToZ() {
        selectByVisibleTextFromDropDown(sortByZtoA, "Name (A - Z)");
    }

    public void originalProductsName() {
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println("Product List before filter: " + originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println("Product List before filter in reverse alphabetical order" + originalProductsName);
    }

    public void afterSortByZToAProductsName() {
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println("Product List after filter: " + afterSortByZToAProductsName);
    }

    public void selectProduct() {
        clickOnElement(product);
    }


    public void selectDate() {
        String year = "2023";
        String month = "November";
        String date = "30";

        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
    }

    public void selectAllDate() {

        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(String.valueOf(deliveryDate))) {
                e.click();
                break;
            }
        }
    }

    public void setEnterqty() {
        clickOnElement(enterQty1);
        CustomListeners.test.log(Status.PASS," Set Enter qty ");
    }

    public void setAddToCart() {
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS," Set Add To Cart");
    }

    public void successMessageDisplay() {
        clickOnElement(successMessage);
        CustomListeners.test.log(Status.PASS,"success Message Display");
    }


}

















