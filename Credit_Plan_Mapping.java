package manage_companies;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Xuriti.admin_panel_main.HomePage;
import com.Xuriti.admin_panel_main.Manage_Companies_Edit;

public class Credit_Plan_Mapping {
	WebDriver driver;	
	@Test(priority=-1)
	public void LaunchXuriti() {					
		HomePage hm = new HomePage(driver);
		driver=hm.lauchBrowser("chrome");
		hm.lauchApp();
		System.out.println("App launched successfully");
	}
	@Test(priority=0)
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
	public void Mapping()throws InterruptedException{
		Manage_Companies_Edit MC = new Manage_Companies_Edit(driver);
		MC.Credit_Mapping ("Varsha","70","50","6","70","4","Buyer");
		//driver.close();
	}
}
