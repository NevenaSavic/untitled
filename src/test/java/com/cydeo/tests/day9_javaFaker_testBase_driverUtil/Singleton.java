package com.cydeo.tests.day9_javaFaker_testBase_driverUtil;

public class Singleton {

    //create private constructor
    private Singleton(){}

    //create private static string-private to prevent access and provide a getter method
    private static String word;

    //this utility method will return the "word" in the way we want to return
    public static String getWord(){

        if(word == null){
            System.out.println("First time call. Word object is null. " + "Assignig value to it now!");
            word = "something";
        }else{
            System.out.println("Word already has value!");
        }
        return word;
    }













}
