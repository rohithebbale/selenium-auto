package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemovetheText {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
	d.get("http://demo.opensourcebilling.org/en/users/sign_in");
	d.findElement(By.id("email")).clear();
	d.findElement(By.id("password")).clear();
	d.close();
	
	
	}
}
