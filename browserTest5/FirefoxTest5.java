package browserTest5;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FirefoxTest5 {
    static WebDriver driver;
    static String url="https://courses.ultimateqa.com/";
    static String expextedTitl= "Ultimate QA";

    public static void main(String[] args) {
        FirefoxOptions options=new FirefoxOptions();
        driver=new FirefoxDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle=driver.getTitle();
        System.out.println("Title of page is " + actualTitle);
        Assert.assertTrue(expextedTitl.equals(actualTitle));
        driver.quit();

    }
}
