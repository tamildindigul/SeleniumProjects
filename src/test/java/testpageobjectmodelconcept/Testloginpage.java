package testpageobjectmodelconcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import homepage.Homepage;
import loginpage.Loginpageclass;
import pageobjectmodel.baseclasspage.Pagebaseclass;

public class Testloginpage extends Pagebaseclass{
	public static Loginpageclass login;
Homepage homepage;
public Testloginpage()
{
	super();
	
}
@BeforeMethod
public void setup()
{
	initialization();
	 login=new Loginpageclass();
	
}
@Test(priority=1)
public void validatetit()
{
String titl=login.validatetile();
Assert.assertEquals(titl,"Guru99 Bank Home Page");	
}
@Test(priority=2)
public void imagecheck()
{
	boolean result=login.imagevalidate();
	Assert.assertTrue(result);
}
@Test(priority=3)
public void loginchecking()
{
//	login.login(prop., pwd)
homepage=login.login(prop.getProperty("username"),prop.getProperty("password"));

}
@AfterMethod
public void testclose()
{
	driver.close();
}
}
