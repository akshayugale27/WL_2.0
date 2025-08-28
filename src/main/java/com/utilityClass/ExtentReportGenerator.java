package com.utilityClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator 
{
	
		public static ExtentReports extent;
		public static ExtentReports  getreport() 
		{
			
			//String path="D:\\Users\\trushantmahatkar\\eclipse-workspace\\WL_2.0\\report\\index.html";
			String path1=("user.dir")+"\\com.WL2\\report";
			ExtentSparkReporter reporter = new ExtentSparkReporter(path1);
			reporter.config().setDocumentTitle("Admin Report");
			reporter.config().setReportName("test report");
			reporter.config().setTheme(Theme.STANDARD);
			
			extent =new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("System","Test");
			extent.setSystemInfo("QA","Akshay");
			
			return extent;
		}
}
