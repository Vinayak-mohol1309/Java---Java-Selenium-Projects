package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTextbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/VINAYAK/OneDrive/Desktop/htmlDemo.html");
		Thread.sleep(2000);
		//username textbox
		WebElement un_ele = driver.findElement(By.xpath("//input[@value=\"username\"]"));
		un_ele.click();
		String str=un_ele.getAttribute("value");
		for(int i=0;i<=str.length();i++) {
			if(i!=0) 
		un_ele.sendKeys(Keys.BACK_SPACE);
			
		}
		
		un_ele.sendKeys("vinayak mohol");
		Thread.sleep(2000);
		driver.close();
		
	}

}
