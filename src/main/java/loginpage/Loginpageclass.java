package loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import homepage.Homepage;
import pageobjectmodel.baseclasspage.Pagebaseclass;

public class Loginpageclass extends Pagebaseclass{


//2 things want todo define pagefactory and ininizalization
	@FindBy(name="uid")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
    @FindBy(name="btnLogin")
    WebElement loginbutton;
    @FindBy(name="btnReset")
    WebElement Reset;
    @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[1]/a/img")
    WebElement image;
    public Loginpageclass() 
    {
    	PageFactory.initElements(driver, this);
    }
    public String validatetile()
    {
    	System.out.println(driver.getTitle());
    	return driver.getTitle();
    }
 public boolean imagevalidate()
 {
	return image.isDisplayed();
 }
 public Homepage login(String user,String pwd)
 {
	 username.sendKeys(user);
	 password.sendKeys(pwd);
//	 if(username.equals("mngr237491")&&)
	 loginbutton.click();
	 
	// Reset.click();
return new Homepage();	 
 }
}
