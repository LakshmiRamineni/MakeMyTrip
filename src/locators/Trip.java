package locators;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trip {
	String ExpectedTitle = "Online bus tickets booking ! : Best Deals on Makemytrip";
	String ActualTitle;
	String baseurl = "http://www.makemytrip.com/bus-tickets/";
	public WebDriver driver = new FirefoxDriver();

	@BeforeTest
	public void launchBrowser() {
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void navHomePage() throws InterruptedException {
		String ExpectedTitle = "Online bus tickets booking ! : Best Deals on Makemytrip";
		String ActualTitle;
		ActualTitle = driver.getTitle();
		/* Populating the values */
		driver.findElement(By.id(LoginPage.txtSource)).sendKeys("Hyderabad");
		Thread.sleep(4000);
		driver.findElement(By.xpath(LoginPage.txtDestination)).click();
		driver.findElement(By.id(LoginPage.txtDestinationtypeahead)).sendKeys(
				"Vijayanagaram");
		Thread.sleep(4000);
		driver.findElement(By.xpath(LoginPage.SDate)).click();
		int sdate = Calendar.getInstance().get(Calendar.DATE) + 1;
		int month = Calendar.getInstance().get(Calendar.MONTH);
		int year = Calendar.getInstance().get(Calendar.YEAR);
		String sfulldate = sdate + "-" + month + "-" + year;
		String loc = "//td[@fare-date='" + sfulldate + "']/a";
		driver.findElement(By.xpath(loc)).click();
		driver.findElement(By.xpath(LoginPage.Submit)).click();
		Thread.sleep(40000);
		if (ActualTitle.contentEquals(ExpectedTitle)) {
			System.out.println("Bus selecting page loaded successfully");
		} else {
			System.out.println("Buses selecting page not loaded");
		}

	}

	@Test(priority = 2)
	public void selectBus() {
		driver.findElement(By.xpath(LoginPage.SelectBus)).click();
		driver.findElement(By.id(LoginPage.Selectseat)).click();
		driver.findElement(By.id(LoginPage.Boardingpoint)).sendKeys("Suraram");
		driver.findElement(By.xpath(LoginPage.Bcontinue)).click();
	}

	@Test(priority = 3)
	public void enterUserDetails() {
		driver.findElement(By.id(LoginPage.Fname)).sendKeys("ABCD");
		driver.findElement(By.id(LoginPage.lname)).sendKeys("XYZ");
		driver.findElement(By.id(LoginPage.age)).sendKeys("20");
		driver.findElement(By.id(LoginPage.Email)).sendKeys("xyz@gmail.com");
		driver.findElement(By.id(LoginPage.Pnumber)).sendKeys("9876543120");
		driver.findElement(By.id(LoginPage.Paddress)).sendKeys("adsddad");
		driver.findElement(By.partialLinkText(LoginPage.Bank)).click();
		driver.findElement(By.id(LoginPage.SBank)).click();
	}

}
