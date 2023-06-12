package java_selenium_project_pack1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadCatchpa {

	public static void main(String[] args) throws Exception, IOException, TesseractException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINAYAK\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt = new  ChromeOptions();
		opt.addArguments("--disable-notifications");// it disables all the alert notifications
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("LOGIN")).click();
		Thread.sleep(3000);
		File scr=driver.findElement(By.xpath("//img[@class='captcha-img']")).getScreenshotAs(OutputType.FILE);
		//String path="D:\\Eclipse_java\\java_selenium_project\\screenshots\\captcha.png";
		String path="D:\\Eclipse_java\\java_selenium_project\\screenshots\\captcha.png";
		FileHandler.copy(scr,new File(path));
		Thread.sleep(3000);
		
		ITesseract image = new Tesseract();
		Thread.sleep(3000);
		String imageText=image.doOCR(new File(path)); //error is here
		System.out.println(imageText);
		
	}

}
