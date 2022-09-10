package POP_up;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wordinActiTime {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/login.do");
		FileInputStream f = new FileInputStream("./driver/acti.txt");
		Properties p = new Properties();
		p.load(f);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		d.findElement(By.id("username")).sendKeys(un);
		d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		d.findElement(By.xpath("//div[text()='Login']")).click();
		d.close();
		
	}
//: WAS to login to actiTIME application by taking the test data from the property file.

}
