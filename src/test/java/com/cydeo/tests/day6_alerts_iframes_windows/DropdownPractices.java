package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    /*
    1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
     */

    @Test
    public void dropdown_test5(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/dropdown");

        //we located the dropdown and is ready to be used
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //select state Ilinois
        stateDropdown.selectByVisibleText("Illinois");

        //select state Virginia
        stateDropdown.selectByValue("VA");

        //select California
        stateDropdown.selectByIndex(5);

        //6. Verify final selected option is California.
        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText(); //getText vraca String

        Assert.assertEquals(actualOptionText, expectedOptionText);

    }





















}
