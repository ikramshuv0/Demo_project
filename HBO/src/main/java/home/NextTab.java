package home;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import reporting.TestLogger;

public class NextTab extends CommonAPI {
    public void clickOnLink(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickByXpath("//a[@title='Facebook']");
    }

    private void clickByXpath(String s) {
    }

    public WebDriver nextTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        handleNewTab(driver);
        clickByXpath("//iframe[@title='Twitter settings iframe']");
        return driver;
        //a[@href='https://hbocareers.com/']
    }
}
