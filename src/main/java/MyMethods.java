import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyMethods extends MyWebElements {
    //public WebElement locateElement;
    public static void main(String[] args) throws InterruptedException {
        //locateElement.click();

        launchBrowser("https://www.amazon.com");
        //launchChrome(),
        //goToURL("https://www.google.com/");
        MyWebElements elementActions = new MyWebElements();
       // Thread.sleep(1000);
        elementActions.locateEl();
       // Thread.sleep(1000);
        elementActions.searchElement();
        //Thread.sleep(1000);
        elementActions.enterKey();
        //Thread.sleep(1000);

        //elementActions.searchpartialLinkText();
        Thread.sleep(1000);
        elementActions.searchxpath1();
        //elementActions.searchxpathclass();
        Thread.sleep(1000);
        //elementActions.enterKey();
        Thread.sleep(1000);
        elementActions.actionToPerform();

/*
        //  WebElement searchEngine =Driver.driver.findElement(By.id("twotabsearchtextbox"));
     //   searchEngine.sendKeys("16TB External Hard Drive SSD");//initializing
      //  searchEngine.sendKeys(Keys.ENTER);
       WebElement searchEngine1= Driver.driver.findElement(By.partialLinkText("16TB External Hard Drive SSD"));

        searchEngine1.sendKeys(Keys.ENTER);

        Actions actions = new Actions(Driver.driver);
//        WebElement buttons1 = Driver.driver.findElement(By.xpath("//*[@id='add-to-cart-button' and @type='submit']"));
        WebElement buttons1 = Driver.driver.findElement(By.xpath("//span[@class='a-button-text' and @id='submit.add-to-cart-announce']"));

        actions.doubleClick(buttons1);
        //actions.sendKeys(buttons1);
        //buttons1.sendKeys(Keys.ENTER);

        //driver.findElement(By.className("twotabsearchtextbox")).sendKeys("16TB External Hard Drive SSD");//initializing
// clickElement()
        //actionToPerform()
        // clickElement()
        // sendKeysToTextBox()
*/
    }



    private static void launchBrowser(String url)  {
        driver.get(url);
        driver.manage().window().maximize();

    }

}
