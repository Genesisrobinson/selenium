package com.common.components;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webdriver {
public static WebDriver driver;
//@BeforeTest
public static void  webdriver(){
	System.out.println("Driver object created");	
	System.setProperty("webdriver.chrome.driver", "C://softwares//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();  
    System.out.println("Driver object created");
    //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	//Puts an Implicit wait, Will wait for 10 seconds before throwing exception
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
   driver.navigate().to("http://www.calculator.net/"); 
  }
public static void startdriver(){
		driver.navigate().to("http://www.calculator.net/");
}
public static void stopdriver(){
	 driver.close();
}

}


