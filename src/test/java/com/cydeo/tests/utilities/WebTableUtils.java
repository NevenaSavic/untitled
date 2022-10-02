package com.cydeo.tests.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    public static String returnOrderDate(WebDriver driver, String customerName){

        String locator = "//td[.='"+customerName+"'/following-sibling::td[3]]"; //sa ovim customer name mozemo da kontrolisemo ime iz metode

        WebElement customerDataCell = driver.findElement(By.xpath(locator));
        return customerDataCell.getText();
    }


    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){

        String locator = "//td[.='"+customerName+"'/following-sibling::td[3]]"; //sa ovim customer name mozemo da kontrolisemo ime iz metode
        WebElement customerDataCell = driver.findElement(By.xpath(locator));

        String actualDataCell = customerDataCell.getText();

        Assert.assertEquals(actualDataCell, expectedOrderDate);

    }

















}
