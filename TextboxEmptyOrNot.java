package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxEmptyOrNot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.cssSelector("input[name='username']"));
		String str = ele.getAttribute("value");
		
		if(str.isEmpty()) {
			System.out.println("username textbox is blank...");
		}else {
			System.out.println("username textbox is filled..."+ str);
		}
		driver.close();
	}

}
