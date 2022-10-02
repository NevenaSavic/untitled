package com.cydeo.tests.day9_javaFaker_testBase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){
        //creating faker objects to reach methods
        Faker faker = new Faker();

        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        //numerify() will generate random numbers
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));

        //letterify() gives us random letters
        System.out.println("faker.letterify(\"???????\") = " + faker.letterify("???????"));

        //bothify gives us combinationn of random letters and numbers
        System.out.println("faker.bothify(\"##??##??##??\") = " + faker.bothify("##??##??##??"));

    }













}
