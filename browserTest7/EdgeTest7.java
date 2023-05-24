package browserTest7;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTest7 {
    static WebDriver driver;
    static String url="";
    static String expectedTitle="";

    public static void main(String[] args) {
        EdgeOptions options=new EdgeOptions();
        driver=new EdgeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle = driver.getTitle();
        System.out.println("Title of page is " + actualTitle);
        Assert.assertTrue(expectedTitle.equals(actualTitle));
        driver.quit();

    }


}
