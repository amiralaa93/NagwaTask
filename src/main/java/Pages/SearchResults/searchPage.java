package Pages.SearchResults;

import BasePackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static BasePackage.BaseTest.driver;

public class searchPage extends BasePage {

    WebElement secondLesson = driver.findElement(By.xpath("//div[@class='search-results-page page']//li[2]//*[1]//*[1]"));


    public void clickSecondLesson() {
        secondLesson.click();
    }
}