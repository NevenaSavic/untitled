package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.*;

public class T7_Scroll_JsExecuter {

    @Test
    public void task7_scroll_test(){
        /*TC #7: Scroll using JavascriptExecutor
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com/large
        3- Scroll down to “Cydeo” link
        4- Scroll up to “Home” link
        5- Use below provided JS method only

        JavaScript method to use : arguments[0].scrollIntoView(true)

        Note: You need to locate the links as web elements and pass them as
        arguments into executeScript() method
         */

        Driver.getDriver().get("https://practice.cydeo.com/large");

        //pronadjemo path do cydeo i home
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        WebElement homeText = Driver.getDriver().findElement(By.linkText("Home"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //scroll down to cydeo link
        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);
        //uzmi argument sa indeksom nula, sto je cydeoLink ovde i skroluj do ga ne vidis - scrollIntoView

        //scroll back up to home link
        js.executeScript("arguments[1].scrollIntoView(true)", cydeoLink, homeText);




    }














}
