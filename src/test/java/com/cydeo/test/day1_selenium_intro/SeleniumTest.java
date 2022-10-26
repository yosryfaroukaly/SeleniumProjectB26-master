package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        // 1- Setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.google.com");

    }
}
