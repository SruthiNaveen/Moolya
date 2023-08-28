package Maveenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class parrelltesting {
	WebDriver wd;
@Parameters("mybrowser")
@BeforeTest
public void bt1(String mybrowser) {
if(mybrowser.equalsIgnoreCase("chrome"))
{
	WebDriverManager.chromedriver().setup();
	 wd=new ChromeDriver();
	 wd.get("https://www.moneycontrol.com/personal-finance/tools/emi-calculator.html"); 
	 }
else if (mybrowser.equalsIgnoreCase("firefox"))
	 {
	WebDriverManager.firefoxdriver().setup();
	wd=new FirefoxDriver();
	 }

} 





	@Test
	public void test(){
JavascriptExecutor js=(JavascriptExecutor)wd;
	//js.executeScript("window.scrollBy(0,900)");
	 js.executeScript("document.getElementById('emi_table').scrollIntoView()");
	 String str=wd.findElement(By.xpath("//table[@id='emi_table']/tbody/tr[5]/td[3]")).getText();
	System.out.println(str);
	}



	@Test
	@AfterTest
	public void test1() {
		wd.quit();
	}
}
