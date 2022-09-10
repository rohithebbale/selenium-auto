package problems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("http://demo.opensourcebilling.org/en/users/sign_in");
		WebElement result = d.findElement(By.xpath("//button[@name='btn_login']"));
		String s = result.getTagName();
		String s1 = result.getAttribute("class");
		String s2 = result.getText();
		System.out.println(s1);
		System.out.println(s2);
		d.close();
}
}