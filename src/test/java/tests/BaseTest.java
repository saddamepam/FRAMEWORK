package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.Screenshot;
import org.example.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import pages.CalculatorPage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected CalculatorPage calculatorPage;

    @BeforeMethod
    public void setDriver(){

       driver= WebDriverSingleton.getWebDriverSingleton();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));
        driver.manage().window().maximize();
        calculatorPage = new CalculatorPage(driver);

    }

    @AfterMethod(alwaysRun = true)
    public void takeScreenshot() throws IOException {
    new Screenshot().Screenshot(driver);
    }
    @AfterSuite
    public void closeDriver(){
        driver.close();
    }
}