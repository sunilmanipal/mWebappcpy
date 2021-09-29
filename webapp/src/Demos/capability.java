package Demos;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class capability {

	public static AndroidDriver<AndroidElement> capabiilities() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		//This are the capabilites which are manadatory all the time 
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "sunil Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//Automation Name 
		//This is optional in android //but this is mandatory when it comes IPhone 
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		//in mac machien we use xcode to simulate ui Test//xc//this something very mandatory 
		
		// what kind of application i am testing
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "D:\\chromedriver_win32\\chrome driver 91\\chromedriver.exe");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		return driver;
		

	}

}
