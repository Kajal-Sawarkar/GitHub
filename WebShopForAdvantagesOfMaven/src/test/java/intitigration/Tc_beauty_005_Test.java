package intitigration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_beauty_005_Test {
	@Test
	public void hokmakeup() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hokmakeup.com/");
		Thread.sleep(3000);
		driver.quit();
}

}
