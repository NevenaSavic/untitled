package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");


        //write apple in search box
        //uvek prvo moramo da nadjemo element
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple" + Keys.ENTER); //kao saljemo slova, apple + klikcemo sa ovim enter


        //verify title
        String expectedTitle = "apple";
        String actuallTitle = driver.getTitle();

        if (actuallTitle.startsWith(expectedTitle)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed!");
        }







    }










}
