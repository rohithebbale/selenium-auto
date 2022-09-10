package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class colur {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
	d.get("https://en-gb.facebook.com/");
	WebElement link = d.findElement(By.linkText("Forgotten password?"));
String color = link.getCssValue("color");
System.out.println(color);
String frontType = link.getCssValue("front-family");
System.out.println("frontType");
String frontSize = link.getCssValue("front-size");
System.out.println(frontSize);
	
}
}