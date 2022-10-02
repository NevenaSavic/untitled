package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T3_radioButton_cont {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("htpps://practice.cydeo.com/radio_buttons");

        //click on hockey radio button
        //WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));

        //locate name 'sport' radio buttons and store them in a list of web elements
        List <WebElement> sportradioButtons = driver.findElements(By.name("sport"));

        //loop throug the list of web element and select matching result hockey
        for (WebElement each:sportradioButtons) {

            String eachId = each.getAttribute("id");
            System.out.println("eachId = " + eachId);

            if (eachId.equalsIgnoreCase("hockey")){
                each.click();
                System.out.println("Hockey is selected" + each.isSelected());
                break;
            }



        }

        clickAndVerifyRadioButton(driver, "sport", "hockey");



    }

    //pravimo metodu koju prolazi kroz sve id vrednosti i onda kad stane na onu koju smo zadali, klikne i to je to
    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue){

        List <WebElement> radioButtons = driver.findElements(By.name(nameAttribute));

        for (WebElement each:radioButtons) {

            String eachId = each.getAttribute("id");

            if (eachId.equals(idValue)){
                each.click();
                System.out.println(eachId + "is selected" + each.isSelected());
                break;
            }



        }



    }








}
