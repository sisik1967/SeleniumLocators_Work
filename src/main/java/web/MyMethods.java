package web;

import org.openqa.selenium.*;

import static web.Driver.getDriver;
import static web.WebElements.MyWebElements.*;


public class MyMethods extends MyClassObjects {


    //**********************************************************************************
    //STEP-1: Launch browser Chrome and go to amazon.com
    //**********************************************************************************
    public void launchChromeBrowser() {
        try {
            System.out.println("STEP-1: launchChromeBrowser has been initialized!");
            getDriver().get(Constants.URL);
            System.out.println("STEP-1: launchChromeBrowser has done!");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("STEP-1: Error occurred!");

        }
    }

    //**********************************************************************************
    ////STEP-2: Locate WebElement search box in Amazon.com
    //**********************************************************************************
    public void searchTheItem() {
        try {
            System.out.println("STEP-2: searchTheItem has been initialized!");

            (searchBar_textBox = getWebElement("searchBar_textBox")).sendKeys(Constants.SEARCHITEM);
            System.out.println("STEP-2: searchTheItem has done!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("STEP-2: Error occurred!");
        }
    }
    //**********************************************************************************
    //STEP-3: Click Enter key to search the item
    //**********************************************************************************
    public void enter(){
        try {
            System.out.println("STEP-3: enter has been initialized!");
            searchBar_textBox.sendKeys(Keys.ENTER);
            System.out.println("STEP-3: enter has ben done!");
        } catch (Exception e){
            System.out.println("STEP-3: Error occurred!");
        }
    }
    //**********************************************************************************
    //STEP-4: Locate the web element of the desired item
    //**********************************************************************************
    public void locateTheItemWebElement(){
        try {
            System.out.println("STEP-4: The WebElement of the selected item will be located.");
            waitUtil.webDriverWait(locateTheItem=getWebElement("locateTheItem"),"visibility");//Implicitly wait

            locateTheItem.click();
            System.out.println("STEP-4: The WebElement of the selected item has been located.");
        } catch (Exception e){
            System.out.println("STEP-4: Error occurred in the Item locating!");
        }
    }
    //**********************************************************************************
    //STEP-5: Find and click Add to Cart button/link
    //**********************************************************************************
    public  void clickAddToCartButton() {
        try {
            System.out.println("STEP-5: clickAddToCartButton- initialized!");

            waitUtil.webDriverWait(addToCart_button=getWebElement("addToCart_button"),"clickability");//Implicitly wait
            addToCart_button.click();
            System.out.println("STEP-5: clickAddToCartButton has done!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("STEP-5: Error occurred!");
        }
    }
    //**********************************************************************************
    //STEP-6: Proceed To Checkout Button
    //**********************************************************************************
    public void proceedToCheckOut() {
        try {
             try {
               //Close poup window
               waitUtil.webDriverWait(PopupClose_button = getWebElement("PopupClose_button"), "visibility");//Implicitly wait
               PopupClose_button.click();

           } catch (NoSuchElementException e){
               System.out.println("No Popup Window, Continue!");
           }

            System.out.println("STEP-6: proceedToCheckOut initialized!");

            waitUtil.webDriverWait("","");//Implicitly wait
            (proceedToCheckOutButton=getWebElement("proceedToCheckOutButton")).click();

            System.out.println("STEP-6: proceedToCheckOut has done!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("STEP-6: Error occurred!");
        }
    }

    //**********************************************************************************
    //STEP-7: Find email_textbox, send email to the email_textbox, and continue
    //**********************************************************************************
    public void login_emailTextbox() {
        try {
            System.out.println("STEP-7: putMyCredentialsToLogin has been initialized!");

            (login_emailTextbox = getWebElement("login_emailTextbox")).sendKeys(Constants.EMAIL);
            getWebElement("login_emailTextbox_continue").click();

            System.out.println("STEP-7: putMyCredentialsToLogin has done!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("STEP-7: Error occurred!");

        }
    }
    //**********************************************************************************
    //STEP-8: Find password_textbox, send password to the password_textbox, and sign in
    //**********************************************************************************
        public void login_passwordTextbox() {
            try {
                System.out.println("STEP-8: login_passwordTextbox has been initialized!");

                (login_passwordTextbox = getWebElement("login_passwordTextbox")).sendKeys(Constants.PASSWORD);
                getWebElement("signInButton").click();

                System.out.println("STEP-8: login_passwordTextbox has done!");

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("STEP-8: Error occurred!");

            }
        }

}



