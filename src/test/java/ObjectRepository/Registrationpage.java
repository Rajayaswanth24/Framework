package ObjectRepository;

import org.openqa.selenium.By;

public class Registrationpage {
	
	public static final By Firstname= By.xpath("//*[@placeholder='First Name']");
	public static final By Lastname= By.xpath("//*[@placeholder='Last Name']");
	public static final By Adress = By.xpath("//*[@ng-model='Adress']");
	public static final By EmailAdress= By.xpath("//*[@ng-model='EmailAdress']");
	public static final By PhoneNumber= By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input");
	public static final By Male= By.xpath("//*[@value='Male']");
	public static final By Female= By.xpath("//*[@value='FeMale']");
	public static final By cricket= By.xpath("//*[@value='Cricket']");
	public static final By Movies= By.xpath("//*[@value='Movies']");
	public static final By Hockey= By.xpath("//*[@value='Hockey']");
	public static final By Skill= By.xpath("//*[@ng-model='Skill']");
	
	public static final By countries= By.xpath("//*[@id='countries']");
	public static final By yearbox= By.xpath("//*[@id='yearbox']");
	public static final By monthbox= By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select");
	public static final By daybox= By.xpath("//*[@id='daybox']");
	public static final By password= By.xpath("//*[@id='basicBootstrapForm']/div[12]/div/input");
	public static final By ConfirmPassword= By.xpath("//*[@id='basicBootstrapForm']/div[13]/div/input");
	public static final By Submit= By.xpath("//*[@id='submitbtn']");
	public static final By demosite=By.xpath("//div/h4[1]");
	

}
