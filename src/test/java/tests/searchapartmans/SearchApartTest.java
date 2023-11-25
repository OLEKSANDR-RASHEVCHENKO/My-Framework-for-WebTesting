package tests.searchapartmans;

import org.testng.annotations.Test;
import tests.basetest.BaseTest;

public class SearchApartTest extends BaseTest {

    public void checkIsRederectToListing(){
        basePage.open("https://realt.by/");
        realtHomePage
                .enterCountRooms()
                .clickToFind();
    }

}
