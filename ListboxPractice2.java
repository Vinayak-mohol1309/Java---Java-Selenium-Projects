package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxPractice2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/VINAYAK/OneDrive/Desktop/selectDemo.html");
		//we Select class only when listbox is created using <select> tag
		Select singleList = new Select(driver.findElement(By.xpath("//select[@value='country']")));
		singleList.selectByIndex(2);//index
//		singleList.selectByValue("AUS");//value attribute 
//		singleList.selectByVisibleText("India");//inner text
		
		//Select class object can handle only one Listbox at a time.
		
		Select multiList = new Select(driver.findElement(By.xpath("//select[@value='states']")));
		multiList.selectByIndex(2);
		multiList.selectByValue("MH");
		multiList.selectByVisibleText("Punjab");
		//deselect is allowed for only multiple Listbox
		multiList.deselectByIndex(2);
		multiList.deselectByValue("MH");
		multiList.deselectByVisibleText("Punjab");
		
		
	}

}
