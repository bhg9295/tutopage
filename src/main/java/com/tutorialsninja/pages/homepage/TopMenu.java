package com.tutorialsninja.pages.homepage;


import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TopMenu extends Utility {

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktop;

    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement showAllDesktops;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Desktops')]")
    WebElement getDesktopTextWebelement;

    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopandnotebook;

    @CacheLookup
    @FindBy(linkText = "Show AllLaptops & Notebooks")
    WebElement ShowAllLaptopsNotebooks;

    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement Components;

    @CacheLookup
    @FindBy(linkText = "Show AllComponents")
    WebElement ShowAllComponents;

    public void clickonDesktopTab() {
        clickOnElement(desktop);
        CustomListeners.test.log(Status.PASS,"click on Desktop Tab");
    }
    public void showDesktop(){
        clickOnElement(showAllDesktops);
        CustomListeners.test.log(Status.PASS,"click on loginButton");
    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    public String getLaptopandNotebookText() {
        String element = getTextFromElement(getDesktopTextWebelement);
        CustomListeners.test.log(Status.PASS," getLaptopandNotebookText");
return element;

    }

    public void clickonLaptopsNotebooks() {
        clickOnElement(laptopandnotebook);
        CustomListeners.test.log(Status.PASS,"click on notebook");
    }

    public void getlaptopandnotebook() {
        clickOnElement(ShowAllLaptopsNotebooks);
        CustomListeners.test.log(Status.PASS,"get laptop and notebook");
    }

    public void getcomponent() {
        clickOnElement(Components);
        CustomListeners.test.log(Status.PASS," get component");

    }

    public void getcomonentelement() {
        clickOnElement(ShowAllComponents);
        CustomListeners.test.log(Status.PASS,"get comonent element");
    }


}


