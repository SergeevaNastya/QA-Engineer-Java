package org.example;

import org.example.Lesson_14_junit_5.FactorialJunit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/elka0/IdeaProjects/QA-Java/src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
    }
}