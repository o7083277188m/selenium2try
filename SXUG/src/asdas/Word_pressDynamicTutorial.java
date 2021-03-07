package asdas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Word_pressDynamicTutorial {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\Desktop\\selenium files\\ChromeDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 		
		driver.navigate().to("http://demosite.center/wordpress/wp-login.php");
		
		
	WebElement	username = driver.findElement(By.xpath("//input[@name='log']"));
	
	username.sendKeys("admin");
		
	
    WebElement	Password = driver.findElement(By.xpath("//input[@type='password']"));
	
    Password.sendKeys("demo123");
	
		

    WebElement	Login_button = driver.findElement(By.xpath("//input[@name='wp-submit']"));
		
    Login_button.click();  
	
	
	driver.manage().window().maximize();
	
	
	
	
	WebElement Posts = driver.findElement(By.xpath("//div[@id='dashboard_right_now']//following::div//li//a[contains(@href,'edit.php')][1]"));
	
	Posts.click();
	
	
	
	
	}

}
