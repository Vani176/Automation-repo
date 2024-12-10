package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Homepage {
WebDriver driver;
@FindBy(xpath="//*[@id=\"ctl00_lihome\"]/a")
public
WebElement books;
@FindBy(xpath="//*[@id=\"aspnetForm\"]/div[7]/ul/li[1]/a")
WebElement art;
@FindBy(xpath="//*[@id=\"inputbar\"]")
WebElement Searchbar;
@FindBy(xpath="//*[@id=\"listSearchResult\"]/div[1]/div[2]/a/img")
WebElement sapiens;
@FindBy(xpath="//*[@id=\"btnTopSearch\"]")
WebElement search;
public Homepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void title() {
	String exp="Online BookStore India, Buy Books Online, Buy Book Online India - Bookswagon.com";
	String act=driver.getTitle();
	System.out.println(act);
	Assert.assertEquals(exp, act);
}
public void hometest() {
	books.click();
	art.click();
}
public void search()
{
	Searchbar.sendKeys("sapiens");
	search.click();
	sapiens.click();
	
}
}