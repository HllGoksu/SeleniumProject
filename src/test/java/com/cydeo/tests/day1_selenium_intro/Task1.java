package com.cydeo.tests.day1_selenium_intro;

import com.cydeo.tests.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://qa.azulcrm.com/");

        WebElement username= driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("marketing99@cybertekschool.com");

        WebElement password=driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");

        WebElement login=driver.findElement(By.className("login-btn"));
        login.click();


 //    WebElement progfilename=driver.findElement(By.id("user-name"));
   //     System.out.println("progfilename.getText() = " + progfilename.getText());
WebElement message= driver.findElement(By.xpath("(//span[.='Message'])[2]"));
        message.click();
Thread.sleep(5000);
        WebElement uploadButton= driver.findElement(By.xpath("//*[@id=\"bx-b-uploadfile-blogPostForm\"]"));
        uploadButton.click();

       // WebElement bitrixButton=driver.findElement(By.xpath("(//span[.='Select document from Bitrix24'])[1]"));
    //bitrixButton.click();

        WebElement uploadImages= Driver.getDriver().findElement(
                By.xpath("(//span[.='Select document from Bitrix24'])[1]"));
        uploadImages.click();
    }
}
