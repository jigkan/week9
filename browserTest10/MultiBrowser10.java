package browserTest10;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultiBrowser10 {
    static WebDriver driver;
    static String url="https://pizzavillage.uk/";
    static String expectedTtile="Pizza Village";
    static String browser="Firefox";

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            ChromeOptions options=new ChromeOptions();
            driver=new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("Firefox")) {
            FirefoxOptions options=new FirefoxOptions();
            driver=new FirefoxDriver(options);
        } else if (browser.equalsIgnoreCase("Edge")) {
            EdgeOptions options=new EdgeOptions();
            driver=new EdgeDriver(options);
            }else{
            System.out.println("Invalid browser");
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle=driver.getTitle();
        System.out.println("Title of page" + actualTitle);
        Assert.assertTrue(expectedTtile.equals(actualTitle));
        driver.quit();
    }
}
