package com.cydeo.tests.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    /*sve je vec namesteno bilo u zadatku. Napisali su da je static, sta je povratni type itd.
    ako prodje da je chrome, onda otvara chrome. Ako prodje firefox, onda otvara to.
    To radimo tako sto podesavamo ovaj chromedriver dole, kao i uvek na pocetku

     */

    public static WebDriver getDriver(String browserType){
        if (browserType.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else{

            System.out.println("Given browser type does not exist!");
            return null;
        }

    }







}
