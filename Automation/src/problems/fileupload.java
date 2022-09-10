package problems;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://www.naukri.com/");
		Timeouts w = d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		d.findElement(By.id("login_Layer")).click();
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("rohithebbale1@gmail.com");
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("rohit1234");
		d.findElement(By.xpath("//button[@type='submit']")).click();
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		d.findElement(By.xpath("//div[.='UPDATE PROFILE']")).click();
		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		d.findElement(By.xpath("//a[.='Update']")).click();
		File f = new File("./driver/rrhh.docx.rtf");
		String abspath = f.getAbsolutePath();

		d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		d.findElement(By.xpath("(//input[@class='fileUpload waves-effect waves-light btn-large'])[1]")).sendKeys(abspath);

	
	}
}