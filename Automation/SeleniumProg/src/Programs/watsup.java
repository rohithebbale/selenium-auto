package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class watsup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://www.youtube.com/");
		d.findElement(By.xpath("body[dir='ltr']")).sendKeys("Qspider");
		
		
	}

}
