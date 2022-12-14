import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class Driver {
    public static WebDriver driver =new ChromeDriver();
    //public static WebDriver driver =new FirefoxDriver();
    //public static WebDriver driver =new EdgeDriver();
}
