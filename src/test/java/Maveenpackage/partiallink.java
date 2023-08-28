package Maveenpackage;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class partiallink {
WebDriver wd;
String url="https://www.google.com/";
Robot rt;
@BeforeTest
public void bt1() {
WebDriverManager.chromedriver().setup();wd=new ChromeDriver();wd.get(url);
wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
wd.manage().window().maximize();
}
 @Test
 public void test1() {
Actions act= new Actions(wd);
 WebElement we2=wd.findElement(By.partialLinkText("il"));
 act.click(we2).build().perform();
 }
 @Test
 public void test2() {
 Actions act= new Actions(wd);
WebElement we1=wd.findElement(By.xpath("//*[@aria-label='Gmail (opens a new tab)']"));
act.contextClick(we1).build().perform();
rt.keyPress(MenuKeyEvent.VK_DOWN);
rt.keyRelease(MenuKeyEvent.VK_DOWN);
rt.keyPress(MenuKeyEvent.VK_DOWN);
rt.keyRelease(MenuKeyEvent.VK_DOWN);
rt.keyPress(KeyEvent.VK_ENTER);
} 

}




