package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fp {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/login/");
		WebElement a = d.findElement(By.className("_97w4"));
		String s1 = a.getCssValue("color");
		String s2 = a.getCssValue("font-size");
		String s3 = a.getCssValue("font-weight");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		d.close();
}
}