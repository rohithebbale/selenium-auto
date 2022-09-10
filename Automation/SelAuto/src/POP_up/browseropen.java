package POP_up;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browseropen {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
			WebDriver d = new ChromeDriver();
			d.get("https://www.naukri.com/");
			Set<String> a = d.getWindowHandles();
			int count = a.size();
			for(String t:a)
			{
				//d.switchTo().window(t);
				System.out.println(d.getTitle());
			}
			d.quit();
			
}
}

//WAS to get the titles of all the browsers opened by the naukri.com ?