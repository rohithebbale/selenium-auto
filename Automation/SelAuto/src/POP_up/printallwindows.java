package POP_up;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printallwindows {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
			WebDriver d = new ChromeDriver();
			d.get("https://www.naukri.com/");
			
			Set<String> a = d.getWindowHandles();
			int count = a.size();
			for(String s:a)
			{
				System.out.println(s);
			}
			d.close();
			
	}

}

//write a script to print all the windowHandles present in the naukri .com?