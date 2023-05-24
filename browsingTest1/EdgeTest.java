package browsingTest1;

import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTest {
    static WebDriver driver;
    static String url="https://demo.nopcommerce.com/";
    static String expectedtitle="nopCommerce demo store"; // expected title

    public static void main(String[] args) {
        EdgeOptions options=new EdgeOptions();
        driver=new EdgeDriver(options);
        driver.get(url);//launch url
        driver.manage().window().maximize();//maximisin screen
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));//giving wait
        String actualTitle=driver.getTitle();//getting title of page
        Assert.assertTrue(expectedtitle.equals(actualTitle));
        driver.quit();//closing driver
    }
}
