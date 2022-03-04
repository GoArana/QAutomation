package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class test {
    
    private static String url = "https://www.demoblaze.com/index.html#";
    public static WebDriver driver = DriverFactory.getDriver();
    
    
    public static void main(String[] args) throws Exception {   
    
        driver.navigate().to(url);
        driver.manage().window().maximize();

        WebElement cart = driver.findElement(By.xpath("//a[contains(text(),'Laptops')]"));
        cart.click();
        Thread.sleep(2000);
        WebElement firstLaptop =  driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]"));
        firstLaptop.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
        Thread.sleep(2000);
        driver.quit();


    }



}