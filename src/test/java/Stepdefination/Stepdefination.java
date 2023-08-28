package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefination {
	WebDriver wd;
	 @Given("The user should be in the login page")
	 public void the_user_should_be_in_the_login_page() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
wd=new ChromeDriver();
	wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	}

	 @When("Enter the username {string}")
	public void enter_the_username(String string) {
	wd.findElement(By.xpath("//*[@name='username']")).sendKeys(string);
	}

	 @When("Enter the password {string}")
	public void enter_the_password(String string) {
	 wd.findElement(By.xpath("//*[@type='password']")).sendKeys(string);
	 }

	@When("Click on login button")
	 public void click_on_login_button() {
	wd.findElement(By.xpath("//*//*[@type='submit']")).click();
	}

	@Then("The page title should be {string}")
	public void the_page_title_should_be(String string) {
	    Assert.assertEquals(string, wd.getTitle());
	    }

}
