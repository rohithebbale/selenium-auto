package POP_up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class counttabafterclick {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		Set<String> a = d.getWindowHandles();
		int count = a.size();
		System.out.println(count);
	d.close();
	
	
	//Q:	 WAS to count the number of tabs present in the browser after clicking
	//		actiTIME inc. link ?

	
	
	
	
	}
}
