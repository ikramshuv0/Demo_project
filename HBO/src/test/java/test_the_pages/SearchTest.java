package test_the_pages;

import home.SearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchTest extends SearchPage {
    @Test
    public void testSearch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchTest pf = PageFactory.initElements(driver,SearchTest.class);
        pf.searchNames();
    }

}
