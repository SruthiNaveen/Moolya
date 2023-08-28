package Maveenpackage;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class maveenclass {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		 wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

}
