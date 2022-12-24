package web.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
import static web.Driver.getDriver;

public class MyWebElements
{


    static public WebElement searchBar_textBox;
    static public WebElement locateTheItem;
    static public WebElement addToCart_button;
    static public WebElement PopupClose_button;
    static public WebElement proceedToCheckOutButton;
    static public WebElement login_emailTextbox;
    static public WebElement login_passwordTextbox;

    public static WebElement getWebElement(String webElement) throws MyWebElementNameIsWrongException {

        WebElement element=null;

        switch (webElement) {
            case "searchBar_textBox":
                element=getDriver().findElement(By.id("twotabsearchtextbox"));
                element=getDriver().findElement(By.cssSelector("input#twotabsearchtextbox"));
                element=getDriver().findElement(By.cssSelector("input.nav-input[name='field-keywords']"));
                //element=getDriver().findElement(By.cssSelector("input[dir='auto']"));
               // element=getDriver().findElement(By.cssSelector("input[class^='nav-input']"));
                element=getDriver().findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
                element=getDriver().findElement(By.xpath("//input[@name='field-keywords']"));
                break;
            case "locateTheItem":
                element=getDriver().findElement(By.xpath("//*[@id='search']/div/div/div/span/div/div[2]/div/div/div/div/div/div[2]/div/div/div/h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']/a"));
                element=getDriver().findElement(By.xpath("//*[@id='search']/div/div/div/span/div/div[2]/div/div/div/div/div/div[2]/div/div/div/h2/a"));
                element=getDriver().findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]"));
                element=getDriver().findElement(By.xpath("//*[@id='search']/div/div/div/span/div/div[2]/div/div/div/div/div/div[2]/div/div/div/h2"));
                element=getDriver().findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]/a"));
                //element=getDriver().findElement(By.cssSelector("(//div[@class='a-section a-spacing-none s-result-item s-flex-full-width s-widget s-widget-spacing-large'])[1]"));
                // element=getDriver().findElement(By.cssSelector("a[class$='a-text-normal'][href^='/Fire-HD-10-tablet/dp/B08BX8CW9V/ref=sr_1_1?crid=1P0UR27LL7OUD&keywords=kindle+fire&qid=1671916284&sprefix=kin%2Caps%2C103&sr=8-1']"));
                //  element=getDriver().findElement(By.xpath("body > div:nth-child(1) > div:nth-child(30) > div:nth-child(11) > div:nth-child(1) > div:nth-child(1) > span:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)"));

                break;
            case "addToCart_button":
                element=getDriver().findElement(By.xpath("//span[@class='a-declarative']//input[@value='Add to Cart']"));
                element=getDriver().findElement(By.cssSelector("[name='submit.add-to-cart']"));
                element=getDriver().findElement(By.id("add-to-cart-button"));
                element=getDriver().findElement(By.cssSelector("input[data-hover$='Cart']"));
                element=getDriver().findElement(By.xpath("(//input[@type='submit'])[2]"));
                break;
            case "proceedToCheckOutButton":
                element= getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/div[2]/div/div[3]/div/div/form/span/span/span/input"));
                element= getDriver().findElement(By.name("proceedToRetailCheckout"));
                element= getDriver().findElement(By.cssSelector("input.a-button-input[type='submit'][aria-labelledby='sc-buy-box-ptc-button-announce']"));
                element= getDriver().findElement(By.xpath("//input[@value='Proceed to checkout']"));
                element= getDriver().findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"));
                break;
            case "PopupClose_button":
                element=getDriver().findElement(By.cssSelector("span[class='a-button a-button-base abb-intl-decline']"));
                element=getDriver().findElement(By.cssSelector("button[data-action='a-popover-close']"));
                element=getDriver().findElement(By.xpath("//span[@class='a-button a-button-base abb-intl-decline']//span[@class='a-button-inner']"));
                element=getDriver().findElement(By.cssSelector("i[class='a-icon a-icon-close']"));
                element=getDriver().findElement(By.cssSelector("button[aria-label='Close']"));


                break;
            case "login_emailTextbox":
                element=getDriver().findElement(By.id("ap_email"));
                element=getDriver().findElement(By.xpath("//*[@id='ap_email']"));
                element=getDriver().findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]"));
                element=getDriver().findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div//div/div[1]/input[1]"));
                element=getDriver().findElement(By.cssSelector("input[type=email]"));
                break;
            case "login_emailTextbox_continue"://////////////////////
                element=getDriver().findElement(By.cssSelector("span#continue"));
                element=getDriver().findElement(By.xpath("//span[@id='continue']"));
                element=getDriver().findElement(By.cssSelector("input[aria-labelledby='continue-announce'"));
                element=getDriver().findElement(with(By.id("continue")).below(By.id("ap_email")));
                element=getDriver().findElement(By.cssSelector("input[type='submit']"));
                break;
            case "login_passwordTextbox":
                element=getDriver().findElement(By.cssSelector("input#ap_password"));
                element=getDriver().findElement(By.xpath("//div/div/div/div/div/div/form/div/div[1]/input"));
                element=getDriver().findElement(By.xpath("//form/div/div[1]/input"));
                element=getDriver().findElement(By.xpath("//div/div/div/div/div/div/form/div/div[1]/input[@id='ap_password']"));
                element=getDriver().findElement(By.id("ap_password"));
                break;
           case "signInButton":
               element=getDriver().findElement(By.cssSelector("input.a-button-input[type='submit'][aria-labelledby='auth-signin-button-announce']"));
               element=getDriver().findElement(By.xpath("//div/div/div/div/div/div/form/div/div[2]/span/span/input[@id='signInSubmit']"));
               element=getDriver().findElement(By.xpath("//span/span/input[@id='signInSubmit']"));
               element=getDriver().findElement(By.className("a-button-input"));
               element=getDriver().findElement(By.id("signInSubmit"));
               break;
            default:
                throw new MyWebElementNameIsWrongException("Given String parameter is wrong!");
        }

        return element;
    }


}

