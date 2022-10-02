package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("htpps://practice.cydeo.com");

        String expectedURL = "cydeo";
        String actuallURL = driver.getCurrentUrl();

        if(actuallURL.equals(expectedURL)){
            System.out.println("Url verification PASSED");
        }else {
            System.out.println("Url verification FAILED");
        }

        String expectedTitle = "Practice";
        String actuallTitle = driver.getTitle();

        if (actuallTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }

        driver.close();









    }










}
