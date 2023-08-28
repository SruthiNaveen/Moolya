package Maveenpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maketrip {
	WebDriver wd;
	//Robot rt;
	WebDriverWait wait;
	@BeforeTest

	public void bt1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		wd.get("https://www.makemytrip.com/flights/");
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wd.manage().window().maximize();
	}

	@Test
	public void radium() throws InterruptedException {
		wd.get("https://www.makemytrip.com/flights/");
		wd.findElement(By.xpath("//*[@class='makeFlex hrtlCenter column active']")).click();
		wd.findElement(By.xpath("//*[@data-cy='roundTrip']")).click();

		wd.findElement(By.xpath("//input[@data-cy='fromCity']")).click();
		System.out.println("CLICKED ON FROM CITY");
		
		wd.findElement(By.xpath("//input[@data-cy='fromCity']")).sendKeys("Bengalure");
		System.out.println("ENTERED  ON FROM CITY");
		//wait.until(ExpectedConditions.visibilityOfElementLocated((By) cityText));
		//cityText.sendKeys("Ben");

		// @SuppressWarnings("unchecked")
		List<WebElement> list = wd.findElements(By.cssSelector("p[class='autoSuggestPlugin hsw_autocomplePopup']"));
		for (WebElement e:list) {
			String s = e.getText();
			System.out.println("Text is:"+s);
			if(e.getText().contains("Beng")) 
				e.click();
			break;
				
		}
//		for (int i = 0; i < list; i++) {
//			String s = list.get(i).getText();
//			System.out.println("Text is" + s);
//			if (s.contains("Ben")) {
//
//				list.get(i).getText();
//				break;
//
//			}

		}

	}


