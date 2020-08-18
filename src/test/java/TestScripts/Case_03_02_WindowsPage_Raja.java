package TestScripts;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import LibraryFiles.ReUsableLibrary;
import ObjectRepository.Windowspage;

public class Case_03_02_WindowsPage_Raja extends ReUsableLibrary{
	
	public void Case_03_02_WindowsPage() throws IOException{
		
		String appURL = getElementFromPropFile("WindowsUrl");
		
	      launchApplication(appURL);
	      
	      driver.findElement(Windowspage.opennewseparatewindows).click();
	      driver.findElement(Windowspage.clickfornewwindow).click();
	      logger.log(LogStatus.INFO, "clicked on click button to open new separate windows");

	Set<String> tabs=driver.getWindowHandles();
    Iterator<String> ite=tabs.iterator();
    
    while(ite.hasNext()){
  	  String childwindow=ite.next();
  	  driver.switchTo().window(childwindow);
  	  driver.manage().window().maximize();
  	  logger.log(LogStatus.INFO, "Switched to new Tab ");
    }
    
    String title=driver.getCurrentUrl();
    logger.log(LogStatus.INFO, "new WindowTitle - "+title);
    Assert.assertTrue(title.equals("http://www.sakinalium.in/"), "URL Validation Failed");
    logger.log(LogStatus.INFO, "New  window URL Validation Completed");
    System.out.println("New  window URL Validation Completed");
   
	}
}
