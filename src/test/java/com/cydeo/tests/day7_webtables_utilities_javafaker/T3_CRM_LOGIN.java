package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T3_CRM_LOGIN extends TestBase {

    /*
    1. Create new test and make set ups
2. Go to : http://login1.nextbasecrm.com/
3. Enter valid username
4. Enter valid password
5. Click to `Log In` button
6. Verify title is as expected:
Expected: Portal#

ovde cemo pozvati iz Test Base onu metodu koju smo sacuvali, tako sto cemo da extendujemo gore kod class


     */

      @Test
    public void crm_login_test(){
          WebDriver driver = WebDriverFactory.getDriver("chrome");

          //enter valid username
          WebElement inputUser = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
          inputUser.sendKeys("helpdesk1@cybertekschool.com");

          //enter valid password
          WebElement inputPassword = driver.findElement(By.xpath("//input[@name='name=USER_PASSWORD']"));
          inputPassword.sendKeys("UserUser");

          //Click to log in button
          WebElement logInButton = driver.findElement(By.xpath("//input[@value='Log In']"));
          logInButton.click();

          //verify title is as expected
          //: Portal

      }

    @Test
    public void crm_login_test_2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");



        //verify title is as expected
        //expected: Portal
        BrowserUtils.verifyTitle(driver, "Portal");

    }















      }
