package tsngop;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import tsngop.design;

public class sup {
	design land;
	@Test(dataProvider = "signUpData"  )
	    public void signUpPage(String fname, String sname, String email,String password,String dob,String phnum,   String sbio) {
		final String path = "C:\\\\Users\\\\veereshkumar.ghooli\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://mobileworld.banyanpro.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    land = new design(driver);
	    land.sup(fname, sname, email, password, dob, phnum, sbio);    
	    }



	@DataProvider
	public Object[][] signUpData() {
	    Object [][] data = new Object [1][7];
	    
	    data [0][0]="Mrvg";
	    data [0][1]="ghooli";
	    data [0][2]="Vg@gmail.com";
	    data [0][3]="Mit123";
	    data [0][4]="12/12/2022";
	    data [0][5]="445566";
	    data[0][6]="Hi";
	    
	    return data;
	    
	}


}
