package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class heightWidthActitime {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
	d.get("https://demo.actitime.com/login.do");
	WebElement un = d.findElement(By.name("username"));
	int h1 = un.getSize().getHeight();
	int w1 = un.getSize().getWidth();
	
	
	WebElement pd = d.findElement(By.name("pwd"));
	int h2 = pd.getSize().getHeight();
	int w2 = pd.getSize().getWidth();
	
	if((h1==h2) && (w1==w2))
	{
		System.out.println("height and width is same");
	}
	else
	{
		System.out.println("height and width is not same");
	}
	d.close();
	
	}
}
