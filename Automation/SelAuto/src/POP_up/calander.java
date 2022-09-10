//calender popup

package POP_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calander {

	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	driver.close();
	
		// TODO Auto-generated method stub

	}

}
