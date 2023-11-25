package pages.realtHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import pages.base_page.BasePage;

public class RealtHomePage extends BasePage {
    public RealtHomePage(WebDriver driver) {
        super(driver);
    }
    By countRooms= By.xpath("//select[@id='rooms']");
    By option2rooms=By.xpath("//select[@id='rooms']/option[@value='2']");
    By findButton=By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");

    public RealtHomePage enterCountRooms(){
        driver.findElement(countRooms).click();
        driver.findElement(option2rooms).click();
        return this;
    }
    public RealtHomePage clickToFind(){
        driver.findElement(findButton).click();
        return this;
    }

}
