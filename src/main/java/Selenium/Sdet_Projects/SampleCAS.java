package Selenium.Sdet_Projects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleCAS {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("https://be.cognizant.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='O365_MainLink_MePhoto']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("mectrl_currentAccount_primary")).getText());	
		System.out.println(driver.findElement(By.id("mectrl_currentAccount_secondary")).getText());
		driver.findElement(By.xpath("//span[contains(text(),'Corporate Functions')]")).click();
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Security and Technology')]"))).build().perform();
		driver.findElement(By.xpath("//span[text()='IT']")).click();
		Thread.sleep(2000);
//		Exploring and validating other apps in Global IT Home Page
//		driver.findElement(By.xpath("//img[@data-automation-id='HeroImage']")).click();
		
		
		List<WebElement> otherApps = driver.findElements(By.xpath("//div[@data-automation-id='Tiles']"));
		
		for(WebElement ie:otherApps)
		{
			if(ie.getText().toString().equals("Learn more "))
			{
				continue;
			}
			else 
			{
				System.out.println(ie.getText());
			}
			
		}
		driver.close();		
	}
}
