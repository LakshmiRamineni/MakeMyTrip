package locators;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SelectBus extends LoginPage {
	@Test (groups={"Sanity", "Regression"})
	public void Bus() {
		driver.findElement(By.xpath(LoginPage.SelectBus)).click();
		driver.findElement(By.id(LoginPage.Selectseat)).click();
		driver.findElement(By.id(LoginPage.Boardingpoint)).sendKeys("Suraram");
		driver.findElement(By.xpath(LoginPage.Bcontinue)).click();
	}

}
