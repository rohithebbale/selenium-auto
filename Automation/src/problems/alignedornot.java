package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alignedornot {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
	d.get("https://demo.actitime.com/login.do");
	int A = d.findElement(By.id("username")).getLocation().getX();
		int	B = d.findElement(By.className("pwd")).getLocation().getX();
		if(A==B)
		{
			System.out.println("aligned properly");
		}
		else
		{
			System.out.println("aligned not properly");
		}
	
	
	
	}
}
