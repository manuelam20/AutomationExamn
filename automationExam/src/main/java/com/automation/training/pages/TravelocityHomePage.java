package com.automation.training.pages;

import java.util.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class TravelocityHomePage extends BasePage
{

	public TravelocityHomePage(WebDriver driver) 
	{
		super(driver);
		driver.get("https://www.travelocity.com/");
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "hotel-destination-hp-hotel")
	private WebElement destinationHotelTextInput;
	
	@FindBy(id = "tab-flight-tab-hp")
	private WebElement flightsIcon;
	
	@FindBy(id = "tab-hotel-tab-hp")
	private WebElement hotelsIcon;
	
	@FindBy(id = "tab-package-tab-hp")
	private WebElement flightAndhotelsIcon;
	
	@FindBy(id = "tab-cruise-tab-hp")
	private WebElement cruiseIcon;
	
	@FindBy(id = "flight-type-roundtrip-label-hp-flight")
	private WebElement roundtripIcon;
	
	@FindBy(id = "flight-origin-hp-flight")
	private WebElement originFlightTextInput;
	
	@FindBy(id = "flight-destination-hp-flight")
	private WebElement destinationFlightTextInput;
	
	@FindBy(id = "flight-departing-hp-flight")
	private WebElement departingDateTextInput;
	
	@FindBy(id = "flight-returning-hp-flight")
	private WebElement returningDateTextInput;
	
	@FindBy(id = "flight-adults-hp-flight")
	private WebElement adultsDropdown;
	
	@FindBys({
		@FindBy(xpath= ".//div[@class ='datepicker-cal']/div[@class='datepicker-cal-month']/table/caption"),
		@FindBy(xpath= ".//div[@class ='datepicker-cal']/div[@class='datepicker-cal-month']/table/caption")
	})
	public List<WebElement> allElements;
	
	@FindBy(xpath =".//div[@class ='datepicker-cal']//button[@class='datepicker-paging datepicker-next btn-paging btn-secondary next']")
	private WebElement nextButtonCalendar;
	
	@FindBy(xpath = ".//button[@class = 'btn-primary btn-action gcw-submit']//span")
	private WebElement searchButton;
	
	
	public void ClickFlightIcon()
	{
		flightsIcon.click();
	}
	
	public void ClickHotelsIcon()
	{
		hotelsIcon.click();
	}
	
	public void ClickFlightAndHotelIcon()
	{
		flightAndhotelsIcon.click();
	}
	
	public void ClickCruisesIcon()
	{
		cruiseIcon.click();
	}
	
	public void ClickRoundtripButton()
	{
		roundtripIcon.click();
	}
	
	public void SetOrigin(String origin)
	{
		originFlightTextInput.sendKeys(origin);
	}
	
	public void SetDestination(String destination)
	{
		destinationFlightTextInput.sendKeys(destination);
	}
	
	public void SetDepartingDate(String departingDate)
	{
		departingDateTextInput.sendKeys(departingDate);
	}
	
	public void SetReturningDate(String returningDate)
	{
		returningDateTextInput.sendKeys(returningDate);
	}
	
	public void SetNumberOfAdults(String adults)
	{
		adultsDropdown.sendKeys(adults);
	}
	
	public void ClickSearchButton()
	{
		searchButton.click();
	}
	
	
	
	
	
	public FlightSearchpage SetFlightForm(String origin, String destination, String departingDate,
			String returningDate, String adults)
	{
		ClickFlightIcon();
		ClickRoundtripButton();
		SetOrigin(origin);
		SetDestination(destination);
		SetDepartingDate(departingDate);
		SetReturningDate(returningDate);
		SetNumberOfAdults(adults);
	    ClickSearchButton();
		
		return new FlightSearchpage(getDriver());
	}
	
}
