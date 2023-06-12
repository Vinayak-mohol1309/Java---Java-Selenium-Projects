package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxIsMultiple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/VINAYAK/OneDrive/Desktop/selectDemo.html");
		
		Select singleList = new Select(driver.findElement(By.xpath("//select[@value='country']")));
		boolean status1 = singleList.isMultiple();/* isMultiple() is used to know whether the listbox is 
		 single selector multi select */
		System.out.println(status1);
		
		Select multiList = new Select(driver.findElement(By.xpath("//select[@value='states']")));
		boolean status2 = multiList.isMultiple();
		System.out.println(status2);
	}

}
