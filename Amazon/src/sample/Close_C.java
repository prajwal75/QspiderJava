package sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class Close_C {
	public static void main(String[] args) throws InterruptedException {
	String key="webdriver.chrome.driver";
	String value="./selenium/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver =new ChromeDriver();
		Thread.sleep(3000);
		driver.quit();
		}

}
