package TestScripts;

import java.io.File;

import Listeners.*;

import java.io.IOException;

import java.lang.reflect.Method;

import java.text.SimpleDateFormat;

import java.util.Date;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

import org.testng.Assert;

import org.testng.ITestResult;

import org.testng.SkipException;

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Listeners;

import org.testng.annotations.Optional;

import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import com.relevantcodes.extentreports.LogStatus;

import LibraryFiles.CreateLogger;

import LibraryFiles.ReUsableLibrary;

import LibraryFiles.TestStats;

@Listeners(MyListener.class)

public class BaseSuiteFile extends ReUsableLibrary {

private static String strHtmlDir = new SimpleDateFormat("MMddyy").format(new Date());

private static SimpleDateFormat strExtentReportName = new SimpleDateFormat("MMddyy_HHmmss");
Caseid_01_RegistrationPage_Raja oCaseid_01_RegistrationPage_Raja;
Caseid_02_05_AlertsPage_Raja oCaseid_02_05_AlertsPage_Raja;
case_03_Windows_Raja ocase_03_Windows_Raja;
Case_04_Frames_Raja oCase_04_Frames_Raja;
Case_03_02_WindowsPage_Raja oCase_03_02_WindowsPage_Raja;
Caseid_03_03_Windows_Raja oCaseid_03_03_Windows_Raja;
CaseId_07_01_GilletteSignin_Raja oCaseId_07_01_GilletteSignin_Raja;
//normal comment

@BeforeSuite

public void beforeSuite() {

CreateLogger.LOGGER.info("Suite STARTED");

System.out.println("Suite Started");

oCaseid_01_RegistrationPage_Raja = new Caseid_01_RegistrationPage_Raja();
oCaseid_02_05_AlertsPage_Raja=new Caseid_02_05_AlertsPage_Raja();
oCase_04_Frames_Raja=new Case_04_Frames_Raja();
ocase_03_Windows_Raja=new case_03_Windows_Raja();
oCase_03_02_WindowsPage_Raja=new Case_03_02_WindowsPage_Raja();
oCaseid_03_03_Windows_Raja=new Caseid_03_03_Windows_Raja();
oCaseId_07_01_GilletteSignin_Raja=new CaseId_07_01_GilletteSignin_Raja();
}

@BeforeClass

public void setup() {
	 
}

@Parameters({ "optional-browser" })

/*@BeforeMethod

public void beforeMethod(@Optional("optionalvalue") String browserFromSuiteXML, Method method) throws IOException {

try {

if (browserFromSuiteXML.equals("optionalvalue")) {

System.out.println("Browser value not passed in the suite xml");

OpenWDInstance();

logger = extent.startTest(method.getName(), method.getAnnotation(Test.class).description());

} else {

// Multi Browser SetUp

if (browserFromSuiteXML.equals("Firefox")) {

String GeckoDriverPath = getElementFromPropFile("GeckoDriverPath");

System.setProperty("webdriver.gecko.driver", GeckoDriverPath);

driver = new FirefoxDriver();

} else if (browserFromSuiteXML.equals("IE")) {

String ieDriverPath = getElementFromPropFile("InternetExplorerDriverPath");

System.setProperty("webdriver.ie.driver", ieDriverPath);

driver = new InternetExplorerDriver();

} else if (browserFromSuiteXML.equals("Chrome")) {

String userDir=System.getProperty("user.dir");

String chromeDriverPath =userDir+"//SupportingSoftware//chromedriver.exe";

System.setProperty("webdriver.chrome.driver", chromeDriverPath);

driver = new ChromeDriver();

} else if (browserFromSuiteXML.equals("PhantomJS")) {

String phantomJSexePath = getElementFromPropFile("PhantomJSPath");

File file = new File(phantomJSexePath);

System.setProperty("phantomjs.binary.path", file.getAbsolutePath());

driver = new PhantomJSDriver();

}

driver.manage().window().maximize();

System.out.println("Created Driver Instance and Launched Browser: " + browserFromSuiteXML);

extent.addSystemInfo("Browser", browserFromSuiteXML);

logger = extent.startTest(method.getName(), method.getAnnotation(Test.class).description());

logger.log(LogStatus.INFO, "Created Driver Instance And Launched Browser: " + browserFromSuiteXML);
CreateLogger.LOGGER.info("Created Driver Instance And Launched Browser: " + browserFromSuiteXML);

}

} catch (Exception e) {

logger.log(LogStatus.FAIL, "Failed to Create Driver Instance and Launched Browser: " + e.toString());
CreateLogger.LOGGER.info("Failed to Create Driver Instance and Launched Browser: " + e.toString());

Assert.fail("Failed to Create Driver Instance and Launched Browser: " + e.toString());

}

}*/

@BeforeTest

public void beforeTest() throws IOException {

try {

// Extent Report Configuration

String environment = getElementFromPropFile("Environment");

String projectName = getElementFromPropFile("ProjectName");

String release = getElementFromPropFile("Release");

String moduleName = getElementFromPropFile("ModuleName");

String strEnv = ReUsableLibrary.getElementFromPropFile("Environment");

String strEnvDir = ".//TestReports//HTMLReports//" + strEnv;

ReUsableLibrary.createDir(strEnvDir);

String strModuleDir = strEnvDir + "//" + release;

ReUsableLibrary.createDir(strModuleDir);

String htmlDirPath = strModuleDir + "//" + strHtmlDir;

ReUsableLibrary.createDir(htmlDirPath);

String htmlReportPath = htmlDirPath;

String file = htmlReportPath + "\\STMExtentReport" + strExtentReportName.format(new Date()) + ".html";

extent = new ExtentReports(file, false);

extent.addSystemInfo("Project Name", projectName).addSystemInfo("Environment", environment).addSystemInfo("Release", release).addSystemInfo("Module Name", moduleName);

extent.loadConfig(new File(System.getProperty("user.dir") + "\\extent-config.xml"));

System.out.println("Extent Report Configuration Completed");

} catch (Exception e) {

logger.log(LogStatus.FAIL, "Failed To Configure Extent Reports" + e.toString());

Assert.fail("Failed To Configure Extent Reports" + e.toString());

}

}


@Test(priority=1)
public void Caseid_02_05_AlertsPage_Raja() throws IOException, ParseException {
	
	oCaseid_02_05_AlertsPage_Raja.Caseid_02_05_AlertsPage();
	System.out.println("case 1 completed");
	
}



@Test(priority=2)
public void Case_04_Frames_Raja() throws IOException{
	oCase_04_Frames_Raja.Case_04_Frames();
	System.out.println("case 2 completed");
}
/*@Test()
public void Caseid_01_RegistrationPage_Raja() throws IOException, ParseException {
	oCaseid_01_RegistrationPage_Raja.Caseid_01_RegistrationPage();
}

@Test()
public void case_03_Windows_Raja() throws IOException{
	ocase_03_Windows_Raja.case_03_Windows();
}
@Test()
public void Case_03_02_WindowsPage_Raja() throws IOException{
	oCase_03_02_WindowsPage_Raja.Case_03_02_WindowsPage();
}

@Test()
public void Caseid_03_03_Windows_Raja() throws IOException {
	oCaseid_03_03_Windows_Raja.Caseid_03_03_Windows();
}

@Test()
public void CaseId_07_01_GilletteSignin_Raja() throws IOException, ParseException {
	oCaseId_07_01_GilletteSignin_Raja.CaseId_07_01_GilletteSignin();
}*/
@AfterMethod

public void afterMethod(ITestResult result) {

if (result.getStatus() == ITestResult.FAILURE) {

logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());

} else if (result.getStatus() == ITestResult.SKIP) {

logger.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());

}

String userDir=System.getProperty("user.dir");

String downloadFilePath=userDir+"//DownloadCases//";

//ReUsableLibrary.removeDir(downloadFilePath);

driver.close();

extent.endTest(logger);

}

@AfterTest

public void afterTest() {

custom3Sleep();

extent.flush();

extent.close();

}

@AfterClass

public void afterClass() {

}

@AfterSuite

public void afterSuite() {

TestStats.printTestStats();

CreateLogger.LOGGER.info("Suite ENDED");

logger.log(LogStatus.INFO, "Suite ended");

System.out.println("Suite Ended");
}
}
