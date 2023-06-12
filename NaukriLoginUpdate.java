package java_selenium_project_pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NaukriLoginUpdate {
	
	static WebDriver driver;
	
	public static void naukriLoginUpdate() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		//implicitlyWait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		//   email/username textbox
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("vinayakvitthalmohol@gmail.com");
		//   password textbox
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("LovePrerana@123");
		
		driver.findElement(By.xpath("//button[text()='Login']")).click();//login button
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='chatbot_DrawerContentWrapper']"));
		if(ele.isDisplayed()) {
			driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
		}
		
		driver.findElement(By.xpath("//img[@class='nI-gNb-icon-img']")).click();//profile img
		
		driver.findElement(By.xpath("//a[text()='View & Update Profile']")).click();//view and update
		//ExplicitWait
		WebDriverWait wait = new WebDriverWait(NaukriLoginUpdate.driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//em[@class='icon edit']")));
		
		driver.findElement(By.xpath("//em[@class='icon edit']")).click();
		
		WebElement fullName = driver.findElement(By.xpath("//input[@id='name']"));
		fullName.click();
		fullName.clear();
		fullName.sendKeys("vinayak vitthal mohol");
		
		
		driver.findElement(By.xpath("//button[text()='SAVE']")).click();//save button
		
		driver.navigate().to("https://www.naukri.com/mnjuser/homepage");//home page
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='nI-gNb-icon-img']")).click();//profile img
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Logout']")).click();//log out
		Thread.sleep(2000);
		driver.close();
		System.out.println("You successfully login - update - logout naukri.com profile....");
		
	

	}

	public static void main(String[] args) throws InterruptedException {
		NaukriLoginUpdate.naukriLoginUpdate();

	}

}
