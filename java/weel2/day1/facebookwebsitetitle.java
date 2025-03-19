package weel2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookwebsitetitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver1 = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
driver.findElement(By.id("pass")).sendKeys("Tuna@321");
driver.findElement(By.name("login")).click();
String title=driver.getTitle();
		System.out.println(title);
	}

}
