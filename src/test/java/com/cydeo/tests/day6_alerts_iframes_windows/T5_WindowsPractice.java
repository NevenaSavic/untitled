package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T5_WindowsPractice {

    /*
    1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
     */

    @BeforeMethod
    public void setUpMethod(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/windows");

    }

    @Test
    public void multiple_window_test(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        String mainHandle = driver.getWindowHandle();

        //assert title is Window
        String expectedTitle = "Window";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

        //click to click here link
        WebElement clickLink = driver.findElement(By.linkText("Click Here"));
        clickLink.click();

        //switch to new window
        for (String each : driver.getWindowHandles()){
            driver.switchTo().window(each);
            System.out.println("Current title while switching each " + driver.getTitle());
        }

        //assert current title is New Window
        String expectedTitleAfterClick = "New Window";
        String actualTitleAfterClick = driver.getTitle();

        Assert.assertEquals(actualTitleAfterClick, expectedTitleAfterClick);

        actualTitle = driver.getTitle();
        System.out.println("Title after click " + actualTitle);

    }


    @AfterMethod
    public void tearDown(){
        //driver.close(); ovo zatvara samo poslednji otvoreni window
       // driver.quit(); //sve zatvara
    }























}
