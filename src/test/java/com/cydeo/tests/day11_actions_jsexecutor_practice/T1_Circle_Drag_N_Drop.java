package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class T1_Circle_Drag_N_Drop {

    /*
    TC #: Drag and drop
1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
2. Drag and drop the small circle to bigger circle.
3. Assert:
-Text in big circle changed to: “You did great!”
     */

    @Test
    public void drag_and_drop_test(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //Locate accept Cookies Button
        WebElement acceptCookiesButton = Driver.getDriver().findElement(By.id("onetrust-accept-bnt-handler"));
        acceptCookiesButton.click();

        //Locate circles
        WebElement circle1 = Driver.getDriver().findElement(By.id("draggable"));
        WebElement circle2 = Driver.getDriver().findElement(By.id("droptarget"));

        //locate and put circle 1 into 2
        Actions actions = new Actions(Driver.getDriver());
        //actions.dragAndDrop(circle1, circle2).perform(); moze ova metoda, moze i ova ispod
        actions.clickAndHold(circle1).moveToElement(circle2).perform();


        //Assert
        //After droping there is a text 'You did great!'
        String actualText = circle2.getText();
        String expectedText = "You did great!";
        Assert.assertEquals(actualText, expectedText);
    }











}
