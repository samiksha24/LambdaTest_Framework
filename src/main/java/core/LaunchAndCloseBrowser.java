package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchAndCloseBrowser {

    public WebDriver driver;
    String url = "https://www.amazon.in";

    @BeforeMethod
    public void setupTest(){

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

}
