package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class T3_Actions_Hover {

    @Test
    public void hovering_test(){

        /*
        TC #3: Hover Test
1. Go to https://practice.cydeo.com/hovers
2. Hover over to first image
3. Assert:
a. “name: user1” is displayed
b. “view profile” is displayed
4. Hover over to second image
5. Assert:
a. “name: user2” is displayed
b. “view profile” is displayed
6. Hover over to third image
7. Confirm:
a. “name: user3” is displayed
b. “view profile” is displayed
         */

        Driver.getDriver().get("https://practice.cydeo.com/hovers ");

        //Find all images
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //Locate all the user texts under here
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[text()='name: user3']"));

        //Hover over to first image, second and third
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(img1).perform();
        actions.moveToElement(img2).perform();
        actions.moveToElement(img3).perform();

        //Assert
        //name user1, user2, user3 is displayed
        Assert.assertTrue(user1.isDisplayed());
        Assert.assertTrue(user2.isDisplayed());
        Assert.assertTrue(user3.isDisplayed());















    }
















}
