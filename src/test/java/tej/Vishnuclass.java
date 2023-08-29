package tej;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vishnuclass {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

        driver.get("https://nxtgenaiacademy.com/demo-site/");
        Thread.sleep(2000);
        WebElement Firstname = driver.findElement(By.xpath("//input[@id='vfb-5']"));
        Firstname.sendKeys("vinoth");
        Thread.sleep(2000);
        WebElement Lastname = driver.findElement(By.xpath("//input[@id='vfb-7']"));
        Lastname.sendKeys("sankar");
        Thread.sleep(2000);
        WebElement Address = driver.findElement(By.xpath("//input[@name='vfb-13[address]']"));
        Address.sendKeys("100 Lake view aparment");
        Thread.sleep(2000);
        WebElement Gender = driver.findElement(By.xpath("//input[@id='vfb-31-1']"));
        Gender.click();
        Thread.sleep(2000);
        WebElement Streetaddress = driver.findElement(By.xpath("//input[@id='vfb-13-address-2']"));
        Streetaddress.sendKeys("Ganesh street");
        Thread.sleep(2000);
        WebElement City = driver.findElement(By.xpath("//input[@id='vfb-13-city']"));
        City.sendKeys("Chennai");
        Thread.sleep(2000);
        WebElement Zipcode = driver.findElement(By.xpath("//input[@id='vfb-13-zip']"));
        Zipcode.sendKeys("5858");
        Thread.sleep(2000);
        WebElement countrydropdown = driver.findElement(By.xpath("//select[@id='vfb-13-country']"));
        Select Country = new Select(countrydropdown);
        Country.selectByIndex(8);
        Thread.sleep(2000);
        WebElement State  = driver.findElement(By.xpath("//input[@id='vfb-13-state']"));
        State.sendKeys("Tamilnadu");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.xpath("//input[@id='vfb-14']"));
        email.sendKeys("vishnu@gmail.com");
        Thread.sleep(2000);
        WebElement Date = driver.findElement(By.xpath("//input[@id='vfb-18']"));
        Date.sendKeys("18/09/2021");
        Thread.sleep(2000);
        WebElement HHdropdown = driver.findElement(By.xpath("//select[@id='vfb-16-hour']"));
        Select HH = new Select(HHdropdown);
        HH.selectByValue("11");
        Thread.sleep(2000);
        WebElement MMdropdown = driver.findElement(By.xpath("//select[@id='vfb-16-min']"));
        Select MM = new Select(MMdropdown);
        MM.selectByValue("10");
        Thread.sleep(2000);
        WebElement Mobilenumber = driver.findElement(By.xpath("//input[@id='vfb-19']"));
        Mobilenumber.sendKeys("7032424668");
        Thread.sleep(2000);
        WebElement CourseInterested = driver.findElement(By.xpath("//input[@id='vfb-20-0']"));
        CourseInterested.click();
        Thread.sleep(2000);
        WebElement Entertext = driver.findElement(By.xpath("//textarea[@id='vfb-23']"));
        Entertext.sendKeys("abcdefghijklmnopqrstuvwxyz");
        Thread.sleep(2000);
        WebElement Entertwodigits = driver.findElement(By.xpath("//input[@id='vfb-3']"));
        Entertwodigits.sendKeys("59");
        Thread.sleep(2000);
        WebElement Submit = driver.findElement(By.xpath("//input[@id='vfb-4']"));
        Submit.click();
    }
}


