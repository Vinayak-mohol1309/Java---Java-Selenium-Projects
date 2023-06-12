package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementDemo {
//how StaleElementReferenceException is got
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		//stores username address in @a1
		WebElement username = driver.findElement(By.name("username"));
		//refresh and username get new address @x1 
		driver.navigate().refresh();
		Thread.sleep(5000);
		//try to enter admin using old address @a1 
		username.sendKeys("Admin");		
	}
	
}
