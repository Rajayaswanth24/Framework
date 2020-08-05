package TestScripts;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import LibraryFiles.ReUsableLibrary;
import ObjectRepository.GilletteLoginPage;

public class CaseId_07_01_GilletteSignin_Raja extends ReUsableLibrary{
	
	public void CaseId_07_01_GilletteSignin() throws IOException, ParseException {
		String Indiaurl = getElementFromPropFile("Gilletteindiaurl");
		String GilletteAustriaurl=getElementFromPropFile("GilletteAustriaurl");
		
		String Launchurl=GilletteAustriaurl;
	      launchApplication(Launchurl);
	      String filepath=getElementFromPropFile("TestdataFilePath");
			
			File jsonfilepath=new File(filepath);
			JSONParser jsonParser = new JSONParser();
			FileReader reader = new FileReader(jsonfilepath);
			//Read JSON file
			JSONObject obj = (JSONObject)jsonParser.parse(reader);
			JSONObject jsonobject =(JSONObject) obj;
			String GilletteUsername=jsonobject.get("GilletteUsername").toString();
			
	      
	      if(Launchurl.equals(Indiaurl)) {
	    	  custom3Sleep();
	    	  driver.findElement(GilletteLoginPage.SignIN).click();
	    	  custom3Sleep();
	    	  driver.findElement(GilletteLoginPage.Username).sendKeys(GilletteUsername);
	    	  driver.findElement(GilletteLoginPage.Password).sendKeys(jsonobject.get("Gillettepassword").toString());
	    	  driver.findElement(GilletteLoginPage.Submit).click();
	    	  
	     
	      
	      }
	      else {
	    	  Actions actions = new Actions(driver);
	    	  WebElement Account = driver.findElement(GilletteLoginPage.AustriaAccount);
	    	  actions.moveToElement(Account);
	    	  actions.click().build().perform();
	    	  WebElement Signin = driver.findElement(GilletteLoginPage.AustriaLogin);
	    	  actions.moveToElement(Signin);
	    	  actions.click().build().perform();
	    	  
	    	 
	    	  custom3Sleep();
	    	  driver.findElement(GilletteLoginPage.AustriaUsername).sendKeys(GilletteUsername);
	    	  driver.findElement(GilletteLoginPage.Austriapassword).sendKeys(jsonobject.get("GilletteAustriapassword").toString());
	    	  driver.findElement(GilletteLoginPage.AustriaSigninbutton).click();
	    	  System.out.println("login completed");
	    	  
	      }
	    
	}

}
