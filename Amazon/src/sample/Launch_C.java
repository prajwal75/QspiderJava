package sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_C {
	public static void main(String[] args) {
	
		String key="webdriver.chrome.driver";
		String value="./selenium/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver=new ChromeDriver();
	}

}
