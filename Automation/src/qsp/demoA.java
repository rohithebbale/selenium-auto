package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class demoA {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("https://www.google.com");
String title = d.getTitle();
System.out.println();
d.close();
	}

}
