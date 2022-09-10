package POP_up;

import java.util.Set;

import org.apache.commons.math3.distribution.WeibullDistribution;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class countchildpopup {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.naukri.com/");
		Set<String> a = d.getWindowHandles();
		int count = a.size();
		System.out.println(count);
		d.quit();
		
		
		//write a script to count number of browsers opened in noukari.com
		
		
		
		
	}

}
