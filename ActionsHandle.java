package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.linkText("Services"));
		//drop-down :- we handle it by using Actions class.
		//1st we have to create an object of Actions class and pass driver to its constructor
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(ele).perform();//this method move mouse pointer to that element
		Thread.sleep(3000);
		WebElement ele2= driver.findElement(By.xpath("//div[contains(text(),'Text resume')]"));//option in dropdown
		act.click(ele2).perform();
		//after every method must call perform() method.
		Thread.sleep(2000);
	
		driver.close();
	}

}
