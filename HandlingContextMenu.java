package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingContextMenu {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/homepage");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.linkText("Services"));
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		//context menu handling using Actions class. context click means right click 
		act.sendKeys("t").perform();
		//act.sendKeys("w").perform();
	}

}
