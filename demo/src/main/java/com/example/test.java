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

        String model;
        String price;

        WebElement cart = driver.findElement(By.xpath("//a[contains(text(),'Laptops')]"));
        cart.click();
        Thread.sleep(2000);
        WebElement firstLaptop =  driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]"));
        firstLaptop.click();
        Thread.sleep(2000);
        
        
        price = driver.findElement(By.xpath("//h3[@class='price-container']")).getText();
        model = driver.findElement(By.xpath("//h2[@class='name']")).getText();
        System.out.println("Model: " + model + " Price: " + price);
        
        driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
        Thread.sleep(2000);
        driver.quit();


    }



}