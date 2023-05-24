package browsingTest1;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FirefoxTest1 {
    static WebDriver driver;
    static String url="https://demo.nopcommerce.com/";
    static  String expectedTitle="nopCommerce demo store"; // expected title

    public static void main(String[] args) {
        FirefoxOptions option=new FirefoxOptions();
        driver=new FirefoxDriver(option);
        driver.get(url);
        driver.manage().window().maximize();//maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle=driver.getTitle();//gettig title of page
        System.out.println("Tile of page is : " + actualTitle); //printing title of page
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit(); // closing driver
    }
}
