package tej;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleofHandleText {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
        Thread.sleep(3000);  
       WebElement Textfeild = driver.findElement(By.id("emailh"));
        	Textfeild.sendKeys("HYR");
        	Thread.sleep(2000);
        	Textfeild.clear();
        //String enteredText = usernameTxt.getAttribute("value");


	}

}
