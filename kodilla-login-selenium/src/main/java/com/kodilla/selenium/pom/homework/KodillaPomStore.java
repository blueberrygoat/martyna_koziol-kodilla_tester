package com.kodilla.selenium.pom.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class KodillaPomStore extends AbstractPom {

    @FindBy(css = "input[name='search']")
    WebElement searchField;


    public KodillaPomStore(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void searchWord(String word) {
        searchField.sendKeys(word);
    }

    public int getNumberOfResults() {
        WebElement elementsWrapper = driver.findElement(By.cssSelector("#elements-wrapper"));
        List<WebElement> results = elementsWrapper.findElements(By.cssSelector("div.element"));
        return results.size();
    }
}

