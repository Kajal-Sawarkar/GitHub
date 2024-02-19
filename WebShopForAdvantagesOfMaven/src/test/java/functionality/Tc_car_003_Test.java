package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_car_003_Test {
	@Test

	public void kia() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.kia.com/");
		 System.out.println("User is able to open the url");
		 Thread.sleep(3000);
		 driver.quit();
}}
