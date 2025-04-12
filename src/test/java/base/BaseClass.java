package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.PropertyUtility;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public WebDriver driver;
    public static Properties prop;

    @BeforeClass
    public void setup() throws IOException {
        System.out.println("**********SET-UP**********");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        new PropertyUtility();
        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }
    @AfterClass
    public void teardown(){
        System.out.println("**********TEAR-DOWN***********");
        driver.quit();
    }

}
