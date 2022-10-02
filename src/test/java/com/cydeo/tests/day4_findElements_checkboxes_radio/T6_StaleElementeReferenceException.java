package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T6_StaleElementeReferenceException {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("htpps://practice.cydeo.com/abtest");

        //locate cydeo link, verify if it is dispalayed
        WebElement cydeoLink = driver.findElement(By.xpath("a[text()='CYDEO']"));

        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());

        //refresh the page
        driver.navigate().refresh();

        //verify if is displayed again
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());


    }


















}
