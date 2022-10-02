package com.cydeo.tests.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.practice.cydeo.com");

        //otvori taj A/B testing koji nadjes na sajtu cydeo
        //Thread.sleep(3000); moze da se uspori ako se sajt ne ucitava brzo, da lakse nadje ovaj link
        //driver.findElement(By.linkText("A/B Testing")).click();
        WebElement abTestLink =  driver.findElement(By.linkText("A/B Testing")); //cuvamo nadjeni webElement
        abTestLink.click(); //ovako klikcemo na njega

        //verify title is. Expected: no A/B
        String expectedTitle = "No A/B Test";
        String actuallTitle = driver.getTitle();

        if (actuallTitle.equals(expectedTitle)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }

       driver.navigate().back(); //sad idemo nazad

       //verify title equals to practice
        //expected Title: practice
        String expectedTitle2 = "Practice";
        actuallTitle = driver.getTitle();

        if (actuallTitle.equals(expectedTitle2)){
            System.out.println("Title verification passed");
        }else{
            System.out.println("Title verification failed");
        }
    }

















}
