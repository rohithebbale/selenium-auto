package POP_up;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
