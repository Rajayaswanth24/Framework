package TestScripts;

import java.io.IOException;

import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import LibraryFiles.ReUsableLibrary;
import ObjectRepository.AlertsPage;


public class Caseid_02_05_AlertsPage_Raja extends ReUsableLibrary {
	
	public void Caseid_02_05_AlertsPage() throws IOException{
		
		String appURL = getElementFromPropFile("Alertsurl");
		String ConfirmMessage;
      launchApplication(appURL);
       
      //Validating Alert Box
      
      driver.findElement(AlertsPage.ClickonAlertbox).click();
      logger.log(LogStatus.INFO, "Clicked on ALERT WITH OK  Alert box");
      driver.switchTo().alert().accept();
      logger.log(LogStatus.INFO, "Accepted the ALERT WITH OK  Alertbox");
      
      
      //validating AlertwithOKandCancel
      driver.findElement(AlertsPage.Alertwithokandcancel).click();
      driver.findElement(AlertsPage.ClickonAlertwithok).click();
      logger.log(LogStatus.INFO, "Clicked on ALERT WITH OK AND CANCEL Alert box");
      
      driver.switchTo().alert().accept();
      logger.log(LogStatus.INFO, "Accepted the ALERT WITH OK AND CANCEL Alertbox");
      ConfirmMessage =driver.findElement(AlertsPage.confirmationMessage).getText();
      Assert.assertTrue(ConfirmMessage.equals("You pressed Ok"), "Confirmation message is not Matched ");
      logger.log(LogStatus.INFO, "Validated the confirmation Message");
      
      //validating AlertwithOKandCancel
      driver.findElement(AlertsPage.Alertwithokandcancel).click();
      driver.findElement(AlertsPage.ClickonAlertwithok).click();
      logger.log(LogStatus.INFO, "Clicked on ALERT WITH OK AND CANCEL Alert box");
      driver.switchTo().alert().dismiss();
      logger.log(LogStatus.INFO, "Cancelled the ALERT WITH OK AND CANCEL Alertbox");
       ConfirmMessage=driver.findElement(AlertsPage.confirmationMessage).getText();
      Assert.assertTrue(ConfirmMessage.equals("You Pressed Cancel"), "Confirmation message is not Matched ");
      logger.log(LogStatus.INFO, "Validated the confirmation Message");
      
      //validating Alert with Text Box
      
      driver.findElement(AlertsPage.Alertwithtextbox).click();
      driver.findElement(AlertsPage.ClickonAlertwithTextbox).click();
      logger.log(LogStatus.INFO, "Clicked on ALERT WITH TEXT BOX  Alert box");
      custom3Sleep();
      custom3Sleep();
      driver.switchTo().alert().sendKeys("Raja");
      custom3Sleep();
      custom3Sleep();
      custom3Sleep();
      driver.switchTo().alert().accept();
      custom3Sleep();
      custom3Sleep();
      custom3Sleep();
      logger.log(LogStatus.INFO, "Entered the data in ALERT WITH TEXT BOX  Alertbox");
      ConfirmMessage =driver.findElement(AlertsPage.confirmationMessageforTextBox).getText();
      Assert.assertTrue(ConfirmMessage.equals("Hello Raja How are you today"), "Confirmation message is not Matched ");
      logger.log(LogStatus.INFO, "Validated the confirmation Message");
      
      
      //validating Alert with Text box
 
      
      driver.findElement(AlertsPage.Alertwithtextbox).click();
      driver.findElement(AlertsPage.ClickonAlertwithTextbox).click();
      logger.log(LogStatus.INFO, "Clicked on ALERT WITH TEXT BOX  Alert box");
      driver.switchTo().alert().dismiss();
      logger.log(LogStatus.INFO, "dismissed the ALERT WITH TEXT BOX  Alertbox");
     
      

}
}
