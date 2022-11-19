package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.ConfigurationReader;
import com.cydeo.tests.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {

@Test
public static void registrationTest(){
    Faker faker = new Faker();
    Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

    WebElement element = Driver.getDriver().findElement(By.xpath("(//input[@class='form-control'])[1]"));
element.sendKeys(faker.name().firstName());
    WebElement element1 = Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/input"));
element1.sendKeys(faker.name().lastName());

    WebElement element2 = Driver.getDriver().findElement(By.xpath("//input[@placeholder='username']"));
element2.sendKeys(faker.bothify("###???"));

WebElement element3=Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[4]/div/input"));
element3.sendKeys(faker.internet().emailAddress());
WebElement element4=Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[5]/div/input"));
element4.sendKeys(faker.internet().password());
WebElement element5=Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[6]/div/input"));
element5.sendKeys(faker.numerify("###-###-####"));

WebElement element6=Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[7]/div/div[2]/label/input"));
element6.click();

Select departmaentDropdown=new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
departmaentDropdown.selectByIndex(faker.number().numberBetween(1,10));
}








}
