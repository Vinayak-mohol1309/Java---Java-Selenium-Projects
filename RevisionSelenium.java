package java_selenium_project_pack1;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RevisionSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("key", "browser path");
		//FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver(); //open browser
		driver.get("website url");//open url page
		driver.navigate().to("website url");//open url page
		driver.manage().window().minimize();// minimizes the browser
		driver.manage().window().maximize();// maximizes the browser
		Thread.sleep(2000); // it stop execution for 2 sec.
		driver.navigate().back();// open backward page
		driver.navigate().forward();// open forward page
		driver.navigate().refresh();// refresh the page
		String url = driver.getCurrentUrl();//return the url
		System.out.println(url);
		String title = driver.getTitle();//return the title present on left-top side
		System.out.println(title);
		
		Dimension d = new Dimension(150,100);
		driver.manage().window().setSize(d);
		
		Point p = new Point(150,100);
		driver.manage().window().setPosition(p);
		
		// WebDriver d = new WebDriver();  //we can not instantiate WebDriver interface.
		
		driver.close();// close the browser
		
	}

}
