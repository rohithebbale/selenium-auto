package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/");
		driver.findElement(By.id("email")).sendkeys(keys.control+"ac");
		driver.findElement(By.id("pwd")).sendKeys(keys.contol+"av");
		
	}

}
