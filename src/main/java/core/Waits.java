package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

    private WebDriver driver;
    private WebDriverWait wait;

    public Waits(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void wait(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}

