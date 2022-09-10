package POP_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class filedownload {


	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.selenium.dev/downloads/");
		d.findElement(By.xpath("//p[.='Java']/../p[2]/a")).click();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
				
	
	
	
	
	}
}
