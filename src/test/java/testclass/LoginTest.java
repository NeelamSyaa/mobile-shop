package testclass;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import baseclass.Basetest;
import io.appium.java_client.AppiumBy;

public class LoginTest extends Basetest {

	
	@Test
		public static void  loginapp() throws InterruptedException {
			
		Thread.sleep(3000);
	 WebElement un = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Username\"]"));
	 
	 un.clear();
	 un .sendKeys("7865554342");
		
			driver.findElement(By.xpath("//android.widget.EditText[@text=\"Password\"]\r\n"
					+ "")).sendKeys("7865554342");
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]\r\n"
					+ "")).click();
			Thread.sleep(3000);

			String actualText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Invalid username or password.']")).getText();
			assertEquals(actualText, "Invalid username or password.");

	}}

