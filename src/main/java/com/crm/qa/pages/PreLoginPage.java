package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class PreLoginPage extends TestBase{
	
	//Page Factory - OR:
		@FindBy(xpath="//h1")
		WebElement mainHeading;
		
		@FindBy(xpath="//h4")
		WebElement subHeading;
		
		
		
		
		public PreLoginPage()
		{
			PageFactory.initElements(driver, this);
		}
		
	
		public String validatePreLoginPageTitle(){
			return driver.getTitle();
		}
		
		public String validateMainHeading(){
			String mainHeadingText=mainHeading.getText();
			return mainHeadingText;
		}
		
		
		public String validateSubHeading(){
			String subHeadingText=subHeading.getText();
			return subHeadingText;
		}

}
