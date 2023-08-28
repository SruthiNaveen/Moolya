package Maveenpackage;

import java.awt.AWTException;
import java.awt.Robot;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip {
	WebDriver wd;
	Robot rt;
	@BeforeTest
	
	public void bt1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		wd.get("https://www.makemytrip.com/flights/");	
		Thread.sleep(3000);
		wd.manage().window().maximize();	
}
	@Test (priority = 0)
	public void radium() throws AWTException, InterruptedException {
	wd.get("https://www.makemytrip.com/flights/");
		wd.findElement(By.xpath("//*[@class='chNavIcon appendBottom2 chSprite chFlights active']")).click();
		Thread.sleep(3500);
		wd.findElement(By.xpath("(//*[@class='tabsCircle appendRight5'])[2]")).click();
		System.out.println("roundtrip clicked");
		wd.findElement(By.xpath("//*[@class='lbl_input appendBottom10']")).click();
		System.out.println("from clicked");
		wd.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-3']")).click();
		System.out.println("cityfrom clicked");
		wd.findElement(By.xpath("(//*[@class='lbl_input appendBottom10'])[2]")).click();
		System.out.println("to clicked");
		wd.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-5']")).click();
        System.out.println("cityto clicked");
		wd.findElement(By.xpath("(//*[@class='lbl_input appendBottom10'])[3]")).click();
		System.out.println("departure clicked");
		wd.findElement(By.xpath("//*[@aria-label='Wed Aug 23 2023']")).click();;
		System.out.println("departuredate clicked");
		wd.findElement(By.xpath("(//*[@class='lbl_input appendBottom10'])[4]")).click();
		//Thread.sleep(3000);
		System.out.println("return clicked");
		wd.findElement(By.xpath("//*[@aria-label='Thu Aug 31 2023']")).click();
		System.out.println("returndate clicked");
	}
	@Test(priority = 1)
	public void searchbox() throws InterruptedException, AWTException {
		wd.findElement(By.xpath("//*[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		Thread.sleep(10000);
		System.out.println("search clicked");	
		Thread.sleep(5000);
		wd.findElement(By.xpath("//*[@class='button buttonSecondry buttonBig fontSize12 relative']")).click();
		System.out.println("prompt clicked");	
		JavascriptExecutor JS= (JavascriptExecutor)wd;
		JS.executeScript("window.scrollBy(0,400)");
		wd.findElement(By.xpath("(//*[@class='listingCard '])[5]")).click();
		System.out.println("airasia 13:20 B TO H flight clicked");
		JS.executeScript("window.scrollBy(0,-300)");
		wd.findElement(By.xpath("(//*[@class='listingCard '])[33]")).click();
		System.out.println("airasia 21:05 HtoB flight clicked");
		
	}
	
	
}
