package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg_selenium {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @Test
    public void seleniumTest(){
        //do browser driver set up

        driver.get("htpps://www.google.com");

        //assert google title
        Assert.assertEquals(driver.getTitle(), "Google", "Title is not matching here!");

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }













}
