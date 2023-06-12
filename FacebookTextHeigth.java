package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTextHeigth {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
//		WebElement un_textbox = driver.findElement(By.id("email"));
//		Dimension d_un = un_textbox.getSize();
//		int un_height=d_un.getHeight();
		int un_height = driver.findElement(By.id("email")).getSize().getHeight();
//		WebElement pass_textbox = driver.findElement(By.xpath("//div[@class=\"_55r1 _1kbt\"]"));
//		Dimension d_pass = pass_textbox.getSize();
//		int pass_height=d_pass.getHeight();
		int pass_height= driver.findElement(By.xpath("//div[@class=\"_55r1 _1kbt\"]")).getSize().getHeight();
		
		if(un_height == pass_height) {
			System.out.println("username and password textbox of facebook login page having same height");
		}else {
			System.out.println("username and password textbox of facebook login page having different height");
		}
		driver.close();
		

	}

}
