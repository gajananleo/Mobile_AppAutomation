//package com.automation;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import io.appium.java_client.android.AndroidDriver;
//
//public class Dummy 
//{
//	public static AndroidDriver driver;
//
//    @SuppressWarnings("deprecation")
//	public static void main(String[] args) throws MalformedURLException {
//        DesiredCapabilities caps = new DesiredCapabilities();
//
//        // Set your desired capabilities
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("automationName", "UiAutomator2");
//        caps.setCapability("deviceName", "gajananEmu");
//        caps.setCapability("app", "C:\\Users\\Leo1\\eclipse-works..."); // Add your app's full path
//
//        driver = new AndroidDriver(new URL("http://10.7.30.109:4723/wd/hub"),caps);
//    }
//                String otp = "1111";
//                for(int i=0;i<otp.length();i++)
//                {
//                	WebElement otpfield = driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]"));
//                    otpfield.sendKeys(String.valueOf(otp.charAt(i)));
//                    WebElement submitbutton = driver.findElement(By.xpath("//com.horcrux.svg.GroupView/com.horcrux.svg.PathView[1]")
//                    		);
//                    submitbutton.click();
//                
//            
	  

//
//
//}
//
