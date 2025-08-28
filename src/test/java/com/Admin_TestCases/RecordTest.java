package com.Admin_TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Admin_Pom.LoginPage;
import com.Admin_Pom.RecordPage;
import com.BaseClass.PojoClass;

	public class RecordTest extends PojoClass {

		WebDriver driver;
		LoginPage lp;
		
			@BeforeMethod
			public void setup() throws InterruptedException {
				
			  loadPropertiesFile();
			  driver = openBrowser(prop.getProperty("browserName"));
			  lp=new LoginPage(driver);
			  lp.login();
			  Thread.sleep(5000);
			  
			}
			
			@Test(priority=1)
			public void verifyRecord() throws InterruptedException {
			
				RecordPage Rp=new RecordPage(driver);
				Rp.record();
				Thread.sleep(5000);
				
				System.out.println("records");
			}
			
			
			@AfterMethod
			public void tearDown() throws InterruptedException {
				
				lp.logout();
			}

	}

