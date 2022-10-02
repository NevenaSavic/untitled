package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_getAttribute_sccSelector {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        //verify log in button is as expected
       // WebElement signIn = driver.findElement(By.className("login-btn"));
        WebElement signIn = driver.findElement(By.cssSelector("input[class = 'login-btn']"));

        String expectedButtonText = "Log in";
        String actuallButtonText = signIn.getAttribute("value");

        System.out.println(actuallButtonText);

        if (actuallButtonText.equalsIgnoreCase(expectedButtonText)){
            System.out.println("Log in passed!");
        }else{
            System.out.println("Log in failed!");
        }
















    }








}
