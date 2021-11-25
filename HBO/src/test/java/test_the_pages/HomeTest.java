package test_the_pages;

import home.HomePage;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomeTest extends HomePage {
    @Test(enabled = true)
    public void testHome(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickSearch();
        putNames();
    }
    @Test(enabled = true)
    public void testHomeTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        chekHomeTabElements();
    }
    @Test (enabled = false)
    public void testPlayTrailer() {
        playTrailer();

    }
}