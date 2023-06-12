package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/VINAYAK/OneDrive/Desktop/Select.html");
		//to create a drop-down we use <select> html tag
		//to handle listbox we have in-built class called "Select class".this class constructor accept one
		//argument of type WebElement.this class has non-static methods to perform different tasks
		Select countryDropDown = new Select(driver.findElement(By.tagName("select")));
		Thread.sleep(2000);
		countryDropDown.selectByVisibleText("India");
		Thread.sleep(2000);
		driver.close();
	}

}
