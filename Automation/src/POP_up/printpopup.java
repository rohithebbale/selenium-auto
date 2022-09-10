package POP_up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class printpopup {

	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver d = new ChromeDriver();
	d.get("https://www.naukri.com/");
	Thread.sleep(2000);
	d.findElement(By.xpath("//a[@class='nI-gNb-lg-rg__login']")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("rohithebbale1@gmail.com");
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@type='password']")).sendKeys("rohit1234");
	d.findElement(By.xpath("//button[@type='submit']")).submit();
	Thread.sleep(2000);
	d.findElement(By.xpath("//div[@class='btn btn-block btn-large white-text']")).click();
	d.findElement(By.xpath("//i[@title='Click here to download your resume']")).click();
	Thread.sleep(2000);
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_ENTER);
	
	
	
	Thread.sleep(2000);
	
	
	
	}
}
