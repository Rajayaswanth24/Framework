package TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import LibraryFiles.ReUsableLibrary;
import ObjectRepository.FramesPage;

public class Case_04_Frames_Raja extends ReUsableLibrary{
	
	public void Case_04_Frames() throws IOException{
		
		String browser = getElementFromPropFile("Browser");
		OpenWDInstance(browser);
		
		
		String appURL = getElementFromPropFile("Framesurl");
		
      launchApplication(appURL);
      custom9Sleep();
      custom9Sleep();
      driver.switchTo().frame("SingleFrame");
      logger.log(LogStatus.INFO, "Switched to Single Inner Frame");
      driver.findElement(FramesPage.inputbox).sendKeys("Raja");
      logger.log(LogStatus.INFO, "Entered the data in single frame input box");
      driver.switchTo().defaultContent();
      logger.log(LogStatus.INFO, "Switched to default content");
      driver.findElement(FramesPage.innerframe).click();
      logger.log(LogStatus.INFO, "clicked on iframe with in iframe");
     // driver.switchTo().frame("SingleFrame");
      WebElement framexpath=driver.findElement(By.xpath("//*[@id='Multiple']/iframe"));
      
      driver.switchTo().frame(framexpath);
      logger.log(LogStatus.INFO, "Switched to multiple inner frame");
      WebElement innerframepath=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
    
      driver.switchTo().frame(innerframepath);
      logger.log(LogStatus.INFO, "Switched to inner frame inside multiple inner frame");
      driver.findElement(FramesPage.inputbox).sendKeys("Raja");
      logger.log(LogStatus.INFO, "entered the data in input box in multiple frame ");
       System.out.println("entered the data in input box in multiple frame");
		
	}

}
