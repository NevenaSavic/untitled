package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setUpMethod(){
        System.out.println("Before class is running!");
    }

    @AfterClass
    public void tearDownMethod(){
        System.out.println("After Class is running!");
    }


    @BeforeMethod
    public void setUp(){
        System.out.println("Before method is running!");
    }

    @AfterMethod
    public void closeMethod(){
        System.out.println("After method is running!");
    }


    @Test
    public void test1(){
        System.out.println("Test one is running!");

        //Assert Equals:compare two of same things
        Assert.assertEquals("actual", "actual");


    }


    @Test
    public void test2(){
        System.out.println("Test two is running!");

        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected));
    }


















}
