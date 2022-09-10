package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aligned {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
	d.get("https://en-gb.facebook.com/");
	d.findElement(By.xpath("//a[@role='button']")).click();
	Thread.sleep(2000);
	int a = d.findElement(By.xpath("//input[@value=2972]")).getLocation().getY();
	int b = d.findElement(By.xpath("//input[@value=2]")).getLocation().getY();
	int c = d.findElement(By.xpath("//input[@value=-1]")).getLocation().getY();
	if((a==b) && (a==c))
	{
		System.out.println("properly aligned");
	}
	else
	{
		System.out.println("properly not aligned");
	}
	d.close();
	
	
	
	}
}
