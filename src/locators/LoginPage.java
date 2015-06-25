package locators;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {

	public static WebDriver driver = null;

	@BeforeGroups (groups="Sanity")
	public static WebDriver openbrowser() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		return driver;
	}
	
	
	public static String txtSource = "from_city_typeahead";
	public static String txtDestination = "//div[@class='tt-dataset-bus_from_city_list']";
	public static String txtDestinationtypeahead = "to_city_typeahead";
	public static String SDate = "//a[contains(@id,'start_date_sec')]";
	public static String Submit = "//a[contains(@id,'submit_button')]";
	public static String SelectBus = "(//a[contains(text(),'Select Bus')])[1]";
	public static String Selectseat = "seat4";
	public static String Boardingpoint = "selBPFromSeatMap";
	public static String Bcontinue = "(//a[contains(text(),'Continue')])";
	public static String Fname = "fname_pass_0";
	public static String lname = "lname_pass_0";
	public static String age = "age_pass_0";
	public static String Email = "Email_man";
	public static String Pnumber = "phone_mobilenumber1";
	public static String Paddress = "primary_pax_address";
	public static String Bank = "Select your Bank";
	public static String SBank = "PAYMENT_DC_otherBank_chzn_o_4";
}
