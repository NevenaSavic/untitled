package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    /*
    TC#1: Registration form confirmation
Note: Use JavaFaker OR read from configuration.properties file when possible.
1. Open browser
2. Go to website: https://practice.cydeo.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10. Enter date of birth
11. Select Department/Office
12. Select Job Title
13. Select programming language from checkboxes
14. Click to sign up button
15. Verify success message “You’ve successfully completed registration.” is
displayed.


Note:
1. Use new Driver utility class and method
2. User JavaFaker when possible
3. User ConfigurationReader when it makes sense
     */

    @Test
    public void registration_form_test(){
        WebDriver driver;

        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        //Driver.getDriver().get("https://practice.cydeo.com/registration_form"); moze ovako, moze i iz conf.properties da citamo
        Driver.getDriver().get(ConfigurationReader.getProperty("https://practice.cydeo.com/registration_form"));

        //create java faker object
        Faker faker = new Faker();

        //3. Enter first name
        WebElement firstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());

        //4. Enter last name
        WebElement lastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        //inputUsername.sendKeys(faker.name().username().replaceAll(".", " ")); moze i ovako da se radi

        String user = faker.bothify("helpdesk###");
        inputUsername.sendKeys(user);

        //6. Enter email adress
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user + "@email.com");

        //7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.numerify("#############"));

        //8.Enter phone number
        WebElement inputPhone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys(faker.phoneNumber().phoneNumber());
        //inputPhone.sendKeys(faker.numerify("###-###-####")); moze i ovako

        //9. Select a gender from radio buttons
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        //10. Enter date of birth
        WebElement inputBirthDay = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //faker.number().numberBetween(1, 12);  ovako mozemoo npr da radimo za mesece
        inputBirthDay.sendKeys("03/08/2000");

        //11. Select Department/Office
        Select departmentDropDown = new Select( Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropDown.selectByIndex(faker.number().numberBetween(1, 9));

        //12. Select Job Title








    }





















}
