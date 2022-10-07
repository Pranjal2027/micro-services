package nBFC_test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.Xuriti.admin_panel_main.E_mandate_history;
import com.Xuriti.admin_panel_main.HomePage;
import com.Xuriti.admin_panel_main.NBFC_main;


public class ADD_NBFC_Mapping{
	WebDriver driver;	
	@Test(priority=-1)
	public void LaunchXuriti() {					
		HomePage hm = new HomePage(driver);
		driver=hm.lauchBrowser("chrome");
		hm.lauchApp();
		System.out.println("App launched successfully");
	}
	@Test(priority= 0)
	public void Sign_up() throws InterruptedException {
	//driver = new ChromeDriver();
	//driver.get("http://localhost:4200/#/auth/login");
	//driver.get("https://dev.xuriti.app/#/auth/login");
	HomePage HP = new HomePage(driver);
	HP.lauchApp();
	HP.admin_Login("krishna.kshirsagar@xuriti.com","Xuriti#10");		
	System.out.println("Logged in with valid crenditials");
}	
	@Test(priority=1)
	public void ADD_NBFC() throws InterruptedException {		
		NBFC_main NB = new NBFC_main(driver);	
		NB.NBFC_Buyer_Mapping_ADD("Buyer","Seller");
		//driver.close();
	}
	}
