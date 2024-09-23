package com.automation;


import java.net.MalformedURLException;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MobileTestA {


	
	  // @Test     	 
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        // W3C Compliant Keys
        caps.setCapability("appium:deviceName", "e25e9c030922");
        caps.setCapability("appium:platformName", "Android");
        caps.setCapability("appium:app", "C:\\Users\\Leo1\\Downloads\\Leo1_PROD_SDK_(3.2.9).apk");
        caps.setCapability("appium:automationName", "UiAutomator2");

       // try {
            
           // @SuppressWarnings("deprecation")
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),caps);
            caps.setCapability("newCommandTimeout", 2000);
            caps.setCapability("deviceReadyTimeout", 2000);
            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            
      
           // try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                WebElement allowButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.permissioncontroller:id/permission_allow_button")));
                allowButton.click();
                WebElement mobileField = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@text='Registered Mobile number']")));

                mobileField.click();  // This performs the tap
                mobileField.sendKeys("9769449067");
                WebElement anotherElement =  driver.findElement(By.xpath("//com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]"));
                anotherElement.click();
                Thread.sleep(10000);
              /// Define the static OTP
//              String otp = "1234"; // Replace with your static OTP
//              List<WebElement> otpFields = driver.findElements(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView"
//              		));
//
//           // Check if the number of fields matches the OTP length
//           if (otpFields.size() == otp.length()) {
//               // Loop through each digit of the OTP and enter it into the corresponding input field
//               for (int i = 0; i < otp.length(); i++) {
//                   otpFields.get(i).sendKeys(String.valueOf(otp.charAt(i)));
//               }
//           } else {
//               // Handle the case where the number of fields is less than expected
//               System.out.println("Mismatch between OTP length and number of input fields.");
//           }
              //  String pin = "1111"; // Replace with the actual PIN

             // Wait until PIN input fields are visible
//             WebDriverWait waitA = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//             // Locate the PIN input fields
//            // List<WebElement> pinFields = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.view.ViewGroup\").instance(16)"));
//              List <WebElement> pinFields=  driver.findElements(By.xpath( "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView\r\n"
//              		));
//              WebElement wb = driver.findElement(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]"));
//              wb.click();
//             System.out.println("number of pin fields found:" + pinFields.size());
//             //if (pinFields.size() != pin.length()) {
//                 System.out.println("Mismatch between PIN length and number of input fields.");
//                for(WebElement field : pinFields) {
//                	System.out.println("Field:"+ field.getAttribute("android.view.ViewGroup"));
//                }
                // return;
//             }
//
//             // Loop through each digit of the PIN and enter it into the corresponding field
//             for (int i = 0; i < pin.length(); i++) {
//                 pinFields.get(i).sendKeys(String.valueOf(pin.charAt(i)));
//             }

             // Optionally, locate and click the submit/confirm button
//             WebElement submitButton = waitA.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]\r\n"
//             		)));
//             submitButton.click();
//
//             System.out.println("PIN entered successfully");
//             
//   

              //
              //// Submit the OTP form if necessary
//               WebElement submitButton = driver.findElement(By.id("submitButton")); // Update with actual button locator
//               submitButton.click();
//               
            
                try { 
                    // Explicit wait to ensure the element is available
                    WebDriverWait waitB = new WebDriverWait(driver, Duration.ofSeconds(10));
                    WebElement ph = wait.until(ExpectedConditions.visibilityOfElementLocated(
                        AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView"
                        		))
                    );

                    // Optionally, check if the element is clickable
                    wait.until(ExpectedConditions.elementToBeClickable(ph));
                     ph.click();
                    // Simulate key presses for entering the PIN
                  driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
                    driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
                    driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
                    driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));


                    // Locate the next element after entering the PIN
                    WebElement nextElement = wait.until(ExpectedConditions.visibilityOfElementLocated(
                        AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/com.horcrux.svg.SvgView/com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]"))
                    );

                    // Optionally interact with the next element
//                    nextElement.click(); // Replace with the actual action you need to perform
                    waitB.until(ExpectedConditions.elementToBeClickable(nextElement));
                    nextElement.click();
                    driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
                    
                    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
                    WebElement allowButton1 = wait1.until(ExpectedConditions.elementToBeClickable(
                    AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button")));
                    allowButton1.click();      		
                  
                                     		

                    
                    
                    System.out.println("PIN entered successfully.");
                } catch (NoSuchElementException e) {
                    System.out.println("Element not found: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }

                }
	}



           
                
                	
                
//driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().className(\"Enter the Class Name here\")"));     
	
                
            
	   

                    
                
            
        
              
                    
                
           
                
            
            
            
	   

	

/// Define the static OTP
//String otp = "1234"; // Replace with your static OTP
//
//// Loop through each digit of the OTP and enter it
//for (int i = 0; i < otp.length(); i++) {
//    // Locate the OTP input field by its index (assuming it's a list of elements)
//    WebElement otpField = driver.findElement(By.xpath("//input[@type='text'][" + (i + 1) + "]"));
//    otpField.sendKeys(String.valueOf(otp.charAt(i)));
//}
//
//// Submit the OTP form if necessary
//// WebElement submitButton = driver.findElement(By.id("submitButton")); // Update with actual button locator
//// submitButton.click();
//  

//caps.setCapability("appium:deviceName", "emulator-5554");
//caps.setCapability("appium:platformName", "Android");
//caps.setCapability("appium:app", "C:\\Users\\Leo1\\Downloads\\Leo1_UAT_ParentalRecharge_(3.2.8).apk");
//caps.setCapability("appium:automationName", "UiAutomator2");




