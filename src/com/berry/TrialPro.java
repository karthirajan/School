package com.berry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrialPro {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspacevv\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login");
		Thread.sleep(3000);
		WebElement insta = driver.findElement(By.name("username"));
		insta.sendKeys("vini@gmail.com");
		WebElement ins = driver.findElement(By.xpath("// input[@name='password']"));
		ins.sendKeys("uy3wu4239y");
		WebElement logbtn = driver.findElement(By.xpath("//div[text()='Log In']"));
		logbtn.click();
	}
}