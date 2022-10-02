package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //dovoljno vremena proizvodi za drive pre nego sto izbaci da nema takvog elementa
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("htpps://practice2.cydeo.com");

        //locate all the links on the page
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));//a sluzi za obelazavanje linkova

        //print out number of links on this page
        System.out.println("allLinks.size() = " + allLinks.size());

        //print out the text of the links
        for (WebElement each:allLinks) {
            System.out.println("Text of the link:" + each.getText()); //mora ovo getText da bi dobili tekst
            System.out.println("HREF values:" + each.getAttribute("href")); //ovako dobijamo href vrednost


        //print out the HREF attribute values of the links


        }

        }























}
