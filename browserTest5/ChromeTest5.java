package browserTest5;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest5 {
    static WebDriver driver;
    static String url="https://courses.ultimateqa.com/";
    static String expectedTitle="Ultimate QA";

    public static void main(String[] args) {
        ChromeOptions option=new ChromeOptions();
        driver=new ChromeDriver(option);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle =driver.getTitle();
        System.out.println("Title of page is:" +actualTitle );
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();
    }

}
