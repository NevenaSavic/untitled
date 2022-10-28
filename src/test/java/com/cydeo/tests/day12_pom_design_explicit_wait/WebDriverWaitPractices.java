package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.DynamicLoad1Page;
import com.cydeo.pages.DynamicLoad7Page;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class WebDriverWaitPractices {

    @Test
    public void dynamic_load_7_test(){
        /*
        TC#4 : Dynamically Loaded Page Elements 7
1. Go to https://practice.cydeo.com/dynamic_loading/7
2. Wait until title is “Dynamic title”
3. Assert: Message “Done” is displayed.
4. Assert: Image is displayed.
Note: Follow POM
         */

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        //2. Wait until title is “Dynamic title”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        wait.until(ExpectedConditions.titleIs("Dynamic Title"));

        //create object to reach web elements
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        //3.Assert message Done is displayed
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());

        //4.Assert image is displayed
        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());

    }


    @Test
    public void dynamic_load_1_test(){
        /*
        TC#5 : Dynamically Loaded Page Elements 1
1. Go to https://practice.cydeo.com/dynamic_loading/1
2. Click to start
3. Wait until loading bar disappears
4. Assert username inputbox is displayed
5. Enter username: tomsmith
6. Enter password: incorrectpassword
7. Click to Submit button
8. Assert “Your password is invalid!” text is displayed.
Note: Follow POM Design Pattern
         */

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1 ");

        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();

        dynamicLoad1Page.startButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadingBar));

        dynamicLoad1Page.inputUsername.sendKeys("somethingwrong@hotmail.com");

        dynamicLoad1Page.inputPassword.sendKeys("somethingwrong");

        dynamicLoad1Page.submitButton.click();

        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());


    }
















}
