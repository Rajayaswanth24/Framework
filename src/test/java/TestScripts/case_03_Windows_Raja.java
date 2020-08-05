package TestScripts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import LibraryFiles.ReUsableLibrary;
import ObjectRepository.Windowspage;

public class case_03_Windows_Raja extends ReUsableLibrary {
	
	public void case_03_Windows() throws IOException {
		
		String appURL = getElementFromPropFile("WindowsUrl");
		
	      launchApplication(appURL);
	      
	      driver.findElement(Windowspage.clickfornewTabbedwindowsbutton).click();
	      String parentwindow=driver.getWindowHandle();
	      logger.log(LogStatus.INFO, "Clicked on click button to open new Tab");
	      Set<String> tabs=driver.getWindowHandles();
	      Iterator<String> ite=tabs.iterator();
	      
	      while(ite.hasNext()){
	    	  String childwindow=ite.next();
	    	  driver.switchTo().window(childwindow);
	    	  logger.log(LogStatus.INFO, "Switched to new Tab ");
	      }
	      
	      String title=driver.getCurrentUrl();
	      logger.log(LogStatus.INFO, "new Tab Title -"+title);
	      
	     Assert.assertTrue(title.equals("http://www.sakinalium.in/"), "URL Validation Failed");
	     logger.log(LogStatus.INFO, "Child URL Validation Completed");
	      
	      
	      
		
	}

}
