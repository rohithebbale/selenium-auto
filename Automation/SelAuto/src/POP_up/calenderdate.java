package POP_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class calenderdate {

	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
driver.findElement(By.id("policynumber")).sendKeys("123");
	driver.findElement(By.id("dob")).click();
	
	WebElement mon = driver.findElement(By.className("ui-datepicker-month"));
	Select m = new Select(mon);
	m.selectByValue("12");
	
	WebElement year = driver.findElement(By.className("ui-datepicker-month"));
	Select y = new Select(year);
	y.selectByValue("1997");
	
	driver.findElement(By.xpath("//a[.='14']")).click();
	
	driver.findElement(By.id("alternative_number")).sendKeys("9876543210");
	driver.findElement(By.id("renew_policy_submit")).submit();
	
	
	
	
	}
}