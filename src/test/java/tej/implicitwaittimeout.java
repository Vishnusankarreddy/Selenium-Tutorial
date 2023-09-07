package tej;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class implicitwaittimeout {

		public static void main(String[] args) throws Exception {
			WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.get("https://nxtgenaiacademy.com/demo-site/");
	       
	        WebElement Firstname = driver.findElement(By.xpath("//input[@id='vfb-5']"));
	        Firstname.sendKeys("ganesh");
	       
	        WebElement Lastname = driver.findElement(By.xpath("//input[@id='vfb-7']"));
	        Lastname.sendKeys("sankar");
	       
	        WebElement Address = driver.findElement(By.xpath("//input[@name='vfb-13[address]']"));
	        Address.sendKeys("100 Lake view aparment");
	       
	        WebElement Gender = driver.findElement(By.xpath("//input[@id='vfb-31-1']"));
	        Gender.click();
	        
	        WebElement Streetaddress = driver.findElement(By.xpath("//input[@id='vfb-13-address-2']"));
	        Streetaddress.sendKeys("Ganesh street");
	        
	        WebElement City = driver.findElement(By.xpath("//input[@id='vfb-13-city']"));
	        City.sendKeys("Chennai");
	       
	        WebElement Zipcode = driver.findElement(By.xpath("//input[@id='vfb-13-zip']"));
	        Zipcode.sendKeys("5858");
	       
	        WebElement countrydropdown = driver.findElement(By.xpath("//select[@id='vfb-13-country']"));
	        Select Country = new Select(countrydropdown);
	        Country.selectByIndex(8);
	        
	        WebElement State  = driver.findElement(By.xpath("//input[@id='vfb-13-state']"));
	        State.sendKeys("Tamilnadu");
	       
	        WebElement email = driver.findElement(By.xpath("//input[@id='vfb-14']"));
	        email.sendKeys("vishnu@gmail.com");
	      
	        WebElement Date = driver.findElement(By.xpath("//input[@id='vfb-18']"));
	        Date.sendKeys("18/09/2021");
	       
	        WebElement HHdropdown = driver.findElement(By.xpath("//select[@id='vfb-16-hour']"));
	        Select HH = new Select(HHdropdown);
	        HH.selectByValue("11");
	      
	        WebElement MMdropdown = driver.findElement(By.xpath("//select[@id='vfb-16-min']"));
	        Select MM = new Select(MMdropdown);
	        MM.selectByValue("10");
	       
	        WebElement Mobilenumber = driver.findElement(By.xpath("//input[@id='vfb-19']"));
	        Mobilenumber.sendKeys("7032424668");
	        
	        WebElement CourseInterested = driver.findElement(By.xpath("//input[@id='vfb-20-0']"));
	        CourseInterested.click();
	       
	        WebElement Entertext = driver.findElement(By.xpath("//textarea[@id='vfb-23']"));
	        Entertext.sendKeys("abcdefghijklmnopqrstuvwxyz");
	       
	        WebElement Entertwodigits = driver.findElement(By.xpath("//input[@id='vfb-3']"));
	        Entertwodigits.sendKeys("59");
	        WebElement Submit = driver.findElement(By.xpath("//input[@id='vfb-4']"));
	        Submit.click();

	}

}
