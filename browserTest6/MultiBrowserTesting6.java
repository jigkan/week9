package browserTest6;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultiBrowserTesting6 {
    static String browser = "Firefox";
    static WebDriver driver;
    static String url = "https://www.fresha.com/lp/en/bt/beauty-salons ";
    static String expectedTitle = "Beauty Salons near me | Fresha ";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("chorme")) {
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("Firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);
        } else {
            System.out.println("Invalid browser");
        }
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle=driver.getTitle();
        System.out.println("Title of page" + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

    }
}
