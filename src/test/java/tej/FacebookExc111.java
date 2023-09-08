package tej;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookExc111 {

	public static void main(String[] args)throws Exception{
		//Create a instance of ChromeOptions class
		ChromeOptions options = new ChromeOptions();

		//Add chrome switch to disable notification - "**--disable-notifications**"
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
  
	    driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"))
	    .sendKeys("8106620472");
	    driver.findElement(By.xpath("//input[@placeholder='Password']"))
	    .sendKeys("nivya reddy");
	    driver.findElement(By.xpath("//button[@name='login']"))
	    .click();
	    driver.findElement(By.xpath("//div[@aria-label='Menu']"))
	    .click();
	    driver.findElement(By.xpath("//span[text()='Post']"))
	    .click();
	    driver.findElement(By.xpath("//div[contains(@aria-label,'your mind')]"))
	    .sendKeys("Good morning India");
	    driver.findElement(By.xpath("//div[contains(@aria-label,'Post')]"))
	    .click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[contains(@aria-label,'Actions for')]"))
	    .click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[.='Move to Recycle bin']"))
	    .click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@aria-label='Move']"))
	    .click();
	    Thread.sleep(2000);
	    
	    
	}

}
