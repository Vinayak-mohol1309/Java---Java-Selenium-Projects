package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriCheckbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//a//i[1]"));
		boolean checkbox = ele.isSelected();
		System.out.println(checkbox);
		ele.click();
		checkbox = ele.isSelected();
		System.out.println(checkbox);	
//		if(checkbox) {
//			System.out.println("text case passed...it is checked");
//		}else {
//			System.out.println("text case failed...it is un-checked");
//		}
		driver.close();
		

	}

}
