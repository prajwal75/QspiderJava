package sample;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_FF {
	public static void main(String[] args) {
		String key="webdriver.gecko.driver";
		String value="./selenium/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver=new FirefoxDriver();
		
	}

}
