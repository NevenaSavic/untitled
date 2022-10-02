package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_iFrames {

    /*
    1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
     */

    @BeforeMethod
    public void setUpMethod(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/iframe");

    }


    @Test
    public void iFrame_test(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //we need to switch drivers focus on iframe
        driver.switchTo().frame("mce_0_ifr");

        WebElement yourContentGoesHere = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHere.isDisplayed());

        //to verify, za to moramo da se vratimo na glavni html
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());

    }


}
