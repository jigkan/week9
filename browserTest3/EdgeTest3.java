package browserTest3;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTest3 {
  static WebDriver driver;
  static String url="http://the-internet.herokuapp.com/";
  static String expectedTitle="The Internet";


    public static void main(String[] args) {
        EdgeOptions options=new EdgeOptions();
        driver=new EdgeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle=driver.getTitle();
        System.out.println("Title of page is " + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();


    }
}
