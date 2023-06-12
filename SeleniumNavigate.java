package java_selenium_project_pack1;


import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumNavigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(2000);
		
//back(),forward(),refresh() are the methods of Navigation class so , to access that methods we have to 
// create an Object of Navigation class but we have method called navigate() present in driver .
		//directly we cannot create an object of Navigation class because it is present in WebDriver interface.
		//navigate() method returns an object of Navigation class
	}

}
