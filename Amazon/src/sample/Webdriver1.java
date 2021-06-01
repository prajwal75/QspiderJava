package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./selenium/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9844721698");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Prajju2113+");
		driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();
		
		
	}

}
