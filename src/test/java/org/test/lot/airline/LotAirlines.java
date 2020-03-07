package org.test.lot.airline;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LotAirlines extends BaseClassLot {

	@BeforeClass
	public static void beforeClass() {
		// Launch Browser
		launchChromeBrowser();

		// Maximize
		maximize();
	}

	@AfterClass
	public static void afterClass() {
		// driver.quit();
	}

	@Before
	public void beforeMethod() {
		Date date = new Date();
		System.out.println(date);
	}

	@After
	public void afterMethod() {
		Date date = new Date();
		System.out.println(date);
	}

	@Test
	public void lotAirways() throws Throwable {
		// Load URL
		openUrl("https://www.lot.com/in/en/");

		// Wait
		Thread.sleep(4000);

		// KeyBoard Action
		Robot r = new Robot();
		for (int i = 1; i <= 2; i++) {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// Edition Page
		EditionPageLot el = new EditionPageLot();

		// Select Country
		btnClick(el.getSelectCountry());

		// Select Germany
		btnClick(el.getSelectGermany());
		ScreenShot("LOT1.jpg");

		// Text English
		fill(el.getTextEnglish(), "English");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// Home Page
		HomePageLot hp = new HomePageLot();

		// Cookies
		btnClick(hp.getCookies());
		ScreenShot("LOT2.jpg");

		// Departure Station
		btnClick(hp.getFrom());
		fill(hp.getAirportName(), "TXL");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// Arrival Station
		fill(hp.getAirportName(), "JFK");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		// Departure Date
		btnClick(hp.getDepartureDate());
		for (int i = 1; i <= 5; i++) {
			btnClick(hp.getNext());
		}
		btnClick(hp.getDate());

		// Return Date
		btnClick(hp.getReturnDate());
		btnClick(hp.getDate());
		ScreenShot("LOT3.jpg");

		// Search Flight
		btnClick(hp.getSearch());
		ScreenShot("LOT4.jpg");

		// Flight Selection Page
		FlightSelectionPage fp = new FlightSelectionPage();

		// Departure Flight
		btnClick(fp.getDepartureFlight());
		ScreenShot("LOT5.jpg");

		// Return Flight
		btnClick(fp.getReturnFlight());
		ScreenShot("LOT6.jpg");

		// Continue
		btnClick(fp.getContinue());
		ScreenShot("LOT7.jpg");

		// Passenger Data Page
		PassengerDataPage pp = new PassengerDataPage();

		// Title Selection
		btnClick(pp.getTitle());
		selectByValue(pp.getTitle(), "passenger.titles_mr");

		// First and Middle Name
		btnClick(pp.getFirstName());
		fill(pp.getFirstName(), excelRead(0, 1));

		// Fill Last Name
		btnClick(pp.getLastName());
		fill(pp.getLastName(), excelRead(1, 1));

		// Birth Day
		btnClick(pp.getBirthday());
		selectByValue(pp.getBirthday(), "27");

		// Birth Day
		btnClick(pp.getBirthMonth());
		selectByValue(pp.getBirthMonth(), "2");

		// Birth Day
		btnClick(pp.getBirthYear());
		selectByValue(pp.getBirthYear(), "1995");

		// Email
		btnClick(pp.getEmail());
		fill(pp.getEmail(), excelRead(2, 1));

		// Country Code
		btnClick(pp.getCountryCode());
		selectByValue(pp.getCountryCode(), "91");

		// Phone Number
		btnClick(pp.getPhone());
		fill(pp.getPhone(), excelRead(3, 1));
		ScreenShot("LOT8.jpg");

		// Term Condition
		btnClick(pp.getTermAndCondition());
		ScreenShot("LOT9.jpg");

		// Continue To Seat Selection Page
		btnClick(fp.getContinue());
		ScreenShot("LOT10.jpg");

		// Seat Selection Page
		SeatSelectionPageLot ss = new SeatSelectionPageLot();

		// Select First Seat
		btnClick(ss.getSeat1());
		btnClick(ss.getSelectSeat1());
		ScreenShot("LOT11.jpg");

		// Select Second Seat
		btnClick(ss.getSeat2());
		btnClick(ss.getSelectSeat2());
		ScreenShot("LOT12.jpg");

		// Select Third Seat
		btnClick(ss.getSeat3());
		btnClick(ss.getSelectSeat3());
		ScreenShot("LOT13.jpg");

		// Select Fourth Seat
		btnClick(ss.getSeat4());
		btnClick(ss.getSelectSeat4());
		ScreenShot("LOT14.jpg");

		// Continue To Next Page
		btnClick(fp.getContinue());
		ScreenShot("LOT15.jpg");

		// Payment page
		PaymentPageLot pay = new PaymentPageLot();

		// Thanks To Co2
		btnClick(pay.getCo2());
		ScreenShot("LOT16.jpg");

		// Card Number
		btnClick(pay.getCardNumber());
		fill(pay.getCardNumber(), excelRead(4, 1));

		// CVV Number
		btnClick(pay.getCvvNumber());
		fill(pay.getCvvNumber(), excelRead(5, 1));

		// Expire Month
		btnClick(pay.getCardExpMonth());
		selectByValue(pay.getCardExpMonth(), "10");

		// Expire Year
		btnClick(pay.getCardExpYear());
		selectByValue(pay.getCardExpYear(), "2024");

		// Card Holder Name
		btnClick(pay.getCardHolderName());
		fill(pay.getCardHolderName(), excelRead(6, 1));

		// Street Name
		btnClick(pay.getStreetName());
		fill(pay.getStreetName(), excelRead(7, 1));

		// City Name
		btnClick(pay.getCityName());
		fill(pay.getCityName(), excelRead(8, 1));

		// Postal Code
		btnClick(pay.getZipCode());
		fill(pay.getZipCode(), excelRead(9, 1));
		ScreenShot("LOT17.jpg");

		// Continue To Next Page
		btnClick(fp.getContinue());
		ScreenShot("LOT18.jpg");

	}

}
