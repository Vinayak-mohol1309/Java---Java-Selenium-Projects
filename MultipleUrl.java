package java_selenium_project_pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/VINAYAK/OneDrive/Desktop/MultipleElement.html");
		List<WebElement> lstUrl = driver.findElements(By.xpath("//a"));
		for(int i=0;i<lstUrl.size();i++) {
			String url=lstUrl.get(i).getAttribute("href");
			System.out.println(url);
		}
		driver.close();

	}

}
