package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_StaleElementRefEx {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("htpps://practice.cydeo.com/add_remowe_elements/");

        //click to add element button
        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();

        //verify delete button is displayed after clicking
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        //click to delete button
        deleteButton.click();

        //verify delete button is not displayed any more after clicking
        System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());

        try{
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        }catch (StaleElementReferenceException e){
            System.out.println("stale Element R. E. is thrown");
        }





    }









}
