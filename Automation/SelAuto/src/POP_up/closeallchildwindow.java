package POP_up;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeallchildwindow {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.naukri.com/");
		Set<String> a = d.getWindowHandles();
		int text = a.size();
		for(String s:a)
		{
			System.out.println(d.getTitle());
			Thread.sleep(2000);
		}
	d.close();
	
//WAS to close all the browsers present in naukri.com without using quit()?
	
		
	}
}
