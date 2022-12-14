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
    void locateEl(By element)
    {

        locateElement =driver.findElement(element);
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
    void loacateXpathLinkText(By element02) {
        locateElement=driver.findElement(element02);
    }

    //Click the located item
    void clickLocatedItem() {
         locateElement.click();
    }

    //Find or locate Add to Cart button/link
    void findAddToCartButton(By element03)
    {
          locateElement=driver.findElement(element03);
    }

    //***************************************************************************
    //** tried but unused methods and WebElements in the final version
   /*
   void searchxpathclass() {
        locateElement.findElement(new MyElements().element04);
    }
    void searchxpath() {
        locateElement.findElement(new MyElements().element05);
    }
    */
    //***************************************************************************

    void findGoToChart(By element06)
    {
        locateElement=driver.findElement(element06);
    }
    void findProceedToCheckoutButton(By element07)
    {
        locateElement=driver.findElement(element07);
    }
    void findMailBox(By element08)
    {
        locateElement=driver.findElement(element08);
    }
    void findContinue(By element09)
    {
        locateElement=driver.findElement(element09);
    }
    void findPassword(By element10)
    {
        locateElement=driver.findElement(element10);
    }
}
