package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class NaukriRegistration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(5000);
		//username
		driver.findElement(By.id("name")).sendKeys("vinayak vitthal mohol");
		Thread.sleep(2000);
		//email-id  
		driver.findElement(By.id("email")).sendKeys("vinayakvitthalmohol@gmail.com");
		Thread.sleep(2000);
		//password
		driver.findElement(By.id("password")).sendKeys("Vinayak@123");
		Thread.sleep(2000);
		//mobile no.
		driver.findElement(By.id("mobile")).sendKeys("9579684608");
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		

	}

}
