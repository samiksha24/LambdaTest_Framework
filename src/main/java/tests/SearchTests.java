package tests;

import core.LaunchAndCloseBrowser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.SearchPage;

public class SearchTests extends LaunchAndCloseBrowser {

    WebDriver driver;

    @Test
    public void verifyLG(){

        new SearchPage(driver).enterLGWashingMachine("lg washing machine")
                .submitText()
                .selectLG()
                .getTextNames()
                .getTextPricesInDescendingOrder();
    }

    @Test
    public void verifySamsung(){

        new SearchPage(driver).enterLGWashingMachine("lg washing machine")
                .submitText()
                .selectSamsung()
                .getTextNames()
                .getTextPricesInDescendingOrder();
    }

}
