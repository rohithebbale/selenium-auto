package POP_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confermationPOPUP {

	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		driver.findElement(By.className("signinbtn")).click();
		String t = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		System.out.println(t);
		driver.close();
		

	}

}
