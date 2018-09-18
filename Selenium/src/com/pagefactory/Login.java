package com.pagefactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;
	
	public void newLogin() {

		driver = LaunchBrowser.launchBrowser("chrome");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		facebookLogin fblogin = PageFactory.initElements(driver, facebookLogin.class);
		fblogin.login("praveeee@gmail.com", "hanumanji99%");

	}
	
	public void alertHandle() {
		
		/*try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Alert al = driver.switchTo().alert();
				al.dismiss();*/
		
		System.out.println("Welcome to facebook homepage");
		
	}

	public static void main(String[] args) {
		Login l = new Login();
		l.newLogin();
		l.alertHandle();
	}

}
