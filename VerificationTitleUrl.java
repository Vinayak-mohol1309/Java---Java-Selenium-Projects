package java_selenium_project_pack1;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationTitleUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String expTitle = "OrangeHRM";
		String actTitle = driver.getTitle();
		System.out.println("Actual title: "+actTitle);
		if(expTitle.equals(actTitle)) {
			System.out.println("passed!!!");
		}else {
			System.out.println("failed!!!");
		}
		String expUrl = "orangehrmlive.com";
		String actUrl = driver.getCurrentUrl();
		System.out.println("Actual URL: "+actUrl);
		if(actUrl.contains(expUrl)) {
			System.out.println("passed!!!");
		}else {
			System.out.println("failed!!!");
		}
		driver.close();
		Thread.sleep(2000);
		
	}

}
