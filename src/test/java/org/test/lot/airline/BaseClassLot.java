package org.test.lot.airline;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassLot {
	public static WebDriver driver;
	public static Actions acc;
	public static Robot r;
	public static JavascriptExecutor js;

	// Launch Browser
	public static void launchChromeBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\LotAirline\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void launchFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\LotAirline\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	public static void launchIEBrowser() {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\Dell\\eclipse-workspace\\LotAirline\\Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}

	// SceenShot
	public static void ScreenShot(String name) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\Dell\\eclipse-workspace\\LotAirline\\ScreenShotLot\\" + name);
		FileUtils.copyFile(s, d);
	}

	// Open URL
	public static void openUrl(String url) {
		driver.get(url);
	}

	// Maximize
	public static void maximize() {
		driver.manage().window().maximize();
	}

	// click
	public static void btnClick(WebElement e) {
		e.click();
	}

	// Fill
	public static void fill(WebElement e, String text) {
		e.sendKeys(text);
	}

	// Alert Dismiss
	public static void alertDismiss() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	// Alert Accept
	public static void alertAccept() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	// MouseHover
	public static void mouseHover(WebElement e) {
		acc = new Actions(driver);
		acc.moveToElement(e).perform();
	}

	// Scroll Down
	public static void scrollDown(WebElement e) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", e);
	}

	// Scroll up
	public static void scrollUp(WebElement e) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", e);
	}

	// Drop Down
	public static void selectByValue(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByValue(value);
	}

	public static void selectByVisible(WebElement e, String value) {
		Select s = new Select(e);
		s.selectByVisibleText(value);
	}

	// Delete Cookies
	public static void deleteCookies() {
		driver.manage().deleteAllCookies();
	}

	// Print Text
	public static String texts(WebElement e) {
		String a = e.getAttribute("value");
		return a;
	}

	// Excel Read
	public static String excelRead(int rowNo, int cellNo) throws Throwable {
		String cellValue = null;
		File loc = new File("C:\\Users\\Dell\\eclipse-workspace\\LotAirline\\TestDataLot\\Lot Airlines.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Lot Input");
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int type = c.getCellType();
		if (type == 1) {
			cellValue = c.getStringCellValue();
		} else if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date dateCellValue = c.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd-MMM-yy");
				cellValue = sim.format(dateCellValue);
			} else {
				double numericCellValue = c.getNumericCellValue();
				long l = (long) numericCellValue;
				cellValue = String.valueOf(l);
			}
		}
		return cellValue;
	}

	// Excel Write
	public static void writeExcel(int rowNo, int cellNo, String ExcelValue) throws Throwable {
		File loc = new File("C:\\Users\\Dell\\eclipse-workspace\\LotAirline\\TestDataLot\\Lot Output.xlsx");
		FileInputStream stream1 = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream1);
		Sheet s = w.getSheet("Lot Output");
		Row r = s.createRow(rowNo);
		Cell c = r.createCell(cellNo);
		c.setCellValue(ExcelValue);
		FileOutputStream stream = new FileOutputStream(loc);
		w.write(stream);
	}

}
