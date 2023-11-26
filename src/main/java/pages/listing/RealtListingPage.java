package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.base_page.BasePage;
import pages.realtHome.RealtHomePage;

public class RealtListingPage extends BasePage {
    public RealtListingPage(WebDriver driver) {
        super(driver);
    }
    private final By card = By.xpath("//div[@class='listing view-format']//div[@data-mode='3']");

    public RealtListingPage checkCountCards(){
        waitElementIsVisible(driver.findElement(card));
        int countCard = driver.findElements(card).size();
        Assert.assertEquals(countCard,20);
        return this;
    }
}
