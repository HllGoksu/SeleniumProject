package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_WindowHandling {

    WebDriver driver;
@BeforeMethod

public void setup(){

    driver= WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}


@Test
    public void windowsHandlingTest(){

    driver.get(" https://www.amazon.com");

    ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
    ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

    Set<String> allWindowHandles=driver.getWindowHandles();

    for (String each:allWindowHandles) {
        driver.switchTo().window(each);
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

     if(driver.getCurrentUrl().contains("etsy")){break;}
    }


     String actualTitle=driver.getTitle();
     String expectedTitle="Etsy";

        Assert.assertTrue(actualTitle.contains(expectedTitle));



}



}
