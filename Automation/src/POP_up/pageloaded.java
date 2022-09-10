package POP_up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageloaded {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		try
		{
			d.get("https://demo.actitime.com/login.do");
			System.out.println("login page loaded in 5 seconds");
		}
		catch(Exception e)
		{
			System.out.println("login page is not loaded in 5 seconds");
		}
		d.close();
		
		
	}
	

}
