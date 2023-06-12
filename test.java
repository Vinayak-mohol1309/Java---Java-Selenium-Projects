package java_selenium_project_pack1;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Browser choice\n1 Chrome\n2 Internet Explorer\n3 Edge");
		int choice = input.nextInt();
		String expTitle = "OrangeHRM";
		String actTitle;
		
		WebDriver driver = null;  //RemoteWebDriver driver = null
		switch(choice){
			case 1 : 
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver(); //UpCasting
			break;
			case 2 :
				System.setProperty("webdriver.internetEplorer.driver", "C:\\Users\\VINAYAK\\Downloads\\IEDriverServer_x64_4.7.0\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			break;
			case 3 : 
				//System.setProperty("webdriver.edge.driver", "‪D:\\edgedriver_win64\\msedgedriver.exe");
				driver = new EdgeDriver();
			break;
			default:System.out.println("choice is wrong!!!!");
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		actTitle = driver.getTitle();
		System.out.println("Actual title: "+actTitle);
		if(expTitle.equals(actTitle)) {
			System.out.println("passed!!!");
		}else {
			System.out.println("failed!!!");
		}
		driver.close();

	}

	

	

}
