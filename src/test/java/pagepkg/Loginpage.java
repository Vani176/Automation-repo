package pagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
WebDriver driver;
@FindBy(xpath="//*[@id=\"ctl00_lblUser\"]")
public
WebElement Myaccount;
@FindBy(xpath="//*[@id=\"ctl00_divLogin\"]/a[1]")
WebElement Login;
@FindBy(xpath="//*[@id=\"ctl00_phBody_SignIn_txtEmail\"]")
WebElement Email;
@FindBy(xpath="//*[@id=\"ctl00_phBody_SignIn_txtPassword\"]")
WebElement Password;
@FindBy(xpath="//*[@id=\"ctl00_phBody_SignIn_btnLogin\"]")
WebElement Loginbutton;
public Loginpage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
public void setupvalues() {
	Actions act=new Actions(driver);
	act.moveToElement(Myaccount).perform();
	Login.click();
}
public void values(String username,String password) {
	Email.sendKeys(username);
	Password.sendKeys(password);
 Loginbutton.click();
 }

}

