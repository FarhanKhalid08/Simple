package test10;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Class10 {
public static WebDriver driver;
@Test
public void Testing() throws Exception {
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://facebook.com");
	
	WebElement screenshot= driver.findElement(By.cssSelector("div._8esl>div>img"));
	File source= screenshot.getScreenshotAs(OutputType.FILE);
	File destination= new File (System.getProperty("user.dir")+"\\Screen Shots\\FaceBook.png");
	FileHandler.copy(source, destination);
	driver.quit();
}
}
