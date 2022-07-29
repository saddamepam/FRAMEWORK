package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

    private WebDriverSingleton(){

    }
    private  static  WebDriver driver= null;


    public static WebDriver getWebDriverSingleton()
    {
        if(driver==null)
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
}
