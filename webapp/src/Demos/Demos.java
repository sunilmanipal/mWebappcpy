package Demos;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Demos extends capability{
	
	AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException{
		driver = capabiilities();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	
	@Test
	public void testcase1() throws InterruptedException
	{
		//i want to open an URL in the browser of mobile app
		driver.get("http://www.google.com");
		//driver.navigate().to("http://www.google.com");
		//how to i inspect the element 
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("IBM");
		//i want to click on enter
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		//i want to scroll and click on IBM- wikipideia
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//*[contains(text(),'IBM - Wikipedia')]"));
		js.executeScript("arguments[0].scrollIntoView(false)",ele);
		ele.click();
		
	}

}
