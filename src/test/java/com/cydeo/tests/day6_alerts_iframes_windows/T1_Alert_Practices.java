package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_Alert_Practices {

    /*
    1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.

     */


    @BeforeMethod
    public void setUpMethod(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cydeo.com/javascript_alerts");

    }


    @Test
    public void alert_Test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //Task 3
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        informationAlertButton.click();

        //Task 4
        //To be able to click to Alert button, we have to switch drivers focus to Alert itself
        Alert alert = driver.switchTo().alert();

        alert.accept(); //kliknuli smo ok iz alert button

        //Task5
        WebElement resultTask = driver.findElement(By.xpath("//p[@id='Result']"));

        Assert.assertTrue(resultTask.isDisplayed(), "Result Text is not displayed!");

        String expectedText = "You successfully clicked an alert!";
        String actualText = resultTask.getText();

        Assert.assertEquals(actualText, expectedText, "Actual result Text is not as expected!");
    }














}
