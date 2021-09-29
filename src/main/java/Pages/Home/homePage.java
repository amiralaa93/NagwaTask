package Pages.Home;

import BasePackage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static BasePackage.BaseTest.driver;


public class homePage extends BasePage {

    WebElement searchIcon = driver.findElement(By.xpath("//div[@class='search']/button[1]/i[@class='f-icon search-icon']"));
    WebElement searchText = driver.findElement(By.id("txt_search_query"));
    WebElement searchSubmit = driver.findElement(By.id("btn_global_search"));

    public void gotoSearchPage() {

        searchIcon.click();
        searchText.sendKeys("addition");
        searchSubmit.click();
    }
}