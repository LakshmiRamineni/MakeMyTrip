package locators;

import java.util.Calendar;

import locators.LoginPage;

import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class NavHomePage extends LoginPage {
	@Test (groups={"Sanity", "Regression"})
	public void Homepage() throws InterruptedException {
		String ExpectedTitle = "Online bus tickets booking ! : Best Deals on Makemytrip";
		String ActualTitle;
		
		String baseurl = "http://www.makemytrip.com/bus-tickets/";
		driver.get(baseurl);
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//a[contains(@href,'bus-tickets')]/span[text()='Bus']")).click();
		driver.findElement(By.id(LoginPage.txtSource)).sendKeys("Hyderabad");

		Thread.sleep(4000);
		driver.findElement(By.xpath(LoginPage.txtDestination)).click();
		driver.findElement(By.id(LoginPage.txtDestinationtypeahead)).sendKeys("Vijayanagaram");
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//div[@class='tt-dataset-bus_to_city_list']")).click();
		driver.findElement(By.xpath(LoginPage.SDate)).click();

		// 16-5-2015 //td[@fare-date='16-5-2015']/a

		int sdate = Calendar.getInstance().get(Calendar.DATE) + 1;
		int month = Calendar.getInstance().get(Calendar.MONTH);
		int year = Calendar.getInstance().get(Calendar.YEAR);
		String sfulldate = sdate + "-" + month + "-" + year;
		//System.out.println(sfulldate);
		String loc = "//td[@fare-date='" + sfulldate + "']/a";
		driver.findElement(By.xpath(loc)).click();
		driver.findElement(By.xpath(LoginPage.Submit)).click();
		Thread.sleep(4000);
		ActualTitle = driver.getTitle();
		if(ActualTitle.contentEquals(ExpectedTitle)){
			System.out.println("Bus selecting page loaded successfully");
		}
		else
		{
				System.out.println("Buses selecting page not loaded");
		}
			
			
	}

	}


