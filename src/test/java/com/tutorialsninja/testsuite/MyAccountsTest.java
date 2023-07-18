package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.myaccounts.MyAccounts;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountsTest extends BaseTest {
    MyAccounts account = new MyAccounts();

    @BeforeMethod(groups = {"sanity","smoke","regrassion"})
    public void inIT(){


    }

    @Test(groups = {"sanity", "regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        account.clickMyAcount();
        account.clickOnRegister();
        String actualRegister = "Register Account";
        String expectedRegister = getTextFromElement(By.xpath("//h1[contains(text(),'Register Account')]"));
        Assert.assertEquals(actualRegister, expectedRegister, "Register page Dispaly");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        account.clickMyAcount();
        account.clickOnLogin();
        String actualReturning = "Returning Customer";
        String expectedReturning = getTextFromElement(By.xpath("//h2[contains(text(),'Returning Customer')]"));
        Assert.assertEquals(actualReturning, expectedReturning, "Returning is not Display");
    }

    @Test(groups = {"smoke", "regression"})
    public void verifyThatUserRegisterAccountSuccessfully() {
        account.clickMyAcount();
        account.clickOnRegister();
        account.enterFirstname( "Surya");
        account.enterLastName("Patel");
        account.enteremail("bhg1234@gmail.com");
        account.enterTelephone("020345678912");
        account.enterPassword("1234prime");
        account.enterConformPassword( "1234prime");
        account.clickRadioButton();
        account.selectPrivacyButton();
        String actualverifyMessage = "Your Account Has Been Created!";
        String expectedVerifyMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]"));
        Assert.assertEquals(actualverifyMessage, expectedVerifyMessage, "Your Account Has Been Created");
        account.clickOnContinueButton();
        account.setClickonElement();
        String actualMessage = "Account Logout";
        String expectedMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Account Logout')]"));
        Assert.assertEquals(actualMessage, expectedMessage, "Account LogOut");
        account.setClickcontinueButton();

    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        account.clickMyAcount();
        account.clickOnLogin();
        account.clickEmailAddress();
        account.clickpassword();
        account.clickOnLoginButton();
        account.clickOnMyAccount();

        String actualMessage = "Account Logout";
        String expectedMesage = getTextFromElement(By.xpath("//h1[contains(text(),'Account Logout')]"));
        Assert.assertEquals(actualMessage, expectedMesage, "Not logged out");
        account.clickonLogOut();
        account.setClickCheckout();

    }
}
