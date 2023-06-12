package java_selenium_project_pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxGetOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/VINAYAK/OneDrive/Desktop/selectDemo.html");
		
		Select singleList = new Select(driver.findElement(By.xpath("//select[@value='country']")));
		List<WebElement> allOptions1 = singleList.getOptions();
		//getOptions() method used to get option of Listbox . it returns List Of WebElement
		for(WebElement ele:allOptions1) {
			System.out.println(ele.getText());
		}
		
		Select multiList = new Select(driver.findElement(By.xpath("//select[@value='states']")));
		List<WebElement> allOptions2 = multiList.getOptions();
//		for(WebElement ele2:allOptions2) {
//			ele2.click();
//		}
		int count = allOptions2.size();
		for(int i=0;i<count;i++) {
			multiList.selectByIndex(i);// select all options one by one
		}
		Thread.sleep(2000);
		multiList.deselectAll();// deselect all options
		
		driver.close();

	}

}
