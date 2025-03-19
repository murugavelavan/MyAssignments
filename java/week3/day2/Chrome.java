package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome extends Broswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chrome d = new Chrome();
		d.openurl();
		d.closeBrowser();
		d.navigateBack();
		d.openIncognito();
        d.clearCache();
	}
	public void openIncognito() {
		System.out.println("open the incognito ");
	}
	public void clearCache() {
		System.out.println("clear cache ");
	}

}
