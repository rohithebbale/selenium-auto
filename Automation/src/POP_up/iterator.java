package POP_up;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iterator {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		d.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> a = d.getWindowHandles();
		Iterator<String> itr = a.iterator();
		String pwh = itr.next();
		String cwh = itr.next();
		d.close();
		d.switchTo().window(pwh);
		d.close();
		d.switchTo().window(cwh);
		d.quit();
		
	
	
	}
}
