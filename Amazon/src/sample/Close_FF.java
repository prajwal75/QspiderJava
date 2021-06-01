package sample;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Close_FF {
	public static void main(String[] args) throws InterruptedException {
	String key="webdriver.gecko.driver";
	String value="./selenium/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(3000);
		driver.quit();
		}
}
