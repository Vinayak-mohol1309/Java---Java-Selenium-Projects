package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAllignedEP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		WebElement email_coordinate = driver.findElement(By.id("email"));
		Point p_email = email_coordinate.getLocation();
		int emailX = p_email.getX();
		int emailY = p_email.getY();
//		System.out.println(emailX);
//		System.out.println(emailY);
		WebElement pass_coordinate = driver.findElement(By.xpath("//div[@class=\"_55r1 _1kbt\"]"));
		Point p_pass = pass_coordinate.getLocation();
		int passX = p_pass.getX();
		int passY = p_pass.getY();
//		System.out.println(passX);
//		System.out.println(passY);
		if(emailX == passX) {
			System.out.println("Email and password text box is alligned");
		}else {
			System.out.println("Email and password text box is not alligned");
		}
		driver.close();

	}

}
