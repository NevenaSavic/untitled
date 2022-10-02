package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        // 1 - setting up the Web Driver Manager
        //We create Browser Driver
        WebDriverManager.chromedriver().setup();


        // 2 - create an instance of chrome driver
        //Opens Browser
        WebDriver driver = new ChromeDriver();


        // 3 - test if driver is working as expected
        //selenium
        driver.get("https://www.google.com");







    }
}
