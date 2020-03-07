package org.test.lot.airline;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPageLot extends BaseClassLot {
	public PaymentPageLot() {
		PageFactory.initElements(driver, this);
	}
	
	@ FindBy(xpath = "//label[@for='_purchaseportlet_WAR_lotairwaysportlet__carbon-id-3']")
	private WebElement co2;
	
	@ FindBy(xpath= "//input[@id='adyen-encrypted-form-number']")
	private WebElement cardNumber;
	
	@ FindBy(xpath= "//input[@id='cvc']")
	private WebElement cvvNumber;
	
	@ FindBy(xpath = "//select[@id='adyen-encrypted-form-expiry-month']")
	private WebElement cardExpMonth;
	
	@ FindBy(xpath= "//select[@id='adyen-encrypted-form-expiry-year']")
	private WebElement cardExpYear;
	
	@ FindBy(xpath= "//input[@id='adyen-encrypted-form-holder-name']")
	private WebElement cardHolderName;
	
	@ FindBy(xpath = "//input[@id='street']")
	private WebElement streetName;
	
	@ FindBy(xpath = "//input[@id='city']")
	private WebElement cityName;
	
	@ FindBy(xpath= "//input[@id='postal-code']")
	private WebElement zipCode;

	public WebElement getCo2() {
		return co2;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getCardExpMonth() {
		return cardExpMonth;
	}

	public WebElement getCardExpYear() {
		return cardExpYear;
	}

	public WebElement getCardHolderName() {
		return cardHolderName;
	}

	public WebElement getStreetName() {
		return streetName;
	}

	public WebElement getCityName() {
		return cityName;
	}

	public WebElement getZipCode() {
		return zipCode;
	}
	
	

}
