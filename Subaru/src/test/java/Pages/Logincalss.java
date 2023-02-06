package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logincalss extends Baseclass {
	@Test(groups = "subaru")

	public void iconfunctionality() throws InterruptedException {

		boolean b = driver.findElement(By.xpath("//img[@alt='Subaru Of America Web Site']")).isEnabled();
		System.out.println(b);
		driver.findElement(By.xpath("//img[@alt='Subaru Of America Web Site']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
	}

	@Test(groups = "subaru")

	public void loginmethodsubaru() throws InterruptedException {

		System.out.println("Title of the webPage -> " + driver.getCurrentUrl());
		String actualtitle = driver.getTitle();

		String expectedtile = "Subaru Cars, SUVs, Crossovers & Hybrids | Subaru of America";
		Assert.assertEquals(actualtitle, expectedtile, "Both the title are matches");

	}

	@Test(groups = "subaru")
	public void linksOnthePage() throws InterruptedException {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The total number of links on the webpages -> " + links.size());

	}

	@Test(groups = "subaru")
	public void loginmethod2() {
		System.out.println(driver.getTitle());
	}

	@Test(groups = "facebook", enabled = false)
	public void clickingonLoginButtonWithoutUsernameandPass() throws Exception {

		driver.findElement(By.xpath("//input[@id='email']/following::button")).click();
		Thread.sleep(3000);
		String actualstring = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		String expectedstring = "The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		Assert.assertEquals(actualstring, expectedstring, "Both are equal");

	}

	@Test(groups = "facebook", enabled = false)
	public void validcredentilals() throws Exception {

		driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.id("pass")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='email']/following::button")).click();
		Thread.sleep(5000);
	}

}