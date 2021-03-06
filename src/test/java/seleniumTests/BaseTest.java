package seleniumTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    WebDriver driver;

    @BeforeTest
    public void beforeT() {

        System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
        ChromeOptions op = new ChromeOptions();
        //   DesiredCapabilities dc = DesiredCapabilities.chrome();
        // dc.setCapability(ChromeOptions.CAPABILITY, op);
        // driver = new ChromeDriver();

        //  op.setCapability("version", "selenoid_buharova");

        URL hub = null;

        try {
            hub = new URL("http://localhost:4445/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver = new RemoteWebDriver(hub, op);

    }

    @AfterTest
    public void afterTest() {
        driver.quit();
        if(driver!=null){
            driver.quit();
        }
    }
    public WebDriver getDriver(){
        return driver;
    }

}
