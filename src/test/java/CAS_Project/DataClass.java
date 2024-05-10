package CAS_Project;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactory;

public class DataClass {
	// Constructor
	public WebDriver driver;

	public DataClass(WebDriver driver) {
		this.driver = driver;
		
	}

	// Locators
	// profile section
	By profile = By.xpath("//div[@id='O365_MainLink_MePhoto']");
	// username loactor
	By username = By.id("mectrl_currentAccount_primary");
	// email locator
	By email = By.id("mectrl_currentAccount_secondary");
	// corporate section
	By corporateButton = By.name("Corporate Functions");
	// security option locator
	By security = By.name("Security and Technology");
	// IT option locator
	By IT = By.name("IT");
	
	// Exploring
	By app1 = By.xpath("(//img[@data-automation-id='HeroImage'])[1]");
	By app2 = By.xpath("(//img[@data-automation-id='HeroImage'])[2]");
	By app3 = By.xpath("(//img[@data-automation-id='HeroImage'])[3]");
	By app4 = By.xpath("(//img[@data-automation-id='HeroImage'])[4]");
	By app5 = By.xpath("(//img[@data-automation-id='HeroImage'])[5]");

	// locators of new URI
	// Locator to scroll page
	By scrollDiv = By.xpath("//div[@data-automation-id='contentScrollRegion']");
	
	// Locator of news section
	By sectionsNews = By.xpath("//span[text()='IT News']");
	
	// Locator of awards section
	By sectionAwards = By.xpath("//h4[@id='it-awards']");
	// Locator of Global apps section
	By globalITApps = By.xpath(
			"//div[@class='a_a_50a7110f h_a_50a7110f CanvasSection CanvasSection-col CanvasSection-sm12 CanvasSection--read CanvasSection-xl12 i_a_50a7110f'][1]");
	// Locator of news div
//	By news = By.xpath("//div[@class='a_a_91bed31b ms-NewsItem g_a_91bed31b e_a_91bed31b hasImage l_a_91bed31b']");
	// Locator of news headers
	By newsHeader = By.xpath("//a[@data-automation-id='newsItemTitle']");
	// page 3
	// Locator of award1 div
	By award1 = By.xpath("(//div[@data-automation-id='listNewsLayout']//a[@role='presentation'])[1]");
	// Locator of first award header
	By awardDetailsHeader = By.xpath("//div[@data-automation-id='TitleTextId']");
	// Locator of first award details
	By awardDetails1 = By.xpath("(//span[@class='fontSizeMediumPlus'])[1]");
	// Locator of award2 div
	By award2 = By.xpath("(//div[@data-automation-id='listNewsLayout']//a[@role='presentation'])[2]");
	// Locator of second award header
//	By awardDetailsHeader2 = By.xpath("//div[@class='fs_ap_9f38462c']");
	// Locator of second award details
	By awardDetails2 = By.xpath("(//span[@class='fontSizeMediumPlus'])[2]");
	// Locator of third award div
	By award3 = By.xpath("(//div[@data-automation-id='listNewsLayout']//a[@role='presentation'])[3]");
	// Locator of third award header
//	By awardDetailsHeader3 = By.xpath("//div[@class='fs_ap_9f38462c']");
	// Locator of third award details
	By awardDetails3 = By.xpath("(//span[@class='fontSizeMediumPlus'])[3]");

	// Action methods
	// action method for clicking on user section
	public void clickUser() throws InterruptedException {
		Thread.sleep(5000);
		WebElement button = driver.findElement(profile);
		Actions actions = new Actions(driver);
//				WebDriverWait wait=(WebDriverWait)driver;
//				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@class='ms-Icon--Help RGSb/1c4ex9CM0as0oaLQA==']"))));
//				Thread.sleep(5000);
		actions.moveToElement(button).click().build().perform();
		System.out.println(driver.findElement(username).getText());
		System.out.println(driver.findElement(email).getText());
	}

	// action method for clicking on corporate section on header
	public void clickCorporate() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(corporateButton).click();
//				System.out.println("inside clickCorporate");
	}

	// action method for select security option
	public void clickSecurity() {
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(security)).build().perform();
		;
	}

	// action method to click on IT option
	public void clickIT() {
				driver.findElement(IT).click();
//		driver.navigate().to("https://cognizantonline.sharepoint.com/sites/CorporateFunctions/SitePages/IT.aspx");
	}

	// action method to print IT details
//	public void getITDetails() {
//		String result = driver.findElement(globalITApps).getText();
//		System.out.println(result);
//	}

	public void appDetails() throws InterruptedException {
//				WebElement divEl=driver.findElement(scrollDiv);
//				JavascriptExecutor js=(JavascriptExecutor)driver;
//				js.executeScript("arguments[0].scrollTop=400;",divEl);
			driver.findElement(app1).click();
		Thread.sleep(2000);
		System.out.println("URL 1 : " + driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().back();
//				divEl=driver.findElement(scrollDiv);
//				js=(JavascriptExecutor)driver;
//				js.executeScript("arguments[0].scrollTop=400;",divEl);
		Thread.sleep(3000);
		driver.findElement(app2).click();
		System.out.println("URL 2 : " + driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().back();
//				divEl=driver.findElement(scrollDiv);
//				js=(JavascriptExecutor)driver;
//				js.executeScript("arguments[0].scrollTop=400;",divEl);
		Thread.sleep(3000);
		driver.findElement(app3).click();
		System.out.println("URL 3 : " + driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().back();
//				divEl=driver.findElement(scrollDiv);
//				js=(JavascriptExecutor)driver;
//				js.executeScript("arguments[0].scrollTop=400;",divEl);
		Thread.sleep(3000);
		driver.findElement(app4).click();
		System.out.println("URL 4 : " + driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().back();
//				divEl=driver.findElement(scrollDiv);
//				js=(JavascriptExecutor)driver;
//				js.executeScript("arguments[0].scrollTop=400;",divEl);
		Thread.sleep(3000);
		driver.findElement(app5).click();
		System.out.println("URL 5 : " + driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.navigate().back();
	}

//			public void dumy() {
//				System.out.println("URL 1 : "+driver.getCurrentUrl());
//				driver.navigate().back();
//			}
	// action method to scroll down in page
	public void scroll() throws InterruptedException {
		WebElement divEl = driver.findElement(scrollDiv);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop=700;", divEl);
		Thread.sleep(3000);
	}

	// action method for checking sections
	public void checkSectionsOfNewsAndAwards() {
		Boolean check1 = true;
		Boolean check2 = true;
		check1 = driver.findElement(sectionsNews).isDisplayed();
		check2 = driver.findElement(sectionAwards).isDisplayed();
		if (check1) {
			System.out.println("News Section is present");
		}
		if (check2) {
			System.out.println("Awards section is present");
		}
	}

	// action method for getting NEWS
	public void ITNews() {
		List<WebElement> newsCounter = driver.findElements(newsHeader);
		System.out.println(newsCounter.size());
		for (WebElement nc : newsCounter) {
			String header = nc.getText();
			System.out.println(header);
			String tooltip = nc.getAttribute("title");
			if (header.equals(tooltip)) {
				System.out.println("Header and Tooltip is matched");
			} else {
				System.out.println("Header and Tooltip not matched");
			}
			System.out.println("<================================================>");
		}
	}

	// action method for getting award1 details
	public void award1() throws InterruptedException {
		WebElement divEl = driver.findElement(scrollDiv);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop=1800;", divEl);
		Thread.sleep(3000);
		driver.findElement(award1).click();
		Thread.sleep(3000);
	}
	public void awardDetails1() throws InterruptedException {

		String outputheader1 = driver.findElement(awardDetailsHeader).getText();
		System.out.println(outputheader1);
		System.out.println(driver.findElement(awardDetails1).getText());
		System.out.println(driver.findElement(awardDetails3).getText());
		System.out.println("-----------------------------------");
//		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	// action method for getting award2 details
	public void award2() throws InterruptedException {
		WebElement divEl = driver.findElement(scrollDiv);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop=2000;", divEl);
		Thread.sleep(3000);
		driver.findElement(award2).click();
		Thread.sleep(3000);
	}
	public void awardDetails2() throws InterruptedException {

		String outputheader2 = driver.findElement(awardDetailsHeader).getText();
		System.out.println(outputheader2);
		System.out.println(driver.findElement(awardDetails1).getText());
		System.out.println("-----------------------------------");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
	}

	// action method for getting award3 details
	public void award3() throws InterruptedException {
		WebElement divEl = driver.findElement(scrollDiv);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollTop=2300;", divEl);
		Thread.sleep(3000);
		driver.findElement(award3).click();
		Thread.sleep(3000);
	}
	public void awardDetails3() throws InterruptedException {

		String outputheader3 = driver.findElement(awardDetailsHeader).getText();
		System.out.println(outputheader3);
		System.out.println(driver.findElement(awardDetails1).getText());
		System.out.println(driver.findElement(awardDetails2).getText());

		System.out.println("--------------------------------------------");
		System.out.println("------------------THE END------------------");
		System.out.println("--------------------------------------------");
	}

	public void TakeScreenshot(String photo) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sc,
				new File("C:\\Users\\2317747\\eclipse-workspace\\Sdet_Projects 1\\Screenshots//" + photo + ".png"));
	}

}
