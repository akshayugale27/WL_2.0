package com.BaseClass;

import java.time.Duration;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.utilityClass.Utilities;


public class PojoClass {
	WebDriver driver;
	public Properties prop;
	
	public void loadPropertiesFile() {
		
		prop = new Properties();
		File propFile = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\config\\config.properties");
		
		try {
			FileInputStream file = new FileInputStream(propFile);
			prop.load(file);
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
			
	}
		
			public WebDriver openBrowser(String browserName) {
				
				if (browserName.equals("Chrome")) {
				
					 driver = new ChromeDriver();
					
				}
				else if (browserName.equals("Firefox")) {
					
					 driver = new FirefoxDriver();
				}
				else if (browserName.equals("Edge")) {
					
					 driver = new EdgeDriver();
				}
		
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Utilities.IMPLICIT_WAIT_TIME));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utilities.PAGE_LOAD_TIME));
			
				driver.navigate().to(prop.getProperty("test_Admin"));
				 
				driver.navigate().refresh();
				
				return driver;
			}
			
		
		

}
