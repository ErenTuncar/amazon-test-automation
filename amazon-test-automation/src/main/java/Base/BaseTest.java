package Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTest extends BaseLib{

    public static WebDriver driver;

    @BeforeMethod
    public void BeforeTest(){

        if(browser.equals("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equals("Firefox")){
            driver = new FirefoxDriver();
        }else if(browser.equals("Edge")){
            driver = new EdgeDriver();
        }else if(browser.equals("Safari")){
            driver = new SafariDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://www.amazon.com.tr");

    }


   @AfterMethod
    public void afterTest(){

        driver.quit();
    }
}

