package java_selenium_project_pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JS_Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(
				"https://www.google.com/search?q=what+are+disadvantages+of+implicitly+wait+in+selenium&rlz=1C1UEAD_enIN981IN981&sxsrf=AJOqlzXfTHWek7sR5x-zxmL2omKAZ0NEOQ%3A1674397219135&ei=I0bNY6HaB8iZseMPytOB8Aw&oq=what+are+dis+advantages+of+implicitly+wa&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAxgAMgcIIRCgARAKMgcIIRCgARAKMgoIIRAWEB4QHRAKMgoIIRAWEB4QHRAKMgoIIRAWEB4QHRAKMgoIIRAWEB4QHRAKMgoIIRAWEB4QHRAKMgwIIRAWEB4QDxAdEAoyCgghEBYQHhAdEAoyCgghEBYQHhAdEAo6BwgjEOoCECc6DQgAEI8BEOoCELQCGAE6DQguEI8BEOoCELQCGAE6BAgjECc6CwgAEIAEELEDEIMBOg4ILhCABBCxAxCDARDUAjoFCC4QgAQ6BAgAEEM6BQgAEIAEOgUIABCRAjoICAAQgAQQsQM6CggAEIAEEBQQhwI6DAgAEIAEEAoQRhD_AToHCAAQgAQQCjoHCAAQDRCABDoGCAAQFhAeOgkIABAWEB4Q8QQ6CAgAEAgQHhANOgUIABCGAzoGCCEQFRAKOgQIIRAKSgQIQRgASgQIRhgBUNILWKT5BmDOngdoAXABeAGAAYQEiAHqZ5IBCzItMTguMTYuNC4ymAEAoAEBsAEUwAEB2gEGCAEQARgK&sclient=gws-wiz-serp");
		Thread.sleep(3000);
		//down cast the upcasted object
		RemoteWebDriver d1 = (RemoteWebDriver) driver;
		Thread.sleep(3000);
		int y = d1.findElement(By.xpath("//h3[contains(text(),'Disadvantages of an Implicit Wait I - Ultimate QA')]")).getLocation().getY();

		d1.executeScript("window.scrollTo(0,"+y+")");
		// y  is a variable that is why we wrote in this form (y= Y co-ordinates)
		Thread.sleep(5000);
		d1.close();
	}

}
