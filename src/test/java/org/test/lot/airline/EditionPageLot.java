package org.test.lot.airline;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditionPageLot extends BaseClassLot {
	public EditionPageLot() {
		PageFactory.initElements(driver, this);
	}
	
	@ FindBy(xpath = "//a[@id='language-options']")
	private WebElement selectCountry;
	
	@ FindBy(xpath= "//span[text()='Germany']")
	private WebElement selectGermany;
	
	@ FindBy(xpath= "//input[@class='select2-search__field']")
	private WebElement textEnglish;

	public WebElement getSelectCountry() {
		return selectCountry;
	}

	public WebElement getSelectGermany() {
		return selectGermany;
	}

	public WebElement getTextEnglish() {
		return textEnglish;
	}
	
	

}
