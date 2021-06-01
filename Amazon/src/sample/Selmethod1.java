package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selmethod1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./selenium/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
	}

}
