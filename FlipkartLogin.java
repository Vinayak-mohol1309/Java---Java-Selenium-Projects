package java_selenium_project_pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLogin {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
//		driver.findElement(By.xpath("//a[text()=\"New to Flipkart? Create an account\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("9579684608");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='HSKgdN']")).sendKeys("919932");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _14EHzR _3dESVI']")).click();
		Thread.sleep(2000);
		driver.close();
		System.out.println("Successfully Login!!!");
	}

}
