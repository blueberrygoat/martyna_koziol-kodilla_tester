package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppCSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        WebElement alert = driver.findElement(By.cssSelector("div button"));
        alert.click();

        WebElement category = driver.findElement(By.cssSelector("select[aria-label^='Kategoria']"));
        Select categorySelect = new Select(category);
        categorySelect.selectByIndex(3);

        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement searchField = driver.findElement(By.cssSelector("input[aria-autocomplete='both']"));
        wait.until(ExpectedConditions.visibilityOf(searchField));
        searchField.sendKeys("Mavic mini");
        searchField.submit();

        List<WebElement> results = driver.findElements(By.cssSelector("div article h2"));
        for (WebElement webElement : results) {
            System.out.println(webElement.getText());
        }
    }
}