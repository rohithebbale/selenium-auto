//WASTP font size, font type, and color of a forgotten password link present in facebook

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCSSvalue {

	static{
		System.setProperty("webdriver.chome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		String color = link.getCssValue("font size");
		String fontType = link.getCssValue("font.family");
		System.out.println("font size");
		System.out.println("font type");
		driver.close();	
		
	}

}
