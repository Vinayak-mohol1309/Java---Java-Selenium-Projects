package java_selenium_project_pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggetions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium ");
		Thread.sleep(2000);
		List<WebElement> allOptions=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		int count = allOptions.size();
		System.out.println("Total suggetions "+ count);
		System.out.println("--------List of suggetions------------");
		for(WebElement ele:allOptions) {
			System.out.println(ele.getText());
		}
		
		String expText = "selenium testing";
		for(WebElement ele:allOptions) {
			String actText = ele.getText();
			if(expText.equals(actText)) {
				ele.click();
			}
		}
		Thread.sleep(3000);
		driver.close();

	}

}
