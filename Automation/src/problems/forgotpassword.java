package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forgotpassword {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
	d.get("https://demo.actitime.com/login.do");
	d.manage().window().maximize();
	String text = d.findElement(By.id("toPasswordRecoveryPageLink")).getText();
	System.out.println(text);
	d.close();
	
	}
}
