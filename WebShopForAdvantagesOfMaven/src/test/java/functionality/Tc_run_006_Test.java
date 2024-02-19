package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc_run_006_Test {
	@Test
	public void run() {
		
		String url =System.getProperty("url");
		System.out.println(url);
		System.out.println("Hello Maven");
		Reporter.log("Hello", true);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.quit();
	}

}
