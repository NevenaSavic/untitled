package com.cydeo.pages;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    //Ovde pravimo Page Web Elements (Page Object Models)

    //1.initialize the driver instance and object of the class
    public LibraryLoginPage(){  //ovo je default constructor
        PageFactory.initElements(Driver.getDriver(), this);
        //svaki put kad napravimo objekat ovo class prvo sto ce da se desi da ce konstruktor da dodje ovde i pozove ovu liniju
    }

    //2.use @FindBy annotation to locate web elements
    @FindBy(xpath = "//input[@id ='inputEmail']")
    public WebElement inputUsername;

    @FindBy(id ="inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@id = 'inputEmail-error']")
    public static WebElement fieldRequiredErrorMessage;

    @FindBy(xpath = "//div[.='Please enter a valid email adress']/div")
    public WebElement enterValidEmailErrorMessage;

    @FindBy(xpath = "//div[.='Sorry, Wrong email or Password']")
    public WebElement wrongEmailOrPasswordErrorMessage;















}
