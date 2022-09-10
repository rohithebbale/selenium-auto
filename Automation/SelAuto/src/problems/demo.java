package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qspiders.com/");
		driver.findElement(By.tagName("a"));
		driver.close();
	}

}
