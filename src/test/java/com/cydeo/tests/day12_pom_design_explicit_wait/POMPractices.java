package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.tests.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class POMPractices {

    @Test
    public void required_field_error_message_test(){

        /*
        TC #1: Required field error message test
1- Open a chrome browser
2- Go to: https://library1.cydeo.com
3- Do not enter any information
4- Click to “Sign in” button
5- Verify expected error is displayed:
Expected: This field is required.

NOTE: FOLLOW POM DESIGN PATTERN
         */

        Driver.getDriver().get("https://library1.cydeo.com");

        //3.Do not enter any information
        //4.Click to Sign In button
        LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        libraryLoginPage.signInButton.click();

        //5.Assert
        Assert.assertTrue(LibraryLoginPage.fieldRequiredErrorMessage.isDisplayed());
        //zasto ovde nije htelo da pozove dok nisam u LibraryLoginPage napravila ovo fieldReq static?









    }













}
