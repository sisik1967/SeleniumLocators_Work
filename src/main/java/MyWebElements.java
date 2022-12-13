import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyWebElements extends Driver{
    public static WebElement locateElement;

    void locateEl()
    {
        locateElement =driver.findElement(By.id("twotabsearchtextbox"));
    }
    void searchElement()
    {
        locateElement.sendKeys("16TB External Hard Drive SSD");//initializing
    }
    void enterKey()
    {
        locateElement.sendKeys(Keys.ENTER);
    }
    void searchpartialLinkText() {
        locateElement.findElement(By.partialLinkText("16TB External Hard Drive"));
    }

    void searchxpath1() {
        locateElement=driver.findElement(By.xpath("//div[@data-asin='B0BPBZQZ65']//h2/a[contains(@class, 'a-link-normal')]"));
        locateElement.click();

    }
    void searchxpathclass() {
        locateElement.findElement(By.className("a-size-medium a-color-base a-text-normal"));
    }

    void searchxpath() {
        locateElement.findElement(By.xpath("//span[@class='a-button-text' and @id='submit.add-to-cart-announce']"));
    }
    void actionToPerform()
    {
        //WebElement button1=driver.findElement(By.xpath("//span[@class='a-button-text' and @id='submit.add-to-cart-announce']"));
        locateElement=driver.findElement(By.xpath("//span[@class='a-declarative']//span[@id='submit.add-to-cart']"));
        locateElement.click();
       // Actions actions = new Actions(driver);
       // actions.doubleClick(button1);
    }
/*
    launchBrowser("https://www.amazon.com");
    //launchChrome(),
    //goToURL("https://www.google.com/");
    MyWebElements elementActions = new MyWebElements();
        elementActions.locateEl();
        elementActions.searchElement();
        elementActions.enterKey();

    */
}
