package ObjectRepository;

import org.openqa.selenium.By;

public class AlertsPage {
	
	public static final By ClickonAlertbox= By.xpath("//*[@class='btn btn-danger']");
	public static final By Alertwithokandcancel= By.xpath("//li[2]/a[contains(text(),'Alert with OK & Cancel ')]");
	public static final By Alertwithtextbox= By.xpath("//li[3]/a[contains(text(),'Alert with Textbox ')]");
	public static final By ClickonAlertwithok= By.xpath("//*[@class='btn btn-primary']");
	public static final By ClickonAlertwithTextbox= By.xpath("//*[@class='btn btn-info']");
	public static final By confirmationMessage=By.xpath("//div/p[@id='demo']");
	public static final By confirmationMessageforTextBox=By.xpath("//div/p[@id='demo1']");
	

}
