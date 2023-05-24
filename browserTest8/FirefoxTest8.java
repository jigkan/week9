package browserTest8;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FirefoxTest8 {
    static WebDriver driver;
    static String url="http://www.valuewindows.co.uk/";
    static String expectedTitle="Welcome To Value Windows Limited : Value Windows Limited";

    public static void main(String[] args) {
        FirefoxOptions options=new FirefoxOptions();
        driver =new FirefoxDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle=driver.getTitle();
        System.out.println("Title od page" + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }

}
