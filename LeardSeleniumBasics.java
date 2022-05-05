package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeardSeleniumBasics {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		// to open chrome browser
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver1 = new FirefoxDriver();
		
		driver.get("http://www.amazon.com");
		
		driver.manage().window().maximize();
		
		driver.manage().window().minimize();
		
		driver.close();
	
	
	}

}
