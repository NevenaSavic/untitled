package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("htpps://practice.cydeo.com/checkboxes");

        //confirm checkbox 1 is not selected by default
        //click checkbox 1 to select it
        //confirm checkbox 1 is selected
        WebElement checkbox1 = driver.findElement(By.xpath("input[@name='checkbox1']"));
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());
        checkbox1.click();
        System.out.println("checkbox1.isSelected(), expecting true = " + checkbox1.isSelected());


        //confirm checkbox 2 is selected by default
        //click checkbox to deselect it
        //confirm checkbox 2 is selected
        WebElement checkbox2 = driver.findElement(By.xpath("input[@name='checkbox2']"));
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());
        checkbox2.click();
        System.out.println("checkbox2.isSelected(), is expecting false = " + checkbox2.isSelected());


    }













}
