package tej;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTextBoxesExa {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement usernameTxt = driver.findElement(By.id("email"));
		if (usernameTxt.isDisplayed()==true) {
			if (usernameTxt.isEnabled()==false) {
				usernameTxt.sendKeys("!@#$Z%");
				Thread.sleep(2000);
//				usernameTxt.clear();
				String enteredText = usernameTxt.getAttribute("value");
				System.out.println(enteredText);
			} else {
				System.out.println("*********Username textbox is not enabled");
			}

		} else {
			System.out.println("*********Username textbox is not displayed");
		}

	}

}
