package com.automation.training.tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import com.automation.training.MyDriver;
import com.automation.training.pages.TravelocityHomePage;

public class BaseTest{
	
	MyDriver myDriver;

	private TravelocityHomePage travelocityHomePage;
	
	@BeforeSuite(alwaysRun=true)
	@Parameters({"Browser"})
	public void BeforeSuite(String browser)
	{
		myDriver = new MyDriver(browser);
		travelocityHomePage = new TravelocityHomePage(myDriver.getDriver());
	}
	
	@AfterSuite(alwaysRun = true)
	public void AfterSuite()
	{
		travelocityHomePage.dispose();
	}
	
	public TravelocityHomePage getTravelocityHomePage()
	{
		return travelocityHomePage;
	}
}
