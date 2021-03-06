package com.automation.training.tests;

import org.testng.annotations.Test;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Assert;

import com.automation.training.constans.Constants;
import com.automation.training.pages.FlightSearchpage;
import com.automation.training.pages.TravelocityHomePage;

public class BookingProcessTest extends BaseTest
{
	@Test
	public void firtScenarioTest() throws InterruptedException
	{
		DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
		Date currentDate = new Date();
		Date returningDateW = new Date();
		
		Calendar c = Calendar.getInstance();
		c.setTime(currentDate);
		c.add(Calendar.MONTH, 2);
		Date currentDatePlusTwoMonths = c.getTime();
		TravelocityHomePage home = getTravelocityHomePage();

		String departingDate = dateFormat.format(currentDatePlusTwoMonths);
		
		FlightSearchpage flightSearch = home.SetFlightForm("LAS", "LAX", "10/30/2018", departingDate, "3");
		
		Assert.assertEquals(Constants.SortByValaues, flightSearch.GetSortByDropdownValues());
		Assert.assertEquals(flightSearch.GetNumberOfResults(), flightSearch.GetNumberOfSelectButtons());
		flightSearch.GetSortByDropdownValues();
		Thread.sleep(10000);
		
	}

}
