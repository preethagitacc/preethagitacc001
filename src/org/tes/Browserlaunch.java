package org.tes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\Seleniumfirst\\driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");

driver.manage().window().maximize();

driver.close();
		
		

	}

}
