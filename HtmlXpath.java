package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/VINAYAK/OneDrive/Desktop/htmlSample2.html");
		Thread.sleep(5000);
		
		//xpath locator:-
		
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Admin");//first name text box
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("admin123");//last name text box
		
		driver.close();
	}

}
