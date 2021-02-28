package pages;

import core.ActionDrivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchPage extends ActionDrivers {
    WebDriver driver;
    String search = "twotabsearchtextbox";
    String lg = "//span[text()='LG']";
    String names = "//span[@class='a-size-medium a-color-base a-text-normal']";
    String prices = "//span[@class='a-price-whole']";
    String samsung = "//span[text()='Samsung']";

    public SearchPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public SearchPage enterLGWashingMachine(String value){
        type(By.id(search), value);
        return this;
    }

    public SearchPage submitText(){
        submit(By.id(search));
        return this;
    }

    public SearchPage selectLG(){
        click(By.xpath(lg));
        return this;
    }

    public SearchPage selectSamsung(){
        click(By.xpath(samsung));
        return this;
    }

    public SearchPage getTextNames(){
        List<WebElement> elements = driver.findElements(By.xpath(names));
        for (WebElement val: elements){
            String str = val.getText();
            System.out.println(str);
        }
        return this;
    }

    public SearchPage getTextPricesInDescendingOrder(){
        int num;
        List<Integer> intArr = new ArrayList<>();
        List<WebElement> elements = driver.findElements(By.xpath(prices));
        for (WebElement val: elements){
            String str = val.getText();
            num = Integer.parseInt(str);
            intArr.add(num);
        }

        Collections.sort(intArr, Collections.reverseOrder());
        return this;
    }

}
