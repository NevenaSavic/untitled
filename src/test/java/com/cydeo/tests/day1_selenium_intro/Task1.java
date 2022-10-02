package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); //prvo podesavanje
        WebDriver driver = new ChromeDriver();  //otvaram chrome onda
        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports";

        String actuallTitle = driver.getTitle();

        if (actuallTitle.equals(expectedTitle)){
            System.out.println("Verification passed!");
        }else{
            System.out.println("Verification not passed!");
        }













    }












}
