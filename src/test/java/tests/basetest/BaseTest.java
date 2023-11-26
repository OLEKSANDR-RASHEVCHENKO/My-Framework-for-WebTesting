package tests.basetest;

import common.CommonAction;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import pages.base_page.BasePage;
import pages.listing.RealtListingPage;
import pages.realtHome.RealtHomePage;

import java.util.Set;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
    protected RealtListingPage realtListingPage=new RealtListingPage(driver);


    WebDriverWait wait = new WebDriverWait(driver,10);

    protected void alert(){
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert();
        alert.accept();////всплывающие окна
    }
    @AfterSuite(alwaysRun = true)
    public void quite(){
        driver.quit();
    }

//     protected void switchWindow(){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        String window1 = driver.getWindowHandle();
//        js.executeScript("window.open()");
//
//        Set<String> currentWindows = driver.getWindowHandles();
//        String window2 = null;
//        for (String window:currentWindows){
//            if(!window.equals(window1)){
//                window2=window;
//                break;
//            }
//        }
//        driver.switchTo().window(window2);
//
//    }
}
