package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seljava {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./selenium/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	}
}
