package com.cydeo.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_utilities {

    /*
    this method will log in with helpdesk1@cydertekschool.com user when is called
     */

    public static void crm_login(WebDriver driver){

        //enter valid username
        WebElement inputUser = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUser.sendKeys("helpdesk1@cybertekschool.com");

        //enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='name=USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //Click to log in button
        WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        logInButton.click();

    }

    public static void crm_login(WebDriver driver, String username, String password){

        //enter valid username
        WebElement inputUser = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputUser.sendKeys("helpdesk1@cybertekschool.com");

        //enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='name=USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");

        //Click to log in button
        WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        logInButton.click();

    }
}
