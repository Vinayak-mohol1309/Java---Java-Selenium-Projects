package java_selenium_project_pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Login{
	 
	private WebElement username;
	private WebElement password;
	private WebElement loginBtn;
	
	Login(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//wait concept
		username = driver.findElement(By.name("username"));
		password = driver.findElement(By.name("password"));
		loginBtn = driver.findElement(By.xpath("//button[text()=' Login ']"));
	}
	
	void setUsername(String user) {
		username.sendKeys("user");
	}
	void setPassword(String pass) {
		password.sendKeys("pass");
	}
	void clickLoginBtn() {
		loginBtn.click();
	}
	
	void login(String user,String pass) {
		setUsername(user);
		setPassword(pass);
		clickLoginBtn();
	}
}

public class EncapsulationRun {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		Login log = new Login(driver);
		Thread.sleep(3000);
		log.login("abc", "admin123");//invalid username
		Thread.sleep(3000);
		log.login("Admin", "admin");//invalid password
		
		//because of this operations we got StaleElementReferenceException and we can handle it by using 
		// page object model(POM)....
		//see the LoginRun class in pom.pack1 package...
		driver.close();

	}

}
