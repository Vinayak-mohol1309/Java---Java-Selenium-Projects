package java_selenium_project_pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndeedLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/account/remove?hl=en");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("create a new account")).click();
		//driver.findElement(By.xpath("//input[@class='css-5yee0j e1jgz0i3']")).sendKeys("vinayakvitthalmohol@gmail.com");
		driver.findElement(By.name("__email")).sendKeys("vinayakvitthalmohol@gmail.com");
		driver.findElement(By.xpath("//button[@class=\"i-unmask css-jorj5j e8ju0x51\"]")).click();
		driver.findElement(By.id("gsuite-login-google-button")).click();
		driver.close();
	}

}
