package POP_up;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closewindowexceptparent {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.naukri.com/");
		Set<String> a = d.getWindowHandles();
		String parent = d.getWindowHandle();
		for(String s:a)
		{
			d.switchTo().window(s);
			if(parent.equals(s));
			
		
		
		else
		d.close();
}
}
}
//WAS to close all browsers except the parent browser in naukri.com?