package tests.lessonTest;

import BasePackage.BaseTest;
import Pages.Home.homePage;
import Pages.LessonPage.lessonPage;
import Utilities.TimeUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class lessonTest extends BaseTest {

    private static lessonPage lessonPage;

    @BeforeClass
    public void initialization() {
        lessonPage = new lessonPage();
    }


    @Test
    public void lesson() {
        TimeUtils.mediumWait();
        lessonPage.worksheet();
    }
}