package java_selenium_project_pack1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//open Browser
		ChromeDriver driver = new ChromeDriver();
		//Open URL
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//to maximize
		driver.manage().window().maximize();
		//(new Options())( new Window())
		Thread.sleep(5000);
		//to minimize
		driver.manage().window().minimize();
		Thread.sleep(5000);
		//change size
		Dimension d = new Dimension(100,150);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		//change position 
		Point p = new Point(100,150);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		//close browser
		driver.close(); 
		//driver.quit();
		Thread.sleep(5000);
	}

}
