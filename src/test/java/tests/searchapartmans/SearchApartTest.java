package tests.searchapartmans;

import org.testng.annotations.Test;
import tests.basetest.BaseTest;
@Test(invocationCount = 2)//коол выполнений
public class SearchApartTest extends BaseTest {

    public void checkIsRederectToListing(){
        basePage.open("https://realt.by/");
        //switchWindow();
        realtHomePage
                .enterCountRooms()
                .clickToFind();
        realtListingPage
                .checkCountCards();
    }

}
