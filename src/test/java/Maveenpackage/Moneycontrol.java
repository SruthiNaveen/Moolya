package Maveenpackage;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Moneycontrol {
	 WebDriver web;
	@BeforeTest
	public void bt1() {
	WebDriverManager.chromedriver().setup();
	web=new ChromeDriver();
	web.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	web.manage().window().maximize();
	}
 @Test
	public void test() {
	web.get("https://www.moneycontrol.com/personal-finance/tools/emi-calculator.html");
	JavascriptExecutor js=(JavascriptExecutor)web;
	js.executeScript("document.getElementById('emi_table').scrollIntoView()");
	}

	


}
