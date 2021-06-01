package sample;


import org.openqa.selenium.edge.EdgeDriver;


public class Close_E {
	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.edge.driver";
		String value="./selenium/msedgedriver.exe";
		System.setProperty(key, value);
		EdgeDriver driver =new EdgeDriver();
		Thread.sleep(5000);
		driver.quit();

		
	}

}
