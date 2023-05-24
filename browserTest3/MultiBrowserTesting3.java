package browserTest3;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultiBrowserTesting3 {
    static WebDriver driver;
    static String browser ="Firefox";
    static String url="http://the-internet.herokuapp.com/";
    static String expectedTitle="The Internet";


    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            ChromeOptions options=new ChromeOptions();
            driver=new ChromeDriver(options);
            } else if (browser.equalsIgnoreCase("Firefox")) {
            FirefoxOptions options=new FirefoxOptions();
            driver=new FirefoxDriver(options);
        } else if (browser.equalsIgnoreCase("Edge")) {
            EdgeOptions options=new EdgeOptions();
            driver=new EdgeDriver(options);
        }
        else {
            System.out.println("invalid browser");
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle=driver.getTitle();
        System.out.println("Title of page is" + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
