package com.tutorialsninja.pages.laptopsandnotebooks;

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

public class LaptopsAndNotebooks extends Utility {

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/h4[1]/a[1]")
    WebElement productmacbook;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement clickcart;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement shoppingcart;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement changeQty2;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement updateTab;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement clickCheckoutbutton;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]/input[1]")
    WebElement guestButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueButton;

    ArrayList<String> originalProductsPrice = new ArrayList<>();


    public void sortByPrise(){
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
        }
        System.out.println(originalProductsPrice);
    }
    public void reverseOrder(){
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
    }
    public void setProductMacbook(){
        clickOnElement(productmacbook);
        CustomListeners.test.log(Status.PASS,"set Product Macbook");
    }
public void clickCartButton(){
clickOnElement(clickcart);
    CustomListeners.test.log(Status.PASS,"click on Button");
}
public void clickShoppingCart(){
        clickOnElement(shoppingcart);
    CustomListeners.test.log(Status.PASS,"click on shoppingcart");

    }
public void setChangeQty2(){
        clickOnElement(changeQty2);
    CustomListeners.test.log(Status.PASS,"Set Change Qty 2");
}
public void setUpdateTab(){
        clickOnElement(updateTab);
    CustomListeners.test.log(Status.PASS," Set Update Tab");
}
public void verifyClickOnCheckOutButton(){
        clickOnElement(clickCheckoutbutton);
    CustomListeners.test.log(Status.PASS,"click on checkout Button");
}
public void clickOnGuestButton(){
        clickOnElement(guestButton);
    CustomListeners.test.log(Status.PASS,"click on guestButton");
    }
    public void clickContinueButton(){
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"click on continueButton");
    }
    }