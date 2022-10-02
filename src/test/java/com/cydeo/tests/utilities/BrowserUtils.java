package com.cydeo.tests.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    /*
    this method will accept int(in seconds) and execute Thread.sleep for given duration
     */

    public void sleep(int second){
        second *= 1000;

        try{
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }


    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle){

        Set<String> allWindowsHandles = driver.getWindowHandles();

        for (String each : allWindowsHandles){
            driver.switchTo().window(each);

            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains("Etsy")){
                break;
            }
        }

        //Assert
        String actualTitle = driver.getTitle();
        String expectedTitle1 = "Etsy";
        Assert.assertEquals(actualTitle, expectedTitle);

    }


    //this method accepts a String expectedTitle and Asserts if is it true
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }












}
