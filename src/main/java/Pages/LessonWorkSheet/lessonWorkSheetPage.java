package Pages.LessonWorkSheet;

import BasePackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static BasePackage.BaseTest.driver;


public class lessonWorkSheetPage extends BasePage {

    List<WebElement> questionsList = driver.findElements(By.xpath("//div[@class='instances']/div"));

    public void questionsCount() {

        int count = questionsList.size();
        System.out.println("Number of questions displayed: " + count);
    }
}