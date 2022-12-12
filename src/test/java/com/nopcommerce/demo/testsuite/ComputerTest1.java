package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.ComputerPage1;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class ComputerTest1 extends BaseTest {

    ComputerPage1 computerPage1;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        computerPage1 = new ComputerPage1();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computerPage1.clickOnComputer();
        computerPage1.clickOnDesktop();
        computerPage1.getSelectByValue("5");
        computerPage1.clickOnAddToCart();
        Assert.assertEquals(computerPage1.getVerifyBuildYourOwn(), "Build your own computer", "Error message not displayed");

        computerPage1.selectProcessorByValue("1");
        computerPage1.selectRamByValue("5");
        computerPage1.clickOnHDD400GB();
        computerPage1.clickOnOsVistaPremium();
        computerPage1.clickOnSoftwareTotalCommander();
        //Assert.assertEquals(computer.verifyTotalPrice(), "$1,475.00", "Error message not displayed");

        computerPage1.clickOnAddToCartButton();
        Assert.assertEquals(computerPage1.verifyCaryMessage(), "The product has been added to your shopping cart", "Error message not displayed");

        computerPage1.closeMessageBar();
        //Assert.assertEquals(getTextFormAlert(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]"),"");
        computerPage1.mouseHoverOnElementShoppingCart();
        computerPage1.clickOnGoToCart();
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]")), "Shopping cart");
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'Shopping cart')]")), "Shopping cart");
        computerPage1.clearTextInQuantityField();
        computerPage1.sendTextToQuantityField();
        computerPage1.clickOnUpdateShoppingCartButton();
        //Assert.assertEquals(getTextFromElement(By.xpath("//tbody/tr[1]/td[6]/span[1]")), "$2,950.00");
        computerPage1.clickOnCheckBoxIAgreeWithTermsAndCondition();
        computerPage1.clickOnCheckOutButton();
        Assert.assertEquals(getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]")), "Welcome, Please Sign In!");
        computerPage1.clickOnCheckOutAsGuest();
        computerPage1.sendTextToFirstNameField("Manan");
        computerPage1.sendTextToLastNameField("Shah");
        computerPage1.sendTextToEmailField("test2219@gmail.com");
        computerPage1.sendTextToCompanyField("Password34");
        computerPage1.selectCountryFromDropDownList();
        computerPage1.sendTextToCityField("London");
        computerPage1.sendTextToAddressLine1("Luton Road");
        computerPage1.sendTextToAddressLine2("Luton");
        computerPage1.sendTextToPostcode("HA9 9AU");
        computerPage1.sendTextToPhoneNumberField("02034343876");
        computerPage1.clickOnContinueButton();
        computerPage1.clickOnNextDayAirButton();
        computerPage1.clickOnContinueButtonAgain();
        computerPage1.clickOnCreditCardButton();
        computerPage1.selectClickOnContinue1();
        computerPage1.selectMasterCardFromCreditCardDropdown("MasterCard");
        computerPage1.sendTextTOCardHolderName("M shah");
        computerPage1.sendTextTOCardNumber("1111222233334444");
        computerPage1.selectMonthAndYearForCreditCardExpireData();
        computerPage1.sendTextToCardCode("486");
        computerPage1.clickOnContinueButton2();
        Thread.sleep(2000);
        Assert.assertEquals(computerPage1.getVerifyText1(), "Credit Card", "Error Message not displayed");
        Assert.assertEquals(computerPage1.getVerifyText2(), "Next Day Air", "Error Message not displayed");
        //Assert.assertEquals(computerPage1.getVerifyText3(), "$2,950.00", "Error Message not displayed");
        computerPage1.clickOnConformButton();
        Assert.assertEquals(computerPage1.getVerifyText4(), "Checkout", "Error Message not displayed");
        Assert.assertEquals(computerPage1.getVerifyText5(), "Your order has been successfully processed!", "Error Message not displayed");
        computerPage1.clickOnContinueButton3();
        Thread.sleep(2000);
        //Assert.assertEquals(computerPage1.getVerifyText3(), "Welcome to our store", "Error Message not displayed");
    }
}
