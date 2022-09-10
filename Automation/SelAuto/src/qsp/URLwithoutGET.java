package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class URLwithoutGET {

	
			static{
				System.setProperty("webdriver.chome.driver","./driver/chromedriver.exe");
			}
			public static void main(String[] args) throws InterruptedException {
				ChromeDriver driver = new ChromeDriver();
				driver.navigate().to("https://www.google.com/");
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(4000);
				driver.navigate().forward();
				Thread.sleep(3000);
				driver.navigate().refresh();
				Thread.sleep(3500);
				driver.close();
				
	}

}
