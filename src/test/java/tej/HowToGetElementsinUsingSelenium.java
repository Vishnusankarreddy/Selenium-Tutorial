package tej;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToGetElementsinUsingSelenium {

	public static void main(String[] args)throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		
		//tageName
		System.out.println(driver.findElement(By.name("login")).getTagName());
		
		//Attribute Name
		System.out.println(driver.findElement(By.name("login")).getAttribute("type"));
		
		WebElement usernameTxt = driver.findElement(By.id("login_field"));
		usernameTxt.sendKeys("text@gmail.com");
		
		System.out.println(usernameTxt.getAttribute("value"));
		

	}

}

