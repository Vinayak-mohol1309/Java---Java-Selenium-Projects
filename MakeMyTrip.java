package java_selenium_project_pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Bang");
		Thread.sleep(2000);
		List<WebElement> allSuggetions = driver.findElements(By.xpath("//p[contains(text(),'Bang')]"));
		System.out.println(allSuggetions.size());
		System.out.println("--------------All the suggetions-------------");
		for(WebElement ele:allSuggetions) {
			System.out.println(ele.getText());
		}
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
//		ele.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(1000);
//		ele.sendKeys(Keys.ARROW_DOWN);
//		Thread.sleep(1000);
//		ele.sendKeys(Keys.ENTER);
		ele.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(3000);
		
		driver.close();
	}

}
