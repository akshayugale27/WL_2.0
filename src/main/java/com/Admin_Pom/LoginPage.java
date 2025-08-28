package com.Admin_Pom;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.PojoClass;

public class LoginPage extends PojoClass {

		WebDriver driver;
	
		//public Properties prop;
		
		
		
		@FindBy(xpath="//input[@placeholder='Enter username']")
		private WebElement username;
		
		@FindBy(xpath="//input[@placeholder='Enter password']")
		private WebElement password;
		
		@FindBy(xpath="//input[@placeholder='Enter Captcha']")
		private WebElement captcha;
		
		@FindBy(xpath="//input[@value='login']")
		private WebElement loginButton;

		@FindBy(xpath="(//button[@id='page-header-user-dropdown'])[1]")
		private WebElement logoutDd;
		
		@FindBy(xpath="(//button[@class='dropdown-item'])[3]")
		private WebElement logout;


	
		
		public LoginPage(WebDriver driver) {
			
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		public void login() throws InterruptedException {
			
			
			Thread.sleep(5000);
//			Properties prop=new Properties();
//			username.sendKeys(prop.getProperty("test_Admin"));
//			Thread.sleep(2000);
//			password.sendKeys(prop.getProperty("password"));
//			Thread.sleep(2000);
//			captcha.sendKeys(prop.getProperty("captcha"));
			
			username.sendKeys("akshay3");
			System.out.println("username");
			password.sendKeys("Test#000");
			System.out.println("password");
			captcha.sendKeys("dsfdd");
			System.out.println("captcha");
			loginButton.click();
			System.out.println("LoginDone");
					   		
		}
		
		public void logout() throws InterruptedException {
			
			logoutDd.click();
			Thread.sleep(2000);
			logout.click();
		}

			
	}
	


