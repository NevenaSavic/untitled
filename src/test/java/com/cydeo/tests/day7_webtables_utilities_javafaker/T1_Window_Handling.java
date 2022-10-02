package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_Window_Handling {

    public WebDriver driver;

    @BeforeMethod
    public void setUp_method(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void window_handling_test(){
        ((JavascriptExecutor) driver).executeScript("window.open('htpps://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('htpps://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('htpps://facebook.com','_blank');");

        //create a logic to switch to the tab where Etsy.com is open
        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles) {
            driver.switchTo().window(each);
            System.out.println("Current URL: " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains("Etsy")){
                break;
            }
        }

        //Assert title contains Etsy
        String actualTitle = driver.getTitle();
        String expectedTitle = "Etsy";

        Assert.assertEquals(actualTitle, expectedTitle);

        //create a logic to switch to the tab where Etsy.com open is
        BrowserUtils.switchWindowAndVerify(driver, "etsy", "Etsy");






    }




}
