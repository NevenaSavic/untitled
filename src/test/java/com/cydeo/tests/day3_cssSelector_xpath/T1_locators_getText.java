package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.tests.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        mozemo i ovako da otvorimo chrome. Pozovemo o´metodu koju smo napravili u paket utilities i pod ovim imenom
        WebDriverFactory
         */

        driver.get("https://login2.nextbasecrm.com/");

        //enter incorrect username
        WebElement usernameInput = driver.findElement(By.className("login-inp"));
        usernameInput.sendKeys("incorrect");


        //enter incorrect password
        WebElement passwordInput = driver.findElement(By.name("USER-PASSWORD"));
        passwordInput.sendKeys("incorrect");


        //click to log in button
        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();


        //verify text message is expected;
        //expected: incorrect login or password
        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";
        String actualErrorMessage = errorMessage.getText(); //ovako mozemo da String povezemo sa WebElement

        if (actualErrorMessage.equals(expectedErrorMessage)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }




















    }
}
