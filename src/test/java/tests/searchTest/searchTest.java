package tests.searchTest;

import BasePackage.BaseTest;
import Pages.Home.homePage;
import Pages.SearchResults.searchPage;
import Utilities.TimeUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class searchTest extends BaseTest {

    private static searchPage searchPage;

    @BeforeClass
    public void initialization() {
        searchPage = new searchPage();
    }


    @Test
    public void results() {
        TimeUtils.mediumWait();
        searchPage.clickSecondLesson();
    }

//
//    @Test(priority = 2)
//    public void filters(){
//        verifyFilter.verifyFilterFirstRegistration();
//        verifyFilter.verifyFilterPriceDescending();
//    }
}