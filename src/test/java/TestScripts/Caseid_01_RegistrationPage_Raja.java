package TestScripts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import LibraryFiles.CreateLogger;
import LibraryFiles.ReUsableLibrary;
import ObjectRepository.Registrationpage;
import junit.framework.Assert;

public class Caseid_01_RegistrationPage_Raja extends ReUsableLibrary{
	
	public void Caseid_01_RegistrationPage() throws IOException, ParseException {
		
        String filepath=getElementFromPropFile("TestdataFilePath");
		
		File jsonfilepath=new File(filepath);
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(jsonfilepath);
		//Read JSON file
		JSONObject obj = (JSONObject)jsonParser.parse(reader);
		JSONObject jsonobject =(JSONObject) obj;
		String name=jsonobject.get("Firstname").toString();
		logger.log(LogStatus.INFO, "Fetched data from Datafile ");
		
		String appURL = getElementFromPropFile("demositeurl");

		
		launchApplication(appURL);
		
	
	driver.findElement(Registrationpage.Firstname).sendKeys(name);
	logger.log(LogStatus.INFO, "Entered data for Firstname");
	
	driver.findElement(Registrationpage.Lastname).sendKeys(jsonobject.get("Lastname").toString());
	logger.log(LogStatus.INFO, "Entered data for Lastname");
	driver.findElement(Registrationpage.Adress).sendKeys(jsonobject.get("Adress").toString());
	logger.log(LogStatus.INFO, "Entered data for Adress");
	driver.findElement(Registrationpage.EmailAdress).sendKeys(jsonobject.get("Email").toString());
	logger.log(LogStatus.INFO, "Entered email ");
	driver.findElement(Registrationpage.PhoneNumber).sendKeys(jsonobject.get("phonenumber").toString());
	logger.log(LogStatus.INFO, "Entered data for mobile number");
	
	driver.findElement(Registrationpage.Male).click();
	logger.log(LogStatus.INFO, "Selected Gender");
	driver.findElement(Registrationpage.cricket).click();
	logger.log(LogStatus.INFO, "Selected Hobbies");
	
	//Selecting skill
	WebElement skill=driver.findElement(Registrationpage.Skill);
	Select sk=new Select(skill);
	sk.selectByVisibleText("Java");
	logger.log(LogStatus.INFO, "Selected Skill");
	//Selecting countries
	WebElement countries=driver.findElement(Registrationpage.countries);
	Select sl=new Select(countries);
	sl.selectByVisibleText("India");
	logger.log(LogStatus.INFO, "Selected countries");
	
	//Selecting year
	
	WebElement Years=driver.findElement(Registrationpage.yearbox);
	Select yrb=new Select(Years);
	yrb.selectByVisibleText("1996");
	
	//Selecting month
	WebElement month=driver.findElement(Registrationpage.monthbox);
	Select mo=new Select(month);
	mo.selectByVisibleText("January");
	
	
	//Selecting day
		WebElement day=driver.findElement(Registrationpage.daybox);
		Select dy=new Select(day);
		dy.selectByVisibleText("24");
		logger.log(LogStatus.INFO, "Selected DOB");
		
	driver.findElement(Registrationpage.password).sendKeys(jsonobject.get("password").toString());
	logger.log(LogStatus.INFO, "Entered data for password");
	driver.findElement(Registrationpage.ConfirmPassword).sendKeys(jsonobject.get("password").toString());
	logger.log(LogStatus.INFO, "Entered data for confirm password");
	
	driver.findElement(Registrationpage.Submit).click();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	custom9Sleep();
	custom9Sleep();
	String title=driver.findElement(Registrationpage.demosite).getText();
	System.out.println("Message- "+title);
	
	Assert.assertTrue(title.equals("- Double Click on Edit Icon to"));
	
   logger.log(LogStatus.INFO, "Regitration Completed successfully");
   CreateLogger.LOGGER.info("Regitration Completed successfully");
	
	//driver.findElement(Registrationpage)
	
	}
}
