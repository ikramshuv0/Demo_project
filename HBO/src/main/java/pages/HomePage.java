//package pages;
//
//import base.CommonAPI;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class HomePage extends CommonAPI {
//    public WebDriver driver;
//
//    @FindBy(xpath = "//*[@id=\"page17387-band61927-Header61928\"]/div/div/div[2]/div/nav/a/img")
//    WebElement logo;
//
//    @FindBy(xpath = "//*[@id=\"page17387-band61927-Header61928\"]/div/div/div[2]/div/div/div[1]/a")
//    WebElement signIn;
//
//    @FindBy(xpath = "/html/head/title")
//    WebElement title;
//
//    @FindBy(xpath = "//*[@id=\"page17387-band61927-Header61928\"]/div/div/div[2]/div/nav/div/ul/li[1]/a")
//    WebElement Series;
//    @FindBy(xpath = "//*[@id=\"page17270-band59867-Header59868\"]/div/div/div[2]/div/nav/div/ul/li[2]/a")
//    WebElement movies;
//    @FindBy(xpath = "//*[@id=\"page17387-band61927-Header61928\"]/div/div/div[2]/div/nav/div/ul/li[3]/a")
//    WebElement docs;
//    @FindBy(xpath = "//*[@id=\"page17387-band61927-Header61928\"]/div/div/div[2]/div/nav/div/ul/li[4]/a")
//    WebElement HBOMax;
//    @FindBy(xpath = "//*[@id=\"page17387-band61927-Header61928\"]/div/div/div[2]/div/nav/div/ul/li[5]/a")
//    WebElement Podcast;
//    @FindBy(xpath = "//*[@id=\"page17387-band61927-Header61928\"]/div/div/div[2]/div/nav/div/ul/li[6]/a")
//    WebElement SCHEDULE;
//
//    @FindBy(xpath="//a[@class='navbar-brand']")
//    WebElement seriesTitle;
//
//    String titleofHBO ="HBO: Home to Groundbreaking Series, Movies, Comedies & Documentaries";
//
//    public WebElement verifySeries(){
//        Series.click();
//        String sTitle = seriesTitle.getText();
//        System.out.println(sTitle);
//        return Series;
//    }
//    public WebElement getTitleHBO(){
//       driver.getTitle();
//        return title;
//    }
//    public WebElement getLogo(){
//        logo.isDisplayed();
//    }
//
//    public WebElement getSignIn() {
//        signIn.click();
//        return signIn;
//    }
///*
//    public boolean isLogoDisplayed() {
//        return getLogo().isDisplayed();
//    } */
//
//
//}
