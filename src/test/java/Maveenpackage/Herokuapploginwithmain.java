package Maveenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Herokuapploginwithmain {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","/Users/srimoksham/Downloads/chromedriver_mac64/chromedriver");
	    
	WebDriver wd = new ChromeDriver();
wd.get("https://the-internet.herokuapp.com/login");
	    JavascriptExecutor JS = (JavascriptExecutor)wd;
	 JS.executeScript("document.getElementById('username').value='tomsmith'");
	 wd.findElement(By.xpath("//*[@id='password']")).sendKeys("SuperSecretPassword!");
	    wd.findElement(By.xpath("//*[@type='submit']")).click();
	    wd.findElement(By.xpath("//*[@href='/logout']")).click();
	Thread.sleep(3000);
	}

}
