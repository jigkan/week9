package browserTest4;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest4 {
   static WebDriver driver;
   static String utl="https://www.saucedemo.com/";
   static String expectedTitle="Swag Labs";

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        driver=new ChromeDriver(options);
        driver.get("url");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle= driver.getTitle();
        System.out.println("Title of page is" + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

    }
}
