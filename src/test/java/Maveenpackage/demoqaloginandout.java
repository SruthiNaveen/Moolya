package Maveenpackage;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoqaloginandout {
	//private static final boolean flase = false;
	WebDriver wd;

	@BeforeTest
	public void bt1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();
		Thread.sleep(3000);
	}

	@Test(priority =  0)
	public void login() throws InterruptedException {
		wd.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		wd.findElement(By.xpath("//*[@type='password']")).sendKeys("admin123");
		wd.findElement(By.xpath("//*[@type='submit']")).click();

	}
	@Test(priority =  1)
	public void admin() throws InterruptedException {
		Thread.sleep(3000);
		wd.findElement(By.xpath("(//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
		//wd.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).click();
		//wd.findElement(By.xpath("(//*[@type='checkbox'])[3]")).click();
		
		java.util.List<WebElement> we1=wd.findElements(By.xpath("//*[@class='oxd-table-card']"));
		System.out.println(we1.size());
		String we2=wd.findElements(By.xpath("//*[@class='oxd-table-card']")).get(0).getText();//number of element in same page we can use findelements
		System.out.println(we2);
	}
	
	
	@Test(enabled = false)
	public void logout() throws InterruptedException {
		Thread.sleep(3000);
		Actions action = new Actions(wd);
		WebElement logout = wd.findElement(By.xpath("//*[@class='oxd-userdropdown-img']"));
		action.moveToElement(logout).click().build().perform();

		//wd.findElement(By.xpath("//*[@class='oxd-userdropdown-img']")).click();
		wd.findElement(By.xpath("(//*[@class='oxd-userdropdown-link'])[4]")).click();
	}

}
