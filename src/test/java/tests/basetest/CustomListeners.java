package tests.basetest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import java.io.File;
import java.io.IOException;

public class CustomListeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

    }

    @Override
    public void onTestFailure(ITestResult ITestResult) {
        String methodName = ITestResult.getName().trim();
        ITestContext context = ITestResult.getTestContext();
        WebDriver driver = (WebDriver) context.getAttribute("driver");
        theScreenSgot(methodName,driver);
        System.out.println(methodName);

    }
    public void theScreenSgot(String methodName, WebDriver driver){
        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFile,new File(methodName+"jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
