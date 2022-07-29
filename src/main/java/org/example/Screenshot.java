package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import javax.crypto.spec.PSource;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Formatter;

public class Screenshot  {
    private WebDriver driver;

    public void Screenshot(WebDriver driver) throws IOException {

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String path= "./screenshot/img1.jpg"+ LocalDate.now().toString()+"-"+System.currentTimeMillis();
        File destFile=new File(path);
        FileUtils.copyFile(scrFile,destFile);
                

    }


}
