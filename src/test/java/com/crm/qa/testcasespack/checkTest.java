package com.crm.qa.testcasespack;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.basepack.BaseClass;
import com.crm.qa.pagespack.AddTaskPage;
import com.crm.qa.pagespack.CalendarAndTasks;
import com.crm.qa.pagespack.HomePage;
import com.crm.qa.pagespack.LoginPage;
import com.crm.qa.pagespack.PeopleAndOrganisations;
import com.crm.qa.utilpack.TestCommonUtiles;

public class checkTest extends BaseClass {
	
	public LoginPage lp;
	public HomePage hp;
	public AddTaskPage ad;
	public CalendarAndTasks cat;
	public PeopleAndOrganisations pao;
	
	@BeforeMethod
	public void setUp() throws Throwable {
		launchBrowser();
		
		lp=PageFactory.initElements(driver,LoginPage.class);
		hp=lp.Login(prop.getProperty("username"),prop.getProperty("password"));
		hp= PageFactory.initElements(driver,HomePage.class);
		pao=hp.peopleAndOrganisations();
		pao=PageFactory.initElements(driver, PeopleAndOrganisations.class);
				
	}
	
	@Test(dataProvider="getAddPersonDetail")
	public void addNewPersonTest(String title, String firstName, String lastName, String jobTitle, String organisation,String tags, String phoneNumber, String email, String website, String address) throws Throwable {
		
		pao=pao.deletePersion(firstName, lastName );
		
	}
	@DataProvider
	public Object[][] getAddPersonDetail(){
		Object data[][] = TestCommonUtiles.getTestData("Sheet2");
		return data;	
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
	
	
	

		


