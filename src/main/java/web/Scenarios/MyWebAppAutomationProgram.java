package web.Scenarios;

import web.MyClassObjects;

public class MyWebAppAutomationProgram extends MyClassObjects
{
// This program automate:
// (i)   to open a web browser (Chrome) and go to an online shopping website (Amazon.com)
// (ii)  to find search box in the website and send a search item (Amazon kindle fire hd10)
// (iii) to click Enter key to search the item
// (iv)  to locate the web element of the desired item
// (v)   to find and click Add to Cart button/link
// (vi)  to proceed To Checkout Button
// (vii) to find email_textbox, send email to the email_textbox, and continue
// (viii)to Find password_textbox, send password to the password_textbox, and sign in


    public static void main(String[] args) throws InterruptedException {
        //STEP-1: Launch browser Chrome and go to amazon.com
        Method_Steps.launchChromeBrowser();

        //STEP-2: Locate WebElement search box in Amazon.com
        Method_Steps.searchTheItem();

        //STEP-3: Click Enter key to search the item
        Method_Steps.enter();

        //STEP-4: Locate the web element of the desired item
        Method_Steps.locateTheItemWebElement();

        //STEP-5: Find and click Add to Cart button/link
        Method_Steps.clickAddToCartButton();

        //STEP-6: Proceed To Checkout Button
        Method_Steps.proceedToCheckOut();

        //STEP-7: Find email_textbox, send email to the email_textbox, and continue
        Method_Steps.login_emailTextbox();

        //STEP-8: Find password_textbox, send password to the password_textbox, and sign in
        Method_Steps.login_passwordTextbox();
    }
}
