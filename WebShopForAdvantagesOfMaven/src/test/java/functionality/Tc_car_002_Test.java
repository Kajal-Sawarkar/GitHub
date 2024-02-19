package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc_car_002_Test {
	@Test

	public  void landrover() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.landrover.in/index.html");
		 System.out.println("User is able to open the url");
		 Thread.sleep(3000);
		 driver.quit();
}}
