package tej;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagelordtimeout {

	public static void main(String[] args)throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Instant starttime = Instant.now();
		System.out.println(starttime.toString());
		driver.get("https://www.amazon.in/");
		Instant endtime = Instant.now();
		
		System.out.println(endtime.toString());
		Duration objectvishnu = Duration.between(starttime, endtime);
		System.out.println("pageloadtime:"+objectvishnu.toMillis());
	    System.out.println(driver.getTitle());
	    Thread.sleep(5000);
	    driver.quit();
		
		
	}

}
