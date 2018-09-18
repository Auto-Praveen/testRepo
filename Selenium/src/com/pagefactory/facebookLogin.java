package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class facebookLogin {

	WebDriver driver;

	
	/*facebookLogin(WebDriver driver1){
		
		driver = driver1;
	}*/
	
	
	@FindBy(id = "email")
	WebElement Email;
	
	@FindBy(id = "pass")
	WebElement Password;
	
	@FindBy(id = "u_0_w")
	WebElement Submit;
	
	public void login(String uid, String pwd) {
		
		Email.sendKeys(uid);
		Password.sendKeys(pwd);
		Submit.click();
		
		
	}

}
