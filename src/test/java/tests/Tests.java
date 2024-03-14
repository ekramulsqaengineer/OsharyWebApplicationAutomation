package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class Tests extends Base{
	 WebDriver driver;
//	@Test(priority=0)
//	public void SignUp() throws InterruptedException {
//	    WebDriver driver = new ChromeDriver();
//		ExtentTest test = extent.createTest("Oshary Web Application", "Oshary Application Test Case");
//	    test.log(Status.INFO, "Test SignUp Functionality");
//		

	    //driver.findElement(By.linkText("No thanks Just Let Me Shop")).click();
	    //driver.findElement(By.tagName("p")).click();
	   // driver.switchTo().alert().dismiss();
	   //driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div[1]/img")).click();
		//driver.findElement(By.partialLinkText("No thanks Just Let Me Shop")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div/div[2]/div[1]/img ")).click();
	   // driver.findElement(By.tagName("p")).click();
	    //driver.findElement(By.cssSelector("<img src=\"https://ttigcdn.aventra.co.uk/upload/oshary/image/files_1670930969180.png\" alt=\"\" srcset=\"\">")).click();
		//test.log(Status.INFO, "Click Pop Up Menu");
//		driver.get("https://oshary.com/");
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div[3]/div/p[1]/a")).click();
//		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[3]/div/p[1]/a")).click();
//		test.log(Status.INFO, "Click Login/Sign Up Button");
//		
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/form/div[4]/p/a")).click();
//		test.log(Status.INFO, "Click Joint Now Button");
//		Assert.assertTrue(true);
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[1]/div[1]/form/div[1]/div/input")).sendKeys("Monirul");
//		test.log(Status.INFO, "Set User Name Monirul");
//		
//		Thread.sleep(1000);
//		Select countryCode = new Select(driver.findElement(By.name("countryCode")));
//		countryCode.selectByVisibleText("Bangladesh (+880)");
//		test.log(Status.INFO, "Set Country Code");
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[1]/div[1]/form/div[2]/div[2]/input")).sendKeys("1324444703");
//		test.log(Status.INFO, "Set Mobile Number");
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[1]/div[1]/form/div[3]/div/input")).sendKeys("oshary@gmail.com");
//		test.log(Status.INFO, "Set Email Address");
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[1]/div[1]/form/div[4]/div[1]/input")).sendKeys("123456");
//		test.log(Status.INFO, "Set Password");
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[1]/div[1]/form/div[4]/div[2]/input")).sendKeys("Dhaka");
//		test.log(Status.INFO, "Set Address");
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[1]/div[1]/form/div[5]/span")).click();
//		test.log(Status.INFO, "Click Check Box");
//		
//		
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[1]/div[1]/form/div[6]/button")).click();
//		test.log(Status.INFO, "Click Sign Up Button");
//		
//		driver.findElement(By.xpath("//*[@id=\"myPopup\"]/div[2]/div/button")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
//		
//		driver.findElement(By.xpath("/html/body/div[3]/div/input[1]")).sendKeys("");
//		//countryCode.selectByIndex(0);
//		
////		if(driver.getTitle().equals("oshary"))
////		{
////		test.log(Status.PASS, "https://oshary.com/");
////		}
////		else 
////		{
////		test.log(Status.FAIL, "Test Failed");  
////		}
	//}
	@Test(priority=1)
	public void Login() throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();

		ExtentTest test1 = extent.createTest("Oshary Web Application", "Oshary Application Test Case");
	    test1.log(Status.INFO, "Test Login & Create Order Functionality");
		
	    driver.get("http://172.16.150.145:3000/");
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	    driver.manage().window().maximize();
        
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div[3]/div/p[1]/a")).click();
		test1.log(Status.INFO, "Click Login/SignUp Button");
		//test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test1.addScreenCaptureFromPath("screenshot.png");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/form/div[1]/input")).sendKeys("ekram@logicwise.fi");
		test1.log(Status.INFO, "Set Up Email Address");
		test1.addScreenCaptureFromPath("screenshot.png");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/form/div[2]/input")).sendKeys("ekram1234");
		test1.log(Status.INFO, "Set Up Password");
		test1.addScreenCaptureFromPath("screenshot.png");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div/div[2]/div[2]/form/div[4]/button")).click();
		test1.log(Status.INFO, "Click Login Button");
		test1.addScreenCaptureFromPath("screenshot.png");
		
		Thread.sleep(1000);
		driver.findElement(By.className("swal2-confirm")).click();
//		Thread.sleep(1000);
//		String msg = driver.findElement(By.id("swal2-title")).getText();
//		System.out.println(msg);
//		if(msg.equals("Login Successful!")) 
//		{
//			System.out.println("Test Pass");
//		}else {
//			System.out.println("Test Fail");
//		}
		

        // Launch the application		
		
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
       // WebElement Element = driver.findElement(By.partialLinkText("Dark Red Katan Zari Work Saree"));
        WebElement Element= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[8]/div/div[2]/section/div/div/div[2]/div/a[1]/div"));
        
        //This will scroll the page Horizontally till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);
      
    	Element.click();
    	
    	
    	
    	Thread.sleep(1000);
    	driver.findElement(By.className("cart")).click();
    	test1.log(Status.INFO, "Click Cart Button");
    	test1.addScreenCaptureFromPath("screenshot.png");
    	
    	Thread.sleep(1000);
    	driver.findElement(By.className("checkout-btn")).click();
    	test1.log(Status.INFO, "Click Checkout Button");
    	test1.addScreenCaptureFromPath("screenshot.png");
    	
    	Thread.sleep(1000);
    	driver.findElement(By.id("name-input")).clear();
    	test1.log(Status.INFO, "Clear Name");
    	test1.addScreenCaptureFromPath("screenshot.png");
    	
    	Thread.sleep(1000);
    	driver.findElement(By.id("name-input")).sendKeys("Md. Zakir Hossain");
    	test1.log(Status.INFO, "Set Name");
    	test1.addScreenCaptureFromPath("screenshot.png");
    	
    	Thread.sleep(1000);
    	driver.findElement(By.id("phone-input")).clear();
    	test1.log(Status.INFO, "Clear Mobile Number");
    	test1.addScreenCaptureFromPath("screenshot.png");
    	
    	Thread.sleep(1000);
    	driver.findElement(By.id("phone-input")).sendKeys("1858871165");
    	test1.log(Status.INFO, "Set Mobile Number");
    	test1.addScreenCaptureFromPath("screenshot.png");
    	
    	Thread.sleep(1000);
    	driver.findElement(By.id("zip-input")).clear();
    	test1.log(Status.INFO, "Clear Email Field");
    	test1.addScreenCaptureFromPath("screenshot.png");
    	
    	Thread.sleep(1000);
    	driver.findElement(By.id("zip-input")).sendKeys("jakir@gmail.com");
    	test1.log(Status.INFO, "Set Email Address");
    	test1.addScreenCaptureFromPath("screenshot.png");
    	
    	
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[1]/form/div[1]/div[4]/div[2]/div[1]/input")).click();
    	test1.log(Status.INFO, "Click Please Choose Your City");
    	test1.addScreenCaptureFromPath("screenshot.png");
    	
    	Thread.sleep(1000);
    	driver.findElement(By.id("address-input")).sendKeys("Shohid Minar Road Jame Masjid, Mirpur Road, Dhaka");
    	test1.log(Status.INFO, "Set Address");
    	test1.addScreenCaptureFromPath("screenshot.png");
    	
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[1]/form/div[2]/div/div[1]/div")).click();
    	test1.log(Status.INFO, "Click Cash On Delivery");
    	test1.addScreenCaptureFromPath("screenshot.png");
    	
   	    Thread.sleep(1000);
   	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[1]/form/div[3]/button")).click();
    	test1.log(Status.INFO, "Click Place Order");
    	test1.addScreenCaptureFromPath("screenshot.png");
    	test1.log(Status.INFO, "Test Complite");
    	
    	driver.close();
	}
	
//	@Test(priority=2)
//
//	public void CreateOrder() throws InterruptedException, IOException {
//		WebDriver driver = new ChromeDriver();
//		ExtentTest test2 = extent.createTest("Oshary Web Application", "Oshary Application Test Case");
//	    test2.log(Status.INFO, "Test Check Out Functionality");
//		//WebDriver driver = new ChromeDriver();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//	        // Launch the application		
//	        
//		    //driver.get("http://172.16.150.145:3000/");
//		   	Thread.sleep(1000);
//	        WebElement Element = driver.findElement(By.partialLinkText("Dark Red Katan Zari Work Saree"));
//	        //This will scroll the page Horizontally till the element is found		
//	        js.executeScript("arguments[0].scrollIntoView();", Element);
//	    	Thread.sleep(1000);
//	    	Element.click();
//	    	
//	    	
//	    	
//	    	Thread.sleep(1000);
//	    	driver.findElement(By.className("cart")).click();
//	    	test2.log(Status.INFO, "Click Cart Button");
//	    	test2.addScreenCaptureFromPath("screenshot.png");
//	    	
//	    	Thread.sleep(1000);
//	    	driver.findElement(By.className("checkout-btn")).click();
//	    	test2.log(Status.INFO, "Click Checkout Button");
//	    	test2.addScreenCaptureFromPath("screenshot.png");
//	}

}
