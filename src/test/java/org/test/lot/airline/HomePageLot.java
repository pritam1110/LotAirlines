package org.test.lot.airline;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLot extends BaseClassLot {
	public HomePageLot() {
		PageFactory.initElements(driver, this);
	}
	
	@ FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement airportName;
	
	@ FindBy(xpath= "//span[@id='select2-departureAirport-container']")
	private WebElement from;
	
	@ FindBy(xpath= "//span[@id='select2-destinationAirport-container']")
	private WebElement to;
	
	@ FindBy(xpath= "//span[@id='departureDate-display']")
	private WebElement departureDate;
	
	@ FindBy(xpath= "//span[@id='returnDate-display']")
	private WebElement returnDate;
	
	@ FindBy(xpath= "//a[@data-f-focus='cookies']")
	private WebElement cookies;
	
	@ FindBy(xpath= "(//button[@type='submit'])[1]")
	private WebElement search;
	
	@ FindBy(xpath= "//a[@title='Next']")
	private WebElement next;
	
	@ FindBy(xpath= "(//a[text()='18'])[2]")
	private WebElement date;

	public WebElement getAirportName() {
		return airportName;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getTo() {
		return to;
	}

	public WebElement getDepartureDate() {
		return departureDate;
	}

	public WebElement getReturnDate() {
		return returnDate;
	}

	public WebElement getCookies() {
		return cookies;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getDate() {
		return date;
	}
	
	
}
