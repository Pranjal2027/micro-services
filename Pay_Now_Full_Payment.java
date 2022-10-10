package invoice_testing;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Xuriti.New.elevenApril.HomePage;
import com.Xuriti.New.elevenApril.Invoices_Pay_Now_Payable_Amount;
import com.Xuriti.New.elevenApril.Main_LoginPage;

public class Pay_Now_Full_Payment {

	WebDriver driver;
	@Test(priority=-1)
public void LaunchXuriti() {
		
		HomePage hm = new HomePage(driver);
		driver=hm.lauchBrowser("chrome");
		driver.get(HomePage.WEB_CONTEXT + "auth/login");
		hm.lauchApp();
		System.out.println("App launched successfully");
	}
	@Test(priority=0)
	public void Main_Login() throws InterruptedException {
//		driver = new ChromeDriver();
//		driver.get(HomePage.WEB_CONTEXT + "auth/register");
		//driver.get("https://dev.xuriti.app/#/auth/login");
		//driver.get("https://192.168.0.153/#/auth/register");
		driver.manage().window().maximize();
		Main_LoginPage li=new Main_LoginPage(driver);
		li.EmailPass("varsha.patil@tech-trail.com","Xuriti#10");	
		//		li.EmailPass("kashif.iqbal@tech-trail.com","Kashif123@");		

}
	@Test(priority=1)
	public void Pay_Now_Full_Payment() throws InterruptedException {
	Invoices_Pay_Now_Payable_Amount IB= new Invoices_Pay_Now_Payable_Amount(driver);
	IB.Pay_Now_Full_Amount();
	
   // driver.close();
	
	}
	}


