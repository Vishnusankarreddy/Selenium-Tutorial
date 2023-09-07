package tej;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args)throws Exception {
		WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://nxtgenaiacademy.com/demo-site/");
        Thread.sleep(2000);
        WebElement HHdropdown = driver.findElement(By.xpath("//select[@id='vfb-16-hour']"));
        Select HH = new Select(HHdropdown);
        HH.selectByValue("11");
        Thread.sleep(2000);
        WebElement MMdropdown = driver.findElement(By.xpath("//select[@id='vfb-16-min']"));
        Select MM = new Select(MMdropdown);
        MM.selectByValue("10");
        Thread.sleep(2000);

	}

}
