package browserTest2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FirefoxTest2 {
    static WebDriver driver;
    static String url="https://opensource-demo.orangehrmlive.com/";
    static String expectedTitle="OrangeHRM";//expected title

    public static void main(String[] args) {
        FirefoxOptions options=new FirefoxOptions();
        driver=new FirefoxDriver(options);
        driver.get(url);//launch url
        driver.manage().window().maximize();//maximizing screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle=driver.getTitle();//gettig title of page
        System.out.println("Title of page is =" + actualTitle);
        driver.quit();//closing driver


    }
}
