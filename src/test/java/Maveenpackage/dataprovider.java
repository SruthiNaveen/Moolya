package Maveenpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider {
	WebDriver wd;
	@DataProvider
public Object[][]dp(){
	return new Object[][] {
		new Object[] {"sandeep","Admin123"},
		new Object[] {"Admin","admin123"},
};
}
	@BeforeTest
	public void bt1(){
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().window().maximize();
		//Thread.sleep(3000);
	
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test(dataProvider = "dp")
	public void login(String n,String s) {
		wd.findElement(By.xpath("//*[@name='username']")).sendKeys(n);
		wd.findElement(By.xpath("//*[@type='password']")).sendKeys(s);
		wd.findElement(By.xpath("//*[@type='submit']")).click();
		 wd.findElement(By.xpath("//*[@class='oxd-userdropdown-img']")).click();
	

		//wd.findElement(By.xpath("//*[@class='oxd-userdropdown-img']")).click();
		wd.findElement(By.xpath("(//*[@class='oxd-userdropdown-link'])[4]")).click();

	}
	}
