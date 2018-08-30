package com.automation.training.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FlightSearchpage extends BasePage {

	public FlightSearchpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "sortDropdown")
	private WebElement sortByDropdown;
	
	@FindBy(xpath = ".//div[contains(@class,'grid-container standard-padding')]")
	private List<WebElement> resultsBoxes;
	
	@FindBy(xpath = ".//div[contains(@class,'grid-container standard-padding')]/div/div[2]/div/div[2]/button")
	private List<WebElement> selectButtonOnBoxes;
	
	Select select = new Select(sortByDropdown);
	
	List<WebElement> options = select.getOptions();
	
	public List<String> GetSortByDropdownValues()
	{
		List<String> result = new ArrayList<>();		
		for (WebElement elemento : select.getOptions())
		{
			result.add(elemento.getText());
		}
		
		result.forEach(System.out::println);
		return result;
	}
	
	public int GetNumberOfResults()
	{
		return resultsBoxes.size();
	}
	
	public int GetNumberOfSelectButtons()
	{
		return selectButtonOnBoxes.size();
	}
}
