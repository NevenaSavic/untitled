package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(); //ovaj korak otvara prazan chrome browser prakticno
        //ako zelimo da otvorimo veliku stranu, da bude full screen
        driver.manage().window().maximize();

        driver.manage().window().fullscreen(); //slicno kao gore, nekad ne radi

        driver.get("https://www.tesla.com"); //otvara konkretnu stranicu koju zelimo

        //stop execution code for 3 sec
        Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        //stop execution code for 3 sec
        Thread.sleep(3000);

        //navigate forward
        driver.navigate().forward();

        //use selenium to refresh
        driver.navigate().refresh();

        //use selnium to method
        driver.navigate().to("https://www.google.com");

        //get the Title of the page, vrata String
        //System.out.println("driver.getTitle() = " + driver.getTitle());
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //trenutna adresa se dobija
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //zatvara trenutno otvoreni window
        driver.close();

        //zatvara sve windows otvorene
        driver.quit();







    }











}
