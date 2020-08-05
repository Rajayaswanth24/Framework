package ObjectRepository;

import org.openqa.selenium.By;

public class GilletteLoginPage {

	public static final By Username=By.xpath("//*[@id='phdesktopbody_0_username']");
	public static final By Password=By.xpath("//*[@id='phdesktopbody_0_Container']/div[2]/input");
	public static final By SignIN=By.xpath("//div/a[@title='SIGN IN']");
	public static final By Submit=By.xpath("//*[@id='phdesktopbody_0_Sign In']");
	
	public static final By AustriaUsername=By.xpath("//*[@id='username']");
	public static final By Austriapassword=By.xpath("//*[@id='password']");
	public static final By AustriaSigninbutton=By.xpath("//*[@id='login-submit']");
	public static final By AustriaAccount=By.xpath("//*[@class='responsiveAccountHeader_openAccountButton']");
	public static final By AustriaLogin=By.xpath("//*[@class='responsiveAccountHeader_accountLogin js-e2e-sign-in']");
	
}
