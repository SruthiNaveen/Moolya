package Maveenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames<WebElement> {
	WebDriver wd;
	@BeforeTest
	
	public void bt1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		//wd.get("https://demoqa.com/text-box");
		//wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		//wd.manage().window().maximize();
}
	
	@Test
	public void frame() {
		wd.get("https://demoqa.com/frames");
		JavascriptExecutor js=(JavascriptExecutor)wd;
		js.executeScript("document.getElementById('frame2').scrollIntoView()");
		java.util.List<org.openqa.selenium.WebElement> frames=wd.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		for(int i=0;i<frames.size();i++) {
			String names=frames.get(i).getAttribute("id");
			System.out.println(names);
			
		}
		wd.switchTo().frame("frame2");
		js.executeScript("windows.scrollby(0,100)");
		wd.switchTo().frame("frame1");
		wd.findElement(By.xpath("frame1")).getText();
		//wd.close();
	}
}
