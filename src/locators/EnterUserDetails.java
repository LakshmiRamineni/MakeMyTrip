package locators;

import org.testng.annotations.Test;
import org.openqa.selenium.By;


public class EnterUserDetails extends LoginPage{
	@Test (groups={"Sanity"})
	public void UserDetails() {
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
