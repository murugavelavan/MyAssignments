package weel2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createlead {

	public static void main(String[] args)  {
		
		// TODO Auto-generated method stub
				ChromeDriver driver = new ChromeDriver();
				//EdgeDriver driver1 = new EdgeDriver();
				driver.get("http://leaftaps.com/opentaps/");
				driver.manage().window().maximize();
				
	WebElement user = driver.findElement (By.id("username"));
		user.sendKeys("demosalesmanager");
		
		WebElement pwd = driver.findElement (By.id("password"));
		pwd.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		WebElement CRM = driver.findElement(By.partialLinkText("CRM/SFA"));
		CRM.click();
		WebElement lead = driver.findElement(By.partialLinkText("Create Lead"));
		lead.click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		companyname.sendKeys("testleaf");
		WebElement s1= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel1= new Select(s1);
		sel1.selectByIndex(4);
		WebElement mar=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sel2= new Select(mar);
		sel2.selectByVisibleText("Road and Track");
		WebElement own=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sel3= new Select(own);
		sel3.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
		String title= driver.getTitle();
		System.out.println(title);
	
		
		
	}

}
