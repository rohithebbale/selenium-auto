package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutusingclick {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("http://demo.opensourcebilling.org/en/users/sign_in");
		d.findElement(By.id("user_login_btn")).submit();
		d.close();
	}
}
