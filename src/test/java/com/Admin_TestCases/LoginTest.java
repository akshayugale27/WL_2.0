package com.Admin_TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Admin_Pom.LoginPage;
import com.BaseClass.PojoClass;


public class LoginTest extends PojoClass {

WebDriver driver;
LoginPage lp;

	@BeforeMethod
	public void setup() {
		
	  loadPropertiesFile();
	  driver = openBrowser(prop.getProperty("browserName"));
	  
	}
	
	@Test(priority=1)
	public void verifyLogin() throws InterruptedException {
	
		lp=new LoginPage(driver);
		lp.login();
		Thread.sleep(5000);
		
		System.out.println("english");
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		lp.logout();
		
	}

}
