package com.cydeo.tests.day8_properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {

        Properties properties = new Properties(); //pravimo objekat od properties class

        //we need to open the file in java memory: fileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        //load the properties object using FileInputStream
        properties.load(file);

        //use properties object to read the value
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));


    }


















}
