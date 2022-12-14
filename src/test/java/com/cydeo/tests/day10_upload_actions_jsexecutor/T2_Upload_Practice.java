package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_test(){
        /*

TC #2 Upload Test
1. Go to https://practice.cydeo.com/upload
2. Find some small file from your computer, and get the path of it.
3. Upload the file.
4. Assert:
-File uploaded text is displayed on the page
         */

        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //2. Find some small file from your computer, and get the path of it.
        String path = "C:\\Users\\NeNe_\\OneDrive\\Desktop\\HTML Class\\myFirstPage.html";

        //3. Upload a file
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));
        fileUpload.sendKeys(path);

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();

        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));

        //4. Assert
        Assert.assertTrue(fileUploadedHeader.isDisplayed());


    }











}
