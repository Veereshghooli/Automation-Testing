package tsngop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;










public class sin {
	
	 design land;
	
	
	@Test(dataProvider="signInData")
	
	public void set(String userName,String password) throws InterruptedException{	
	final String path = "C:\\\\\\\\Users\\\\\\\\veereshkumar.ghooli\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",path);
	WebDriver driver = new ChromeDriver();
	driver.get("https://mobileworld.banyanpro.com/");
	driver.manage().window().maximize();
   land = new design(driver);
   land.sin(userName, password);
 
   
	
	
	}
	
	@DataProvider
	public Object[][] signInData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "vg@gamil.com";
		data[0][1] = "ghooli123";
		
		
		data[1][0]= "vg@";
		data[1][1]= "bhai^&^%$";
		
		data[2][0]= "12@gmai.com";
		data[2][1]= "bro";
		return data;
		
		
	}

}
