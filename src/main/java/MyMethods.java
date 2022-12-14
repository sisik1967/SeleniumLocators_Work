import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class MyMethods extends Driver{
    public static WebElement locateElement;

    //launch browser Chrome and go to amazon.com, then maximize the browser window.
   void launchBrowser(String url)  {
        driver.get(url);
        driver.manage().window().maximize();

    }

    // Locate WebElement search box in Amazon.com
    void locateEl(String searchbox)
    {
        locateElement =driver.findElement(By.id(searchbox));
    }

    //Send searchItem (16TB External Hard Drive SSD) to Search Box in Amazon.com
    void searchElement(String searchItem)
    {
        locateElement.sendKeys(searchItem);//initializing
    }

    //Click Enter key to search the item
    void enterKey()
    {
        locateElement.sendKeys(Keys.ENTER);
    }

    //Locate the xpath link text to select the desired item
    void loacateXpathLinkText(String xpathLinkText) {
        locateElement=driver.findElement(By.xpath(xpathLinkText));
    }

    //Click the located item
    void clickLocatedItem() {
         locateElement.click();
    }

    //Find or locate Add to Cart button/link
    void findAddToCartButton(String xpathLinkText)
    {
          locateElement=driver.findElement(By.xpath(xpathLinkText));
    }

    //***************************************************************************
    //** tried but unused methods and WebElements in the final version
    void searchxpathclass() {
        locateElement.findElement(By.className("a-size-medium a-color-base a-text-normal"));
    }
    void searchxpath() {
        locateElement.findElement(By.xpath("//span[@class='a-button-text' and @id='submit.add-to-cart-announce']"));
    }
    //***************************************************************************

}
