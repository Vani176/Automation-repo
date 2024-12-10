package pagepkg;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
WebDriver driver;
@FindBy(xpath="//*[@id=\"ctl00_lnkbtnLogout\"]")
WebElement logout;
public Logout(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void signout() {
	logout.click();
}
public void screenshot() throws Exception
{
	
File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(ss, new File("./Screenshot/buttonscreenshot.png"));
}
}
