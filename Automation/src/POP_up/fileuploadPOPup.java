package POP_up;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadPOPup {


	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(3000);
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("rohithebbale1@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rohit1234");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[.='UPDATE PROFILE']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='secondary-content']")).click();
	Thread.sleep(2000);
	File f = new File("./driver/rrhh.docx.rtf");
	String absolutepath = f.getAbsolutePath();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='attachCV']")).sendKeys(absolutepath);
	
	
	
	
	
	}
}