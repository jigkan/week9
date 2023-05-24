package browserTest2;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class MultiBrowserTesting2 {
    static WebDriver driver;
    static String browser="Firefox";
    static String expectedTitle= "OrangeHRM";//expected title

    static String url="https://opensource-demo.orangehrmlive.com/";

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")){
            ChromeOptions options=new ChromeOptions();
            driver=new ChromeDriver(options);
        }else if (browser.equalsIgnoreCase("fireFox")){
            FirefoxOptions options=new FirefoxOptions();
            driver=new FirefoxDriver(options);
        } else if (browser.equalsIgnoreCase("edge")) {
            EdgeOptions options=new EdgeOptions();
            driver=new EdgeDriver(options);

        }else {
            System.out.println("invalid browser");
        }

        driver.get(url);//launch url
        driver.manage().window().maximize();//maximising screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle=driver.getTitle();//getting title of page
        System.out.println("Title of page is" + actualTitle);//printing title of page
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();




    }

}
