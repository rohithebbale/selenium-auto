package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hightWidth {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
	WebElement login = d.findElement(By.name("login"));
	int height = d.findElement(By.name("login")).getSize().getHeight();
	int width = d.findElement(By.name("login")).getSize().getWidth();
	System.out.println(width);
	System.out.println(height);
	d.close();
	
	
	}
}
