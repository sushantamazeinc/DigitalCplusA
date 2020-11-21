package com.dca.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.dca.pages.LoginPage;
import com.dca.utility.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public LoginPage loginpage;
	
	public static Properties prop;
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	


	/*
	 * @BeforeSuite public void setup() throws IOException { prop = new
	 * Properties(); FileInputStream ip = new FileInputStream(
	 * System.getProperty("user.dir") + "\\Configuration\\config.properties");
	 * prop.load(ip); WebDriverManager.chromedriver().setup(); driver.set(new
	 * ChromeDriver()); getDriver().manage().window().maximize();
	 * getDriver().manage().deleteAllCookies();
	 * getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 * 
	 * String url=prop.getProperty("url"); getDriver().get(url);
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * } public static WebDriver getDriver() { // Get Driver from threadLocalmap
	 * return driver.get(); }
	 * 
	 * @AfterSuite public void teardown() { getDriver().quit();
	 * 
	 * }
	 */
	@BeforeSuite()
	public void loadConfig() {
		ExtentManager.setExtent();
		DOMConfigurator.configure("log4j.xml");

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configuration\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

	public static WebDriver getDriver() {
		// Get Driver from threadLocalmap
		return driver.get();
	}

	public void launchApp() {
		String browserName = prop.getProperty("browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			// Set Browser to ThreadLocalMap
			driver.set(new ChromeDriver());
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
		} else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver.set(new InternetExplorerDriver());
		}
		//Maximize the screen
		getDriver().manage().window().maximize();
		//Delete all the cookies
		getDriver().manage().deleteAllCookies();
		//Implicit TimeOuts
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		getDriver().get(prop.getProperty("url"));
	}

	@AfterSuite()
	public void afterSuite() {
		ExtentManager.endReport();
		
	
	}

}
