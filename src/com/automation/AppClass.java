package com.automation;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppClass {
	@SuppressWarnings("deprecation")
    @Test
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // Set device and app capabilities
        caps.setCapability("appium:deviceName", "emulator-5554");
        caps.setCapability("appium:platformName", "Android");
        caps.setCapability("appium:app", "C:\\Users\\Leo1\\Downloads\\Leo1_UAT_ParentalRecharge_(3.2.8).apk");
        caps.setCapability("appium:automationName", "UiAutomator2");

        AndroidDriver driver = null;
        try {
            driver = new AndroidDriver(new URI("http://127.0.0.1:4723/wd/hub").toURL(), caps);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            // Locate and interact with elements
            MobileElement mobileField = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text='Registered Mobile number']")));
            mobileField.click();
            mobileField.sendKeys("9545036568");

            // Submit OTP
            String otp = "1111";
            MobileElement otpField = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@resource-id='otp_input_field']"));
            otpField.sendKeys(otp);

            // Click Submit
            MobileElement submitButton = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='Submit']"));
            submitButton.click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();  // Ensure the driver quits and releases resources
            }
        }
    }
}

//MobileElement mobileField = (MobileElement) wait.until(
//      ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text='Registered Mobile number']"))
//  );
//  WebElement mobileField =  wait.until(
//          ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text='Registered Mobile number']")));
//     
//  mobileField.click();
//  
//  TouchAction<?> action = new TouchAction<>(driver);
//  action.tap(ElementOption.element(mobileField)).perform();
//
//  
//  mobileField.sendKeys("9545036568");
// 
  
