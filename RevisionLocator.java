package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RevisionLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
//		driver.findElement(By.linkText("Jobs")).click();
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("_2IX_2- VJZDxU")).sendKeys("vinayakvitthalmohol@gmail.com");
		driver.findElement(By.className("_2KpZ6l _2HKlqd _3AWRsL")).click();
		driver.close();
	}

}
