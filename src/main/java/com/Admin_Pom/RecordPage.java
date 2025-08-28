package com.Admin_Pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.PojoClass;

public class RecordPage extends PojoClass{

	WebDriver driver;
	
	
	@FindBy(xpath="//span[normalize-space()='Record']")
	private WebElement record;
	
	@FindBy(id="react-select-12-live-region")
	//@FindBy(xpath="(//div[contains(@class,'css-13cymwt-control')])[2]")
	private WebElement providerDd;

	@FindBy(xpath="(//div[contains(text(),'Habanero')])[1]")
	private WebElement selectProvider;

	
	public RecordPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void record() throws InterruptedException {
		
		Thread.sleep(5000);
		record.click();
		System.out.println("Click on record");
		Thread.sleep(5000);
		
		providerDd.click();	
		//selectProvider.click();
		List<WebElement> options = driver.findElements(By.cssSelector(". css-13cymwt-control . css-1dimb5e-singleValue")); // Replace with the appropriate locator
		
		for (WebElement option : options) {
            System.out.println(option.getText());
        }
        
		 		
	}
}
