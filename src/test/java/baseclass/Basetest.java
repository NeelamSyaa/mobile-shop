package baseclass;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import configclass.loadConfig;
import driver.DriverFactory;
import io.appium.java_client.AppiumDriver;

public class Basetest {
	public static AppiumDriver driver;
	

    @BeforeMethod
    public void setup() throws IOException {
        loadConfig.datafile1();
        driver = DriverFactory.createDriver();
        System.out.println("App launched successfully!");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("App closed.");
        }
}
}