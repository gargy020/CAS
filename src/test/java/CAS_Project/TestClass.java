package CAS_Project;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
	WebDriver driver;
	DataClass dc;

	@BeforeClass
	void loginSetup() throws InterruptedException, IOException {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://be.cognizant.com/");
		dc = new DataClass(driver);
		System.out.println();
		System.out.println("Current URL: " + driver.getCurrentUrl());
		dc.TakeScreenshot("login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	void testUser() throws InterruptedException, IOException {
		dc = new DataClass(driver);
		dc.clickUser();
		Thread.sleep(1000);
		dc.TakeScreenshot("testUser");
	}

	@Test(priority = 2)
	void testCorporate() throws IOException, InterruptedException {
		dc = new DataClass(driver);
		dc.clickCorporate();
		Thread.sleep(1000);
		dc.TakeScreenshot("corporateButton");
		dc.clickSecurity();
		Thread.sleep(1000);
		dc.TakeScreenshot("clickSecurity");
		dc.clickIT();
		Thread.sleep(1000);
		dc.TakeScreenshot("clickIT");
//		dc.getITDetails();
		dc.appDetails();
		Thread.sleep(1000);
		dc.TakeScreenshot("ITDetails");
	}

	@Test(priority = 3)
	void getAppDetails() throws InterruptedException {
		dc = new DataClass(driver);
//		dc.appDetails();
	}

	@Test(priority = 4)
	void ITScetion() throws InterruptedException, IOException {
		dc = new DataClass(driver);
		dc.scroll();
		Thread.sleep(1000);
		dc.TakeScreenshot("ITSection");
	}

	@Test(priority = 5)
	void checkSections() throws IOException, InterruptedException {
		dc = new DataClass(driver);
		Thread.sleep(1000);
		dc.checkSectionsOfNewsAndAwards();
		dc.ITNews();
		Thread.sleep(1000);
		dc.TakeScreenshot("ITNews");
	}

	@Test(priority = 6)
	void awards() throws InterruptedException, IOException {
		dc = new DataClass(driver);
		dc.award1();
		dc.TakeScreenshot("award1");
		Thread.sleep(1000);
		dc.awardDetails1();
	}

	@Test(priority = 7)
	void awards2() throws InterruptedException, IOException {
		dc = new DataClass(driver);
		dc.award2();
		dc.TakeScreenshot("award2");
		Thread.sleep(1000);
		dc.awardDetails2();

	}

	@Test(priority = 8)
	void awards3() throws InterruptedException, IOException {
		dc = new DataClass(driver);
		dc.award3();
		dc.TakeScreenshot("award3");
		Thread.sleep(1000);
		dc.awardDetails3();

	}

	@AfterClass
	void closeSockets() {
		driver.close();
	}
}
