package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http:/practice.cydeo.com");

        Thread.sleep(2000);

        //close current tab
        driver.close();

        driver = new ChromeDriver();

        driver.get("http:/practice.cydeo.com");

        Thread.sleep(5000);

        //close all tabs
        driver.quit();




    }
}