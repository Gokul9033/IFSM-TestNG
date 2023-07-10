package com.hyr.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	@Test
	public void TestGoogle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://43.204.46.144:3000/");
		
		WebElement textUsername = driver.findElement(By.xpath("//input[@id='email']"));
		textUsername.sendKeys("gl@gmail.com");
		
		WebElement textPassword = driver.findElement(By.xpath("//input[@id='password']"));
		textPassword.sendKeys("Abcd1234");
		
		Thread.sleep(3000);
		
		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnLogin.click();
		
	}
	
	
}
