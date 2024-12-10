package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Cart {
WebDriver driver;
@FindBy(xpath="//*[@id=\"ctl00_phBody_ProductDetail_CartBoxWeb_ddlQty\"]")
WebElement dropdown;
@FindBy(xpath="//*[@id=\"btnAddtocart\"]")
WebElement Addcart;
@FindBy(xpath="//*[@id=\"ctl00_lblTotalCartItems\"]")
WebElement Cartbutton;
public Cart(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public  void product() {
	Select obj=new Select(dropdown);
	obj.selectByIndex(2);
}
public void cartpage() {
	Addcart.click();
	Cartbutton.click();
}
}
