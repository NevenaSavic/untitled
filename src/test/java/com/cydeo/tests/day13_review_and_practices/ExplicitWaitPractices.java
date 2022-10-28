package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.dnd.DragGestureEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitPractices {

    /*
    TC #2: Explicit wait practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/dynamic_controls
3- Click to “Remove” button
4- Wait until “loading bar disappears”
5- Verify:
a. Checkbox is not displayed
b. “It’s gone!” message is displayed.

NOTE: FOLLOW POM

     */

    DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();
    }

    @Test
    public void remove_button_test(){
        //click to remove button
        dynamicControlsPage.removeButton.click();

        //Wait until “loading bar disappears”
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));


        /*Verify:
        a. Checkbox is not displayed
        b. “It’s gone!” message is displayed.
         */
        Assert.assertTrue(!dynamicControlsPage.checkbox.isDisplayed());
        Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());

        Assert.assertTrue(dynamicControlsPage.message.isDisplayed()); //ili
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone"));






    }





















}
