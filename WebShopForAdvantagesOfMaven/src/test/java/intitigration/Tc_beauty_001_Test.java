package intitigration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_beauty_001_Test {
	@Test
	public void lakme() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://lakme.com/");
		Thread.sleep(3000);
		driver.quit();
	}

}
