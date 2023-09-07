package tej;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowtogetURLtitelPagesource {

	public static void main(String[] args)throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org");
		
		//URL
		String CurrentUrl = driver. getCurrentUrl();
		System.out.println("Current Url - "+CurrentUrl);
		
		//Title
		String title = driver.getTitle();
		System.out.println("Titel - "+title);
		
		//HTML page source
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		
		
		driver.quit();
		

	}

	
		
	}


