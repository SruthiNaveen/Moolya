package Maveenpackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoqa {
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
	@Test(priority = 1)
	public void Testbox() {
		wd.get("https://demoqa.com/text-box");
		//wd.findElement(By.id(null))
		wd.findElement(By.xpath("//*[@id='userName']")).sendKeys("Sruthi");
		wd.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("sru@gmail.com");
		wd.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("Alwal");
		wd.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys("Alwal");
		//wd.findElements(((WebElement) By.xpath("//[button@class='btn-btn-primary']")).click();
		wd.findElement(By.xpath("//button[@id='submit']")).click();
	
		
	}
	@Test (priority = 2)
	public void checkbox() {
		wd.get("https://demoqa.com/checkbox");
		wd.findElement(By.xpath("(//*[@class='rct-collapse rct-collapse-btn'])[1]")).click();
		wd.findElement(By.xpath("(//*[@class='rct-collapse rct-collapse-btn'])[2]")).click();
		wd.findElement(By.xpath("(//*[@class='rct-checkbox'])[3]")).click();


}
	@Test (priority = 3)
	public void radium() {
		wd.get("https://demoqa.com/radio-button");
		wd.findElement(By.xpath("//*[@for='yesRadio']")).click();
		
}
	@Test(priority = 4)
	public void webtable() {
		wd.get("https://demoqa.com/webtables");
		//wd.findElement(By.id(null))
		wd.findElement(By.xpath("//*[@id='addNewRecordButton']")).click();
		
		wd.findElement(By.xpath("//*[@id='firstName']")).sendKeys("sony");
		wd.findElement(By.xpath("//*[@id='lastName']")).sendKeys("nirmala");
		wd.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("sru@gmail.com");
		wd.findElement(By.xpath("//*[@id='age']")).sendKeys("30");
		wd.findElement(By.xpath("//*[@id='salary']")).sendKeys("30000");
		wd.findElement(By.xpath("//*[@id='department']")).sendKeys("IT");		
		//wd.findElements(((WebElement) By.xpath("//[button@class='btn-btn-primary']")).click();
		wd.findElement(By.xpath("//button[@id='submit']")).click();		
        wd.findElement(By.xpath("//*[@id='edit-record-1']")).click();		
		wd.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Sourya");
		wd.findElement(By.xpath("//button[@id='submit']")).click();	
		 wd.findElement(By.xpath("//*[@id='delete-record-2']")).click();
			
			
	}
	@Test (priority = 5)
	public void buttons() {
		wd.get("https://demoqa.com/buttons");
		Actions action = new Actions(wd);
		WebElement we=wd.findElement(By.xpath("//*[@id='rightClickBtn']"));
		 action.contextClick(we).build().perform();

	     WebElement wr=wd.findElement(By.xpath("//*[@id='doubleClickBtn']"));
		     action.doubleClick(wr).build().perform();
		     
		     WebElement wy=wd.findElement(By.xpath("//*[@type='button']"));
		     action.click(wy).build().perform();
		     
	
		
	}
	@Test(priority = 6)
    public void Link() {
      wd.get("https://demoqa.com/links");
      wd.findElement(By.xpath("//*[@id='simpleLink']")).click();
      wd.findElement(By.xpath("//*[@id='created']")).click();
      
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
  System.out.println("wish lis clicked");
  wd.findElement(By.xpath("//*[@class='a-icon a-icon-logo']")).click();
  System.out.println("returned to home page");
	}
	
	
	@Test(priority = 7)
    public void Title () {
   wd.get("https://demoqa.com/");
  String st= wd.getTitle();
  System.out.println(st);
 AssertJUnit.assertEquals(st,"DEMOQA");
 System.out.println("Assertion passed");
    }
	@Test
	 public void alert() throws InterruptedException {
	  wd.get("https://demoqa.com/alerts");
	 wd.findElement(By.xpath("//*[@id='alertButton']")).click();
	 Thread.sleep(5000);
	Alert alt=wd.switchTo().alert();
	
	alt.accept();
	}
	@Test
public void timerAlertButton() throws InterruptedException {
wd.get("https://demoqa.com/alerts");
wd.findElement(By.xpath("//*[@id='timerAlertButton']")).click();
 Thread.sleep(6000);
Alert alt=wd.switchTo().alert();
 alt.accept();
 }
@Test
public void confirmButton() throws InterruptedException {
 wd.get("https://demoqa.com/alerts");
wd.findElement(By.xpath("//*[@id='confirmButton']")).click();
Thread.sleep(6000);
Alert alt=wd.switchTo().alert();
 alt.dismiss();
 }
 @Test
public void promtButton() throws InterruptedException {
wd.get("https://demoqa.com/alerts");
Thread.sleep(2000);
JavascriptExecutor js=(JavascriptExecutor)wd;
js.executeScript("document.getElementById('promtButton').scrollIntoView()");
wd.findElement(By.xpath("(//*[@class='btn btn-primary'])[4]")).click();
Thread.sleep(2000);
 Alert alt=wd.switchTo().alert();
alt.sendKeys("sandeep");
alt.accept();
}
@Test
public void switchtootherwindow() throws InterruptedException {
wd.get("https://demoqa.com/browser-windows");
String pw=wd.getWindowHandle();
System.out.println(pw);
JavascriptExecutor js=(JavascriptExecutor)wd;
js.executeScript("document.getElementById('windowButton').scrollIntoView()");
//Thread.sleep(2000);
WebElement we= wd.findElement(By.xpath("//*[@id='windowButton']"));
for(int i=0;i<3;i++)
	 {
	 we.click();
	 }
Set<String>Allwindows=wd.getWindowHandles();
System.out.println(Allwindows);
System.out.println(Allwindows.size());
String lastwindow="";
for(String handle:Allwindows) {
	wd.switchTo().window(handle);
	wd.get("https://www.google.co.in/");
}
wd.switchTo().window(pw);
wd.get("https://demoqa.com/browser-windows");
//wd.close();
wd.switchTo().window(lastwindow);
wd.get("https://www.amazon.in");
System.out.println(lastwindow);
}

@Test
public void uploadanddownload()
{
wd.get("https://demoqa.com/upload-download");
 wd.findElement(By.xpath("//*[@id='downloadButton']")).click();
wd.findElement(By.xpath("//*[@id='uploadFile']")).sendKeys("/Users/srimoksham/image.png");}
@Test
public void drag() {
wd.get("https://demoqa.com/droppable");
Actions act=new Actions(wd);
WebElement we1=wd.findElement(By.xpath("//*[@id='draggable']"));
WebElement we2=wd.findElement(By.xpath("//*[@id='droppable']"));
act.dragAndDrop(we1, we2).build().perform();
}

}

	

