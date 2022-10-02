package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {

    public static void main(String[] args) {

        //open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().minimize();

        //go to this page down
        driver.get("https://library2.cybertekschool.com/login.html");

        //enter username incorrect@email.com - moramo da nadjemo element, to gde se pise email
        WebElement usernameInput = driver.findElement(By.className("form-control"));
        usernameInput.sendKeys("incorrect@email.com");

        //enter password: Incorrect password
        WebElement inputPassword = driver.findElement(By.id("input Password"));
        inputPassword.sendKeys("incorrect password");


        //click to sign in button
        WebElement findSignIn = driver.findElement(By.tagName("button"));

















    }












}
