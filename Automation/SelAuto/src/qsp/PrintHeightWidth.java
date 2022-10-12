//WAST print height and width of Email textbox present in facebook

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrintHeightWidth {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email Tbx= driver.findElement(By.id("email"));
		int height = email Tbx.getsize().getheight();
		int width = email Tbx.getsize().getwidth();
		System.out.println("Height"+height);
		System.out.println("Width"+width);
		driver.close();
		

	}

}
