package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionDrivers extends Waits{
    private  WebDriverWait wait;
    private WebDriver driver;

    public ActionDrivers(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void click(By locator){
        wait(locator);
        driver.findElement(locator).click();
    }

    public void type(By locator, String value){
        wait(locator);
        driver.findElement(locator).sendKeys(value);
    }

    public String getText(By locator){
        wait(locator);
        return driver.findElement(locator).getText();
    }

    public void submit(By locator){
        wait(locator);
        driver.findElement(locator).submit();
    }

}
