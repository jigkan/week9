package browserTest4;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FirefoxTest4 {
    static WebDriver driver;
    static String url="https://www.saucedemo.com/";
    static String expectedTitle="Swag Labs";

    public static void main(String[] args) {
        FirefoxOptions options=new FirefoxOptions();
        driver=new FirefoxDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle=driver.getTitle();
        System.out.println("Tile of page is : " + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
