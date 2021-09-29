package tests.lessonWorkSheetTest;

import BasePackage.BaseTest;
import Pages.LessonWorkSheet.lessonWorkSheetPage;
import Utilities.TimeUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class lessonWorkSheetTest extends BaseTest {

    private static lessonWorkSheetPage lessonWorkSheetPage ;

    @BeforeClass
    public void initialization() {
        lessonWorkSheetPage = new lessonWorkSheetPage();
    }


    @Test
    public void worksheet() {
        TimeUtils.mediumWait();
        lessonWorkSheetPage.questionsCount();
    }
}