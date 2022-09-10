package POP_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='submit']")).click();
 String text = driver.switchTo().alert().getText();
 driver.switchTo().alert().accept();
 System.out.println(text);
 driver.close();
		
		
		
}
}