package system;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_tourist_004_Test {

	@Test
	public void tourmyindia() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tourmyindia.com/");
		Thread.sleep(3000);
		driver.quit();
	}
}
