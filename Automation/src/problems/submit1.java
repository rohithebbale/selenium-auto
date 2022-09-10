package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit1 {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("http://demo.opensourcebilling.org/en/users/sign_in");
		Thread.sleep(2000);
		WebElement r = d.findElement(By.xpath("//button[@id='user_login_btn']"));
		String s = r.getText();
		String s1 = r.getTagName();
		String s2 = r.getAttribute("class");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		d.close();
	}

}
