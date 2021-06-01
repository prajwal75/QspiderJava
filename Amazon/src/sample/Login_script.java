package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login_script {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./selenium/geckodriver.exe");
		//1 open browser
		WebDriver driver=new FirefoxDriver();
		//2 enter the url
		driver.get(" https://www.facebook.com");
		// 3 enter valid username
		driver.findElement(By.id("email")).sendKeys("prajwal.lokeshnl@gmail.com");
		//4 enter valid password
		driver.findElement(By.id("pass")).sendKeys("Prajju2113+");
		//5 click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// 6 verify home page is displayed or not
		String title= driver.getTitle();
		if(title.equals("Facebook"))
		{
			System.out.println("Home page is displayed : Pass");
		}
		else
		{
			System.out.println("Homepage is not displayed : Fail");
		}
	}

}
