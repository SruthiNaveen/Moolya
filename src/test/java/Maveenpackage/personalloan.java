package Maveenpackage;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class personalloan {
	WebDriver wd;
	@BeforeTest
	public void bt1() throws AWTException {
	WebDriverManager.chromedriver().setup();
	wd=new ChromeDriver();
	//JavascriptExecutor JS= (JavascriptExecutor)wd;
	//wd.get(url);
	wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	wd.manage().window().maximize();
	}
	@Test
	public void test1() {
		JavascriptExecutor JS= (JavascriptExecutor)wd;
		wd.get("https://www.moneycontrol.com/");
		System.out.println(wd.getTitle());
		
		  WebElement clickable = wd.findElement(By.xpath("//*[@title='Personal Finance']/span"));
		  
		  new Actions(wd).clickAndHold(clickable).perform();
		  
		//wd.findElement(By.xpath("(//*[@class='arrow down'])[6]"));
		
		System.out.println(wd.getTitle());
		
		JS.executeScript("window.scrollBy(0,200)","");
		
		wd.findElement(By.xpath("//*[@title='Home Loan Calculator']")).click();
	    System.out.println(wd.getTitle());
	    JS.executeScript("window.scrollBy(0,3500)","");
	
	    JS.executeScript("document.getElementById('emi_table').scrollIntoView()");
		String str = wd.findElement(By.xpath("//table[@id='emi_table']/tbody/tr[14]/td[5]")).getText();
		System.out.println(str);
		
		}
	
	
}



