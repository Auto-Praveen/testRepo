package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	static WebDriver driver;

	public static WebDriver launchBrowser(String Browsername) {

		if (Browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Redirection\\pravev2\\Desktop\\TD\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Browsername.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		}

		return driver;
	}

}
