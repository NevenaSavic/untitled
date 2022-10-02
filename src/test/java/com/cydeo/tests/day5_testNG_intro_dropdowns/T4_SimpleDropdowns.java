package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_SimpleDropdowns {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("htpps://practice.cydeo.com/dropdown");

    }
    @Test
    public void simpleDropdownTest(){

        //verify "Simple Dropdown" default selected value is correct
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

        String actuallSimpleDropdownOption = currentlySelectedOption.getText();
        String expectedSimpleDropdownOption = "Please select an option";

        Assert.assertEquals(actuallSimpleDropdownOption, expectedSimpleDropdownOption);

        //verify "State selection" default selected value is correct
        Select stateDropDown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String expectedDropdownText = "Select a state";
        String actualDropdownText = stateDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDropdownText, expectedDropdownText);

    }










}
