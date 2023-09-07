package tej;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverFinder;
import org.openqa.selenium.support.ui.Select;

public class loginpage1 {

	public static void main(String[] args) throws Exception {		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		   driver.get("https://nxtgenaiacademy.com/demo-site/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    Actions creat =new Actions (driver);
	    creat.moveToElement(driver.findElement(By.xpath("//a[text()='Create new account']"))).click().perform();
	    driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"))
        .sendKeys("vishnu");
        driver.findElement(By.xpath("//input[@aria-label='Surname']"))
        .sendKeys("softsuave");
        WebElement mobile = driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
        mobile.sendKeys("7032424667");
        WebElement password = driver.findElement(By.xpath("//input[@aria-label='New password']"));
        password.sendKeys("Vishnu@123");
        Thread.sleep(10000);
        WebElement datedropdown = driver.findElement(By.xpath("//select[@id='day']"));
        Select date = new Select(datedropdown);
        date.selectByValue("5");
        WebElement monthdropdown = driver.findElement(By.xpath("//select[@id='month']"));
        Select month = new Select(monthdropdown);
        month.selectByValue("9");
        WebElement yeardropdown = driver.findElement(By.xpath("//select[@id='year']"));
        Select year = new Select(yeardropdown);
        year.selectByValue("1999");
        driver.findElement(By.xpath("//input[@value='2']"))
        .click();
        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        signUpButton.click();

	    
	}

	private static WebElement highlight(WebElement findElement) {
		// TODO Auto-generated method stub
		return null;
	}

	
 
}
