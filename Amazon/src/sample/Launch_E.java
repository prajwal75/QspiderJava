package sample;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_E {
	public static void main(String[] args) {
	String key="webdriver.edge.driver";
	String value="./selenium/msedgedriver.exe";
		System.setProperty(key, value);
		EdgeDriver driver =new EdgeDriver();
	}

}
