package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_GetText_GetAttribute {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().minimize();

        driver.get("https://practice.cydeo.com/registration form");

        //verify header text is as expected
        WebElement headerText = driver.findElement(By.tagName("h2"));

        String expectedHeaderText = "Registration Form";
        String actuallHeaderText = headerText.getText();

        //Locate "First Name" locate box
        WebElement firstNameAttribute = driver.findElement(By.name("first name"));

        //verify placeholder attribute's value is as expected
        //expected is first name
        String expectedPlaceHolder = "first name";
        String actuallPlaceHolder = firstNameAttribute.getAttribute("placeholder");









    }








}
