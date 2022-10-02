package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("htpps://practice.cydeo.com/forgot_password");

        //lociraj sledece WebElemente na stranici koristeci Xpath i cssSelector

        //home link using cssSelector
        WebElement webLink_ex1 = driver.findElement(By.cssSelector("a[class = 'nav-link']"));

        //home link isto, samo na drugi nacin
        WebElement webLink_ex2 = driver.findElement(By.cssSelector("a.'nav-link']"));

        //isto, samo koriscenjem href value
        WebElement webLink_ex3 = driver.findElement(By.cssSelector("a[href = '/']"));

        //locate header using cssSelector; Forgot Password header
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example > h2"));

        //isto, samo sa xpath
        WebElement header_ex2_xPath = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));
        //WebElement header_ex2_xPath = driver.findElement(By.xpath("//h2[.()='Forgot Password']")); ova dva su ista

        //e-mail text prvo preko xPath
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for = 'e-mail']"));

        //locate input box using xPath
        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name = 'e-mail']"));
        WebElement boxInput_ex2 = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z']"));

        //Retrieve password button
        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//button[@id = 'form_submit']"));

        //powered cydeo text
        WebElement poweredByCydeo = driver.findElement(By.xpath("//div[@style = 'text-align: center;']"));

        //verify all web elements are displayed
        System.out.println("webLink_ex1.isDisplayed() = " + webLink_ex1.isDisplayed());
        System.out.println("webLink_ex2.isDisplayed() = " + webLink_ex2.isDisplayed());
        System.out.println("webLink_ex3.isDisplayed() = " + webLink_ex3.isDisplayed());


    }










}
