package ObjectRepository;

import org.openqa.selenium.By;

public class Windowspage {
	
	public static final By clickfornewTabbedwindowsbutton=By.xpath("//a/button");
	public static final By clickfornewwindow=By.xpath("//div/button[@onclick='newwindow()']");
	public static final By clickformultilewindows=By.xpath("//div/button[@onclick='multiwindow()']");
	public static final By opennewseparatewindows=By.xpath("//li/a[contains(text(),'Open New Seperate Windows')]");
	public static final By openmultiplewindows=By.xpath("//li/a[contains(text(),'Open Seperate Multiple Windows')]");
	//public static final By =By.xpath("");
	//public static final By =By.xpath("");

}
