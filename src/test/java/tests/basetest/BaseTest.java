package tests.basetest;

import common.CommonAction;
import org.openqa.selenium.WebDriver;
import pages.base_page.BasePage;
import pages.realtHome.RealtHomePage;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RealtHomePage realtHomePage = new RealtHomePage(driver);
}
