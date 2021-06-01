package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loca1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./selenium/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Prajwal/OneDrive/Desktop/Locatores.html");
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.id("a1")).click();
		//driver.findElement(By.name("n1")).click();
		//driver.findElement(By.className("c1")).click();
	
	
	}

}
