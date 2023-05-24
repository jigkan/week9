package browserTest5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class EdgeTest5 {
    static WebDriver driver;
    static String url="https://courses.ultimateqa.com/";
    static String expectedTitle="Ultimate QA";

    public static void main(String[] args) {
        EdgeOptions options = new EdgeOptions();
        driver=new EdgeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        String actualTitle=driver.getTitle();
        System.out.println("Title of this page" + actualTitle);
        driver.quit();
    }
}
