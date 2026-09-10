package driver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.RemoteWebDriver;

import configclass.loadConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverFactory {

	 public static AppiumDriver createDriver() throws MalformedURLException {
	        UiAutomator2Options options = new UiAutomator2Options();
	        options.setAutomationName("UiAutomator2");
	        options.setPlatformName("Android");

	        options.setApp(loadConfig.get("appPath"));
	        options.setAppPackage(loadConfig.get("appPackage"));
	        options.setAppActivity(loadConfig.get("appActivity"));

	        options.setNoReset(true);
	        options.setAutoGrantPermissions(true);
	        options.setAppWaitActivity("*");
	        options.setAppWaitDuration(Duration.ofSeconds(30));

	        String deviceType = loadConfig.get("deviceType");

	        if (deviceType.equalsIgnoreCase("real")) {
	            options.setUdid(loadConfig.get("realDeviceUdid"));
	        } else {
	            options.setDeviceName(loadConfig.get("emulatorName"));
	        }
	        String appiumUrl = loadConfig.get("appiumUrl");
	        return new AndroidDriver(URI.create(appiumUrl).toURL(), options);
	    }
}
