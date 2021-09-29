package tests.homeTest;

import BasePackage.BaseTest;
import Pages.Home.homePage;
import Pages.SearchResults.searchPage;
import Utilities.TimeUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class homeTest extends BaseTest {

    private static homePage homePage;

    @BeforeClass
    public void initialization() {
        homePage = new homePage();
    }


    @Test
    public void search() {
        TimeUtils.mediumWait();
        homePage.gotoSearchPage();
    }
}