package java_selenium_project_pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TableContent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/VINAYAK/OneDrive/Desktop/MultipleElement.html");
		List<WebElement> lstTable = driver.findElements(By.xpath("//td"));
		//findElements() returns List of WebElements
		for(int i=0;i<lstTable.size();i++) {
			System.out.println(lstTable.get(i).getText());
			if(i==2 || i==5 || i==8) {
				System.out.println();
			}
		}
		driver.close();
		

	}

}
