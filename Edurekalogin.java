package java_selenium_project_pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Test;

public class Edurekalogin {
	
	//static WebDriver driver;

	public void edurekaProfile() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.edureka.co/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class=\"login_click login-vd giTrackElementHeader \"]")).click();
		Thread.sleep(1000);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("si_popup_email")));
		Thread.sleep(2000);
		actions.click();
		actions.sendKeys("vinayakvitthalmohol@gmail.com");
		Thread.sleep(2000);
		actions.build().perform();
		actions.moveToElement(driver.findElement(By.id("si_popup_passwd")));
		Thread.sleep(2000);
		actions.click();
		actions.sendKeys("LovePrerana@123");
		Thread.sleep(2000);
		actions.build().perform();
		actions.moveToElement(driver.findElement(By.xpath("//button[@class=\"clik_btn_log btn-block\"]")));
		Thread.sleep(2000);
		actions.click();
		actions.build().perform();
		

		
		driver.findElement(By.xpath("//a[@class=\"dropdown-toggle trackButton\"]//img[@class=\"img30\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("My Profile")).click();
		Thread.sleep(3000);
		
		//Explicit wait
		WebDriverWait waitElement = new WebDriverWait(driver,Duration.ofSeconds(30));
		waitElement.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("My Profile")));
		//driver.findElement(By.xpath("//ul[@class=\\\"dropdown-menu user-menu profile-xs hidden-sm hidden-xs\\\"]//a[text()=\\\"My Profile\\\"]")).click();
		String pageTitle= driver.getTitle();
		System.out.println(pageTitle);
		
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-profile-main[1]/div[1]/div[1]/div[2]/app-myprofilenew[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/i[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='fullName']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Vinayak vitthal mohol");
		driver.findElement(By.xpath("//button[text()=\"Save and Continue\"]")).click();
		Thread.sleep(2000);
		
		System.out.println("b");
		driver.navigate().to("https://learning.edureka.co/my-profile");
		Thread.sleep(2000);
		System.out.println("a");
		System.out.println("abc");
		driver.navigate().to("https://learning.edureka.co/onboarding/careerinterests");
		Thread.sleep(2000);
//		driver.navigate().to("https://learning.edureka.co/my-profile/career-service");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-profile-main[1]/div[1]/div[1]/div[2]/career-service-profile[1]/div[1]/div[1]/div[2]/div[1]/a[1]/i[1]")).click();
//		Thread.sleep(2000);
		
		
		//select is use to handle Listbox(drop-down)
		Select dropdownCurrentJob = new Select(driver.findElement(By.xpath("//select[@name=\"interestedJob\"]")));
		Thread.sleep(2000);
		dropdownCurrentJob.selectByVisibleText("Software Testing");
		Thread.sleep(2000);
		
		
		Select dropdownEmploymentType = new Select(driver.findElement(By.xpath("//select[@name=\"elementType\"]")));
		Thread.sleep(2000);
		dropdownEmploymentType.selectByVisibleText("Both");
		Thread.sleep(2000);
		
		
		Select dropdownCTC = new Select(driver.findElement(By.xpath("//select[@name=\"lastDrawnSalary\"]")));
		Thread.sleep(2000);
		dropdownCTC.selectByVisibleText("Not applicable");
		
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-onboarding-main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-onboarding-career-interests[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/form[1]/div[5]/div[1]/label[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-onboarding-main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-onboarding-career-interests[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body/app-root[1]/app-onboarding-main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-onboarding-career-interests[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/input[1]")).sendKeys("Mumbai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root[1]/app-onboarding-main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-onboarding-career-interests[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/input[1]")).clear();
		driver.findElement(By.xpath("//body/app-root[1]/app-onboarding-main[1]/div[1]/div[1]/div[1]/div[2]/div[2]/app-onboarding-career-interests[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/form[1]/div[6]/div[1]/input[1]")).sendKeys("pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.edureka.co/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header/nav[1]/div[4]/ul[1]/li[6]/a[1]/span[2]/img[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header/nav[1]/div[4]/ul[1]/li[6]/ul[1]/li[12]/a[1]")).click();
		Thread.sleep(2000);
		
		System.out.println("a");
		Thread.sleep(2000);
		driver.close();
		
	}

	public static void main(String[] args) throws InterruptedException {
		Edurekalogin obj = new Edurekalogin();
		obj.edurekaProfile();
	}

}
