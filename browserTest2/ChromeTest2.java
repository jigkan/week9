package browserTest2;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeTest2 {
    static WebDriver driver;
    static String url="https://opensource-demo.orangehrmlive.com/";
    static String expectedTitle="OrangeHRM";//expected title

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();//setting webdriver
        driver=new ChromeDriver(options);
        driver.get(url);//launch url
        driver.manage().window().maximize();//maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualtitle=driver.getTitle();
        System.out.println("Title of page is :" + actualtitle);//printing title of page
        Assert.assertTrue(expectedTitle.equals(actualtitle));
        driver.quit();//closing driver

    }
}
