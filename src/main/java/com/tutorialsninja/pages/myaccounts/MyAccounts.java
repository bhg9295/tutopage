package com.tutorialsninja.pages.myaccounts;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.customlisteners.CustomListeners;
import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class MyAccounts extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccount;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement register;
    @CacheLookup
    @FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]\")")
    WebElement login;
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstname;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;
    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement Telephone;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement conformPassword;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]")
    WebElement radiobutton;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
    WebElement privacyPolicy;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue")
    WebElement clickcontinueButton;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement emailAddress;
    @CacheLookup
    @FindBy( id = "input-password")
    WebElement clickpassword;
   @CacheLookup
           @FindBy(xpath ="//form[contains(@action,'login')]//input[@type='submit']")
           WebElement clicklogin;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')] ")
    WebElement clickMyAccount;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement clickLogOut;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement checkContinueButton;
  


    public void clickMyAcount() {
        clickOnElement(myAccount);
        CustomListeners.test.log(Status.PASS,"click On MyAcount");
    }

    public void clickOnRegister() {
        clickOnElement(register);
        CustomListeners.test.log(Status.PASS,"click on register");
    }

    public void clickOnLogin() {
        clickOnElement(login);
        CustomListeners.test.log(Status.PASS,"click on loginButton");
    }

    public void enterFirstname(String firstname1) {
        sendTextToElement(firstname, firstname1);
        CustomListeners.test.log(Status.PASS,"click on firstname" + firstname1);
    }

    public void enterLastName(String lastname1) {
        sendTextToElement(lastName, lastname1);
        CustomListeners.test.log(Status.PASS,"Enter LastName" + lastname1);
    }

    public void enteremail(String email1) {
        sendTextToElement(email, email1);
        CustomListeners.test.log(Status.PASS,"Enter email"+ email1);
    }

    public void enterTelephone(String tnumber ) {
        sendTextToElement(Telephone, tnumber);
        CustomListeners.test.log(Status.PASS," Enter Telephone" + tnumber);
    }

    public void enterPassword(String password1) {
        sendTextToElement(password, password1);
        CustomListeners.test.log(Status.PASS," Enter Password" + password1);
    }

    public void enterConformPassword(String password) {
        sendTextToElement(conformPassword, password);
        CustomListeners.test.log(Status.PASS,"Enter Conform Password" + password);
    }

    public void clickRadioButton() {
        clickOnElement(radiobutton);
        CustomListeners.test.log(Status.PASS,"click Radio Button");
    }

    public void selectPrivacyButton() {
        clickOnElement(privacyPolicy);
        CustomListeners.test.log(Status.PASS,"select Privacy Button");
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"click On Continue Button");
    }

    public void setClickonElement() {
        clickOnElement(myAccount);
        CustomListeners.test.log(Status.PASS,"click on Element");
    }

    public void setClickcontinueButton() {
        clickOnElement(clickcontinueButton);
        CustomListeners.test.log(Status.PASS,"click on Button");
    }

    public void clickEmailAddress() {
        sendTextToElement(emailAddress, "bh234@gmail.com");
        CustomListeners.test.log(Status.PASS,"click on email");
    }

    public void clickpassword() {
        sendTextToElement(clickpassword, "123Prime");
        CustomListeners.test.log(Status.PASS,"click on password");
    }

    public void clickOnLoginButton() {
        clickOnElement(clicklogin);
        CustomListeners.test.log(Status.PASS,"click on loginButton");
    }

    public void clickOnMyAccount() {
        clickOnElement(clickMyAccount);
        CustomListeners.test.log(Status.PASS,"click on Account");
    }

    public void clickonLogOut() {
        clickOnElement(clickLogOut);
        CustomListeners.test.log(Status.PASS,"click on logout Button");
    }

    public void setClickCheckout() {
        clickOnElement(checkContinueButton);
        CustomListeners.test.log(Status.PASS,"  Click on  Checkout");
    }
}
