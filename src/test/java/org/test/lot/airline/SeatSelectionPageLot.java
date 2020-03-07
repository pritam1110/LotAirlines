package org.test.lot.airline;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeatSelectionPageLot extends BaseClassLot {
	public SeatSelectionPageLot() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@ FindBy(xpath="//button[@aria-controls='seatSelection_flight_1_segment_1']")
	private WebElement Seat1;
	
	@ FindBy(xpath="//button[@aria-controls='seatSelection_flight_1_segment_2']")
	private WebElement seat2;
	
	@ FindBy(xpath="//button[@aria-controls='seatSelection_flight_2_segment_3']")
	private WebElement seat3;
	
	@ FindBy(xpath="//button[@aria-controls='seatSelection_flight_2_segment_4']")
	private WebElement seat4;
	
	@ FindBy(xpath="//a[@data-describedby='popover-seat-body_flight_1_segment_1_2_13C']")
	private WebElement selectSeat1;
	
	@ FindBy(xpath="//a[@data-describedby='popover-seat-body_flight_1_segment_2_0_27G']")
	private WebElement selectSeat2;
	
	@ FindBy(xpath="//a[@data-describedby='popover-seat-body_flight_2_segment_3_0_28H']")
	private WebElement selectSeat3;
	
	@ FindBy(xpath="//a[@data-describedby='popover-seat-body_flight_2_segment_4_2_15C']")
	private WebElement selectSeat4;

	public WebElement getSeat1() {
		return Seat1;
	}

	public WebElement getSeat2() {
		return seat2;
	}

	public WebElement getSeat3() {
		return seat3;
	}

	public WebElement getSeat4() {
		return seat4;
	}

	public WebElement getSelectSeat1() {
		return selectSeat1;
	}

	public WebElement getSelectSeat2() {
		return selectSeat2;
	}

	public WebElement getSelectSeat3() {
		return selectSeat3;
	}

	public WebElement getSelectSeat4() {
		return selectSeat4;
	}
	
	

}
