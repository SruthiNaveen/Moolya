package Maveenpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	WebDriver wd;
	@BeforeTest
	
	public void bt1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		wd=new ChromeDriver();
		//wd.get("https://demoqa.com/text-box");
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		wd.manage().window().maximize();	
}
	@Test(priority = 8)
    public void navigatetoaccount () {
   wd.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=9595003453074053944&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007810&hvtargid=kwd-10573980&hydadcr=14453_2154373");
   WebElement we= wd.findElement(By.xpath("//*[@id='nav-link-accountList']"));
  Actions act = new Actions(wd);
  act.moveToElement(we).build().perform();
  String st= wd.getTitle();
  System.out.println(st);
  wd.findElement(By.xpath("//*[@id='nav_prefetch_yourorders']")).click();
  //wd.findElement(By.xpath("//*[contains(test().'YourOrders'")).click();//nav_prefetch_yourorders
  System.out.println("Your orders clicked");
  wd.findElement(By.xpath("//*[@class='a-icon a-icon-logo']")).click();
  System.out.println("returned to home page");
	}
	
}
