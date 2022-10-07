package nBFC_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Xuriti.admin_panel_main.HomePage;
import com.Xuriti.admin_panel_main.NBFC_main;

public class ADD_NBFC
{
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
		public void ADD_NEW_NBFC() throws InterruptedException {		
			NBFC_main NB = new NBFC_main(driver);	
			NB.add_NBFC("Varsha","Pranjal.gawade@tech-trail.com","8080630440","Pune","Mulshi","Maharashtra","402204","10","SBI","Bavdhan","Varsha","161210510007125","SBIN0007125","Varsha","Patil","Pranjal.gawade@tech-trail.com", "8080630830");
			//driver.close();
		}

}
}
