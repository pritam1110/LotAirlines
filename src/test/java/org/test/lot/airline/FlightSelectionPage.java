package org.test.lot.airline;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSelectionPage extends BaseClassLot {
	public FlightSelectionPage() {
		PageFactory.initElements(driver, this);
	}
	
	@ FindBy(xpath = "(//div[@class='ratePanel__element__wrapper__link__bordered js-rateElementSingleBordered'])[2]")
	private WebElement departureFlight;
	
	@ FindBy(xpath= "(//div[@class='ratePanel__element__wrapper__link__bordered js-rateElementSingleBordered'])[23]")
	private WebElement returnFlight;
	
	@ FindBy(xpath= "//button[@id='_shoppingcartportlet_WAR_lotairwaysportlet_cart-btn-submit']")
	private WebElement Continue;

	public WebElement getDepartureFlight() {
		return departureFlight;
	}

	public WebElement getReturnFlight() {
		return returnFlight;
	}

	public WebElement getContinue() {
		return Continue;
	}
	

}
