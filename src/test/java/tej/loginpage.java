package tej;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class loginpage {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
	   //mouse moving action
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(2000);
	    Actions action = new Actions(driver);
	    WebElement profile = driver.findElement(By.xpath("//div[contains(@class,'Header__StyledProfileMenu')]"));
	    action.moveToElement(profile).perform();
	
	}

}
