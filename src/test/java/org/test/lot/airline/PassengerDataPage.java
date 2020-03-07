package org.test.lot.airline;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PassengerDataPage extends BaseClassLot {
	public PassengerDataPage() {
		PageFactory.initElements(driver, this);
	}
	
	@ FindBy(xpath = "//select[@id='_passengerdata_WAR_lotairwaysportlet_person_adult_1_title']")
	private WebElement title;
	
	@ FindBy(xpath= "//input[@id='_passengerdata_WAR_lotairwaysportlet_person_adult_1_name']")
	private WebElement firstName;
	
	@ FindBy(xpath= "//input[@id='_passengerdata_WAR_lotairwaysportlet_person_adult_1_surname']")
	private WebElement lastName;
	
	@ FindBy(xpath = "//select[@id='_passengerdata_WAR_lotairwaysportlet_person_adult_1_date_birth_day']")
	private WebElement birthday;
	
	@ FindBy(xpath= "//select[@id='_passengerdata_WAR_lotairwaysportlet_person_adult_1_date_birth_month']")
	private WebElement birthMonth;
	
	@ FindBy(xpath= "//select[@id='_passengerdata_WAR_lotairwaysportlet_person_adult_1_date_birth_year']")
	private WebElement birthYear;
	
	@ FindBy(xpath = "//input[@id='_passengerdata_WAR_lotairwaysportlet_person_adult_1_email']")
	private WebElement email;
			
	@ FindBy(xpath= "//select[@id='_passengerdata_WAR_lotairwaysportlet_person_adult_1_prefix']")
	private WebElement countryCode;
	
	@ FindBy(xpath= "//input[@id='_passengerdata_WAR_lotairwaysportlet_person_adult_1_phone']")
	private WebElement phone;
	
	@ FindBy(xpath= "//input[@id='_passengerdata_WAR_lotairwaysportlet_termsUseCheckboxCheckbox']")
	private WebElement termAndCondition;

	public WebElement getTitle() {
		return title;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBirthday() {
		return birthday;
	}

	public WebElement getBirthMonth() {
		return birthMonth;
	}

	public WebElement getBirthYear() {
		return birthYear;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCountryCode() {
		return countryCode;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getTermAndCondition() {
		return termAndCondition;
	}
	
	

}
