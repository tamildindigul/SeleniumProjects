package pageobjectmodel.baseclasspage;

import java.io.File;
//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilpake.Pageutilclass;

public class Pagebaseclass {
	public static WebDriver driver;
	public static Properties prop;
	public Pagebaseclass()    {
	try
{ 
prop=new Properties();
FileInputStream file=new FileInputStream("./src/main/java/configproperties/config.properties");	
prop.load(file);
}

catch(FileNotFoundException e)

{
e.printStackTrace();	
}
catch(IOException e)
	{
	e.printStackTrace();
	}
	}
	public static void initialization()
	{
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./BrowserDriver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./BrowserDriver/chromedriver.exe");
			driver=new FirefoxDriver();
		}
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(Pageutilclass.PageLoadTimeout, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(Pageutilclass.ImplicitlyWaitTimeout,TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));
	}
	
}

