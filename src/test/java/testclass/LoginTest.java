package testclass;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import baseclass.Basetest;
import io.appium.java_client.AppiumBy;
import utiliticlass.ReadExcel;

public class LoginTest extends Basetest {

	
	@Test
		public static void  loginapp() throws InterruptedException {
		ReadExcel re = new ReadExcel();
		 String username = re.getData(1, 0);
		    String password = re.getData(1, 1);
		    
		Thread.sleep(3000);
	 WebElement un = driver.findElement(By.xpath("//android.widget.EditText[@text=\"Username\"]"));
	 
	 un.clear();
	 un .sendKeys("username");
		
			driver.findElement(By.xpath("//android.widget.EditText[@text=\"Password\"]\r\n"
					+ "")).sendKeys("password");
			driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login\"]\r\n"
					+ "")).click();
			Thread.sleep(3000);

			String actualText = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Invalid username or password.']")).getText();
			assertEquals(actualText, "Invalid username or password.");
			

	}
	}

