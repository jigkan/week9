package browserTest8;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest8 {
    static WebDriver driver;
    static String url="http://www.valuewindows.co.uk/";
    static String expectedTitle="Welcome To Value Windows Limited : Value Windows Limited";

    public static void main(String[] args) {
        ChromeOptions options= new ChromeOptions();
        driver=new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle=driver.getTitle();
        System.out.println("Title of page is" + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }

}
