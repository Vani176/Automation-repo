package testpkg;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Cart;
import pagepkg.Checkout;
import pagepkg.Homepage;
import pagepkg.Loginpage;
import pagepkg.Logout;
import utilitypkg.Excel_utils;
import pagepkg.Cart;

public class Logintest extends Baseclass {
	@Test
	public void testing() throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		Loginpage ob =new Loginpage(driver);
		String xl="C:\\Users\\PC\\Desktop\\booklogin.xlsx";
		String sheet="sheet1";
				int rowcount=Excel_utils.getRowCount(xl,sheet);
				for(int i=1;i<=rowcount;i++)
				{
					String username=Excel_utils.getCellValue(xl, sheet, i, 0);
					System.out.println("username "+username);
					String password=Excel_utils.getCellValue(xl, sheet, i, 1);
					System.out.println("password "+password);
WebElement myaccountelement =wait.until(ExpectedConditions.visibilityOf(ob.Myaccount));
					ob.setupvalues();
					ob.values(username, password);
					}
		Homepage ob1=new Homepage(driver);
		ob1.title();
		WebElement boooks=wait.until(ExpectedConditions.visibilityOf(ob1.books));
		ob1.hometest();
		ob1.search();
		Cart ob2=new Cart(driver);
		ob2.product();
		ob2.cartpage();
		Checkout ob3=new Checkout(driver);
		ob3.purchase();
		WebElement web=wait.until(ExpectedConditions.visibilityOf(ob3.Name));
		ob3.formfillout();
		Logout ob4=new Logout(driver);
		ob4.signout();
		ob4.screenshot();
		}
	
    
    
    	
    	
    	
    
        

}
