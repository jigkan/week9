package BrowserTest9;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest9 {
    static WebDriver driver;
    static String url="https://vbwholefoods.co.uk/";
    static String expectedTitle="Welcome to VB Wholefoods!";

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTtile=driver.getTitle();
        System.out.println("Title of page is" + actualTtile);
        Assert.assertTrue(expectedTitle.equals(actualTtile));
        driver.quit();
    }
}
