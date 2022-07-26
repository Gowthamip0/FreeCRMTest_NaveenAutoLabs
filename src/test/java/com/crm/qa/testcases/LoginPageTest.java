package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	//HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeTest
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void SignInButtonTest() throws InterruptedException{
		loginPage.clickSignInButton();
		Thread.sleep(5000);
	}
	
	
	@Test(priority=2)
	public void loginPageTitleTest() throws InterruptedException {
		Thread.sleep(5000);
		String title = loginPage.validateLoginPageTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "Address Book - Sign In");
		System.out.println("After assetion:"+title);
	}
	
	@Test(priority=3)
	public void loginTest(){
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
