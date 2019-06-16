package com.crm.qa.basepack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check2 {

	public static void main(String[] args) throws ParseException {
//		System.setProperty("webdriver.chrome.driver","./Drivers/Chrom.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://google.com");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String date1= "01/09/1990";
		Date dateO1= new SimpleDateFormat("dd/MM/yyyy").parse(date1);
		SimpleDateFormat formatter1 = new SimpleDateFormat("MMM/dd/yyyy");  
	    String formatedDate = formatter1.format(dateO1);
	    System.out.println(dateO1);
	    System.out.println(formatedDate);
		

	}

}
