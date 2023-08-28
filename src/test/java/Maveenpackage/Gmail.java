package Maveenpackage;

import java.awt.Robot;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {
	WebDriver wd;
	String url = "https://www.google.com/";
	Robot rt;

	@BeforeTest
	public void bt1() {
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		wd.get(url);
		wd.navigate().to(url);;
		System.out.println(wd.getTitle());
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.manage().window().maximize();
	}

	@Test
	public void test1() throws InterruptedException {
		String originalWindow = wd.getWindowHandle();
		System.out.println("The original window:"+originalWindow);
		Actions act = new Actions(wd);
		WebElement we1 = wd.findElement(By.linkText("Gmail"));
		//act.click(we1).build().perform();
		act.keyDown(Keys.SHIFT).click(we1).keyUp(Keys.SHIFT).build().perform();
		System.out.println("Title is:"+wd.getTitle());
		
		
		Set<String> windowSet = wd.getWindowHandles();
		System.out.println("Total No.of windows:"+windowSet.size());
		// for each loop
		for (String windowHandle : windowSet) {
			System.out.println("The Windowhanle:"+windowHandle);
		    if(!originalWindow.contentEquals(windowHandle)) {
		        wd.switchTo().window(windowHandle);
		        System.out.println("Title is:"+wd.getTitle());
		        break;
		    }
		}
		
//		WebDriverWait wait = new WebDriverWait(wd, 10);
		wd.quit();
	
		
	}

}
