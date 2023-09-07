package tej;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wynkmusic {

	private static Object text;
	

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://wynk.in/music");
		Thread.sleep(2000);
		WebElement searchAnchor = driver.findElement(By.xpath("//a[@href='/music/search']"));
		searchAnchor.click();
		WebElement Search = driver.findElement(By.cssSelector("input[title='Search']"));
		Search.sendKeys("kgf");
		WebElement song = driver.findElement(By.xpath("//h5[text()='KGF Chapter 2 (Telugu)']"));
		song.click();
		Thread.sleep(10000);
		WebElement smsPopup = driver.findElement(By.xpath("//div[@data-testid='smsPopupContainer']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(smsPopup));
		if (smsPopup.isDisplayed()) {
			driver.findElement(
					By.xpath("//div[@data-testid='smsPopupCrossBtn']//*[name()='svg' and @fill='currentColor']"))
					.click();
		}
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(searchAnchor));
		searchAnchor.click();
		WebElement searchNew = driver.findElement(By.xpath("//a[@href='/music/search']/..//input[@title='Search']"));
		wait.until(ExpectedConditions.elementToBeClickable(searchNew));
		searchNew.clear();
		searchNew.sendKeys("leo"+Keys.ENTER);
		Thread.sleep(3000);
		WebElement song1 = driver.findElement(By.xpath("//h5[text()='Naa Ready (From \"Leo\")']"));
		song1.click();
		
		

	}

}
