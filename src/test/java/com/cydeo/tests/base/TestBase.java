package com.cydeo.tests.base;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class TestBase {

    /*
    mozemo da ga napravimo u abstract class, a i ne moramo.
    Iz abstract class se ne prave objekti.
    Test Base svakako cuva methode koje koristimo iznova.
     */

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://login1.nextbasecrm.com/");
    }


    @AfterMethod
    public void tearDown(){
        driver.close();
    }
















}
