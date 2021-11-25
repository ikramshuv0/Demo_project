//package test_the_pages;
//
//import base.CommonAPI;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.HomePage;
//
//public class LogoTest extends CommonAPI {
//    LogoTest homePage = PageFactory.initElements(driver, LogoTest.class);
//
//    @Test()
//    public void LogoTest() throws InterruptedException {
//        Assert.assertTrue(homePage.getLogo().isDisplayed());
//    }
//
//    private WebElement getLogo() {
//        return LogoTest
//
//    @Test
//    public void VerifyTitleTest(){
//       String title = driver.getTitle();
//       System.out.println(title);
//       Assert.assertEquals(title,"HBO: Home to Groundbreaking Series, Movies, Comedies & Documentaries");
//    }
//
//    @Test
//    public void verifyTitleTest2(){
//        Assert.assertEquals(homePage.getTitleHBO(),"HBO: Home to Groundbreaking Series, Movies, Comedies & Documentaries");
//    }
//
//    @Test
//    public void seriesTitle(){
//        Assert.assertEquals(homePage.verifySeries(),"Series");
//    }
//}
