package browserTest3;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest3 {
    static WebDriver driver;
    static String url="http://the-internet.herokuapp.com/";
    static String expectedTitle="The Internet";//expected title

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        driver= new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle=driver.getTitle();
        System.out.println("Titl of the page" + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }
}
