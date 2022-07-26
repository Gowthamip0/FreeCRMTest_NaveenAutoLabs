package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.PreLoginPage;

public class PreLoginPageTest extends TestBase{
	
	PreLoginPage preLoginPage;
	
	public PreLoginPageTest(){
		super();
	}
	
	@BeforeTest
	public void setUp(){
		initialization();
		preLoginPage = new PreLoginPage();	
	}
	
	@Test(priority=1)
	public void preLoginPageTitleTest(){
		String title = preLoginPage.validatePreLoginPageTitle();
		Assert.assertEquals(title, "Address Book");
	}
	
	@Test(priority=2)
	public void validateMainHeadingTest(){
		String mainHead = preLoginPage.validateMainHeading();
		Assert.assertEquals(mainHead, "Welcome to Address Book");
	}
	
	@Test(priority=3)
	public void validateSubHeadingTest(){
		String subHead= preLoginPage.validateSubHeading();
		Assert.assertEquals(subHead, "A simple web app for showing off your testing");
	}
	
	
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	
	

}
