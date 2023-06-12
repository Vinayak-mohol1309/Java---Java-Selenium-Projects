package java_selenium_project_pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPractice {
	
	public static void getDuplicate(List<WebElement> ele,String text) {
		//it returns the duplicate option
		int count = ele.size();
		int temp=0;
		for(int i=0;i<count;i++) {
			String textAll = ele.get(i).getText();
			if(text.equals(textAll)) {
				temp++;
				
			}
		}
		if(temp >= 2) {
			System.out.println(text);
		}
		
	}
	public static void getExceptDuplicate(List<WebElement> ele,String text) {
		//it returns all options except duplicates
		int count = ele.size();
		int temp=0;
		for(int i=0;i<count;i++) {
			String textAll = ele.get(i).getText();
			if(text.equals(textAll)) {
				temp++;
				
			}
		}
		if(temp <= 1) {
			System.out.println(text);
		}
		
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/VINAYAK/OneDrive/Desktop/selectDemo.html");
		Select multiList = new Select(driver.findElement(By.xpath("//select[@value='states']")));
		List<WebElement> allOptions = multiList.getOptions();
		int count = allOptions.size();
		String expTitle = "Maharashtra";
		for(WebElement ele:allOptions) {
			String actText = ele.getText();
			if(expTitle.equals(actText)) {
				ele.click();
				break;
			}
		}
		
		System.out.println("---------All Options---------");
		for(WebElement ele:allOptions) {
			System.out.println(ele.getText());
		}
		
		System.out.println("---------Only Duplicates Options---------");
		for(int i=0;i<count;i++) {
			String ele1 = allOptions.get(i).getText();
			getDuplicate(allOptions,ele1);
		}
		
		System.out.println("---------Except Duplicates Options---------");
		for(int i=0;i<count;i++) {
			String ele1 = allOptions.get(i).getText();
			getExceptDuplicate(allOptions,ele1);
		}
		driver.close();
		
		
	}

}
