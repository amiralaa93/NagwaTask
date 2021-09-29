package Pages.LessonPage;

import BasePackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static BasePackage.BaseTest.driver;


public class lessonPage extends BasePage {

    WebElement lessonWorkSheet = driver.findElement(By.xpath("//a[normalize-space()='Lesson Worksheet']"));

    public void worksheet() {

        lessonWorkSheet.click();
    }
}