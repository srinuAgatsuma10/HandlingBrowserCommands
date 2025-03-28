package flipkartEcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();		
		// 1) GET Command
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		// 2) Get Title Command
		String title = driver.getTitle();
		System.out.println("Title of the Page : " + title);

		// 3) Get Current Url Command
		String url = driver.getCurrentUrl();
		System.out.println("URL of the Page" + url);

		// 4) Get Page Source
		String pageSource = driver.getPageSource();
		System.out.println("Page source : " + pageSource);

		// 5) Get Window Handler
		String windowHandle = driver.getWindowHandle();
		System.out.println("Window Handle : " + windowHandle);

		// 6) Close and Quit Commands
		driver.quit();
//		driver.close();

	}
}
