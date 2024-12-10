package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Checkout {
WebDriver driver;
@FindBy(xpath="//*[@id=\"ctl00_phBody_BookCart_lvCart_imgPayment\"]")
WebElement Buy;
@FindBy(xpath="//*[@id=\"ctl00_cpBody_txtNewRecipientName\"]")
public
WebElement Name;
@FindBy(xpath="//*[@id=\"ctl00_cpBody_txtNewAddress\"]")
WebElement Address;
@FindBy(xpath="//*[@id=\"ctl00_cpBody_ddlNewState\"]")
WebElement State;
@FindBy(xpath="//*[@id=\"ctl00_cpBody_ddlNewCities\"]")
WebElement City;
@FindBy(xpath="//*[@id=\"ctl00_cpBody_txtNewPincode\"]")
WebElement Pin;
@FindBy(xpath="//*[@id=\"ctl00_cpBody_txtNewMobile\"]")
WebElement Mobile;
@FindBy(xpath="//*[@id=\"ctl00_cpBody_imgSaveNew\"]")
WebElement Continue;
public Checkout(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void purchase() {
	Buy.click();
}
public void formfillout() {
	Name.click();
	Name.sendKeys("Jane");
	Address.sendKeys("Hives villa ");
	State.click();
	Select obj=new Select(State);
	obj.selectByValue("Kerala");
	City.click();
	Select sel=new Select(City);
	sel.selectByValue("Aluva");
	Pin.sendKeys("683670");
	Mobile.sendKeys("9857664537");
	Continue.click();
	
}
}
