package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/VINAYAK/OneDrive/Desktop/html2.html");
//		String title = driver.getTitle();
//		System.out.println(title);
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		Thread.sleep(10000);
		
		
//		WebElement ele=driver.findElement(By.tagName("a"));
//		ele.click();
//		Thread.sleep(10000);
//		driver.navigate().back();
		
		
//		WebElement ele=driver.findElement(By.id("i2"));
//		ele.click();
		
//		driver.findElement(By.name("n1")).click();
		
//		driver.findElement(By.className("c2")).click();
		
//		driver.findElement(By.linkText("Gmail")).click();
		
		driver.findElement(By.partialLinkText("inbox")).click();
		Thread.sleep(10000);
		driver.close();
		Thread.sleep(10000);
		
	}

}
