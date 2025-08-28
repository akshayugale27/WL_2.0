
package com.utilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Admin_Pom.LoginPage;
import com.BaseClass.PojoClass;
 
/**
 * @author Admin
 *
 */
public class Supply extends PojoClass
{
    WebDriver driver;
    WebDriverWait wait;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
 
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		
	  loadPropertiesFile();
	  driver = openBrowser(prop.getProperty("browserName"));
	  
	}
	
 @Test
 public void importData() throws IOException
 {
     // Import excel sheet.
     File src=new File("C:\\Users\\Admin\\Desktop\\TestData.xlsx");
      
     // Load the file.
     FileInputStream finput = new FileInputStream(src);
      
     // Load he workbook.
    workbook = new XSSFWorkbook(finput);
      
     // Load the sheet in which data is stored.
     sheet= workbook.getSheetAt(0);
      
     for(int i=0; i<=1; i++)
     {
    	 for(int j=0; j<=2; j++)
    	 {
         // Import data for Email.
         cell = sheet.getRow(i).getCell(j);
         //cell.setCellType(Cell.CELL_TYPE_STRING);
         driver.findElement(By.xpath("//textarea[@id='outlined-textarea'])[1]")).sendKeys(cell.getStringCellValue());
         driver.findElement(By.id("pass")).sendKeys(cell.getStringCellValue());
         
//         Import data for password.
//         cell = sheet.getRow(i).getCell(2);
//         cell.setCellType(Cell.CELL_TYPE_STRING);
//         driver.findElement(By.id("login-password")).sendKeys(cell.getStringCellValue());
          
//           cell.setCellType(Cell.CELL_TYPE_STRING);   
    	 }
     }
 } 
}