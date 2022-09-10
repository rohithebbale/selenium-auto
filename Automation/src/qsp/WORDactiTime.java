package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WORDactiTime {
	static{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		FileInputStream fis = new FileInputStream("./driver/data/RRR.proprty.txt");
		Properties p = new Properties();
		p.load(fis);
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
	}

}
