package java_selenium_project_pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//bottom to top checkbox select
public class MultipleCheckbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/VINAYAK/OneDrive/Desktop/MultipleElement.html");
		List<WebElement> lstChk = driver.findElements(By.cssSelector("input[type='checkbox']"));
		for(int i=lstChk.size()-1;i>=0;i--) {
			Thread.sleep(2000);
			lstChk.get(i).click();
		}
		driver.close();

	}

}
