package weel2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createaccountassignment {

	public static void main(String[] args) {
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
WebElement lead = driver.findElement(By.partialLinkText("Create Account"));
lead.click();
WebElement Accountname = driver.findElement(By.xpath("//input[@id='accountName']"));
Accountname.sendKeys("Selenium Automation Tester");
WebElement noofempolyee = driver.findElement(By.id("numberEmployees"));
noofempolyee.sendKeys("Selenium Automation Tester");
WebElement Sitename = driver.findElement(By.xpath("//input[@id='officeSiteName']"));
Sitename.sendKeys("LeafTaps");
WebElement createaccount = driver.findElement(By.xpath("//input[@class='smallSubmit']"));
createaccount.click();
String title = driver.getTitle();
System.out.println(title);


	}

}
