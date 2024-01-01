package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

class KodillaPomStoreTest {
    KodillaPomStore kodillaPomStore;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        kodillaPomStore = new KodillaPomStore(driver);
    }

    @ParameterizedTest
    @CsvSource({"NoteBook,2", "School,1", "Brand, 1", "Business, 0", "Gaming, 1", "Powerful, 0"})
    public void testSearchResults(String search, int expectedCount) {
        kodillaPomStore.searchWord(search);
        int result = kodillaPomStore.getNumberOfResults();
        assertEquals(expectedCount, result);
    }

    @ParameterizedTest
    @CsvSource({"NOTEBOOK,2","SCHool,1","brand, 1","BUSINess, 0", "gaming, 1","PoWeRfUl, 0"})
    public void testSearchResultsWithUpperAndLowerCase(String search, int expectedCount) {
        kodillaPomStore.searchWord(search);
        int resultsCount = kodillaPomStore.getNumberOfResults();
        assertEquals(expectedCount, resultsCount);
    }

    @AfterEach
    public void close() {
        driver.close();
    }
}