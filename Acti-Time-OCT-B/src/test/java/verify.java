import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom.ApplicationHeader;
import pom.LoginPage;

public class verify {
	WebDriver driver ;
	

		ApplicationHeader applicationHeader ;
		
	@BeforeClass 
	
	
	
	public void launchBrowser ()
	{

		System.setProperty("webdriver.chrome.driver", "E:\\chrome driver\\chromedriver.exe");
		
	    driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
      @BeforeMethod
      public void logintoApplication ()
      
      {
    	  
    		driver.get("http://localhost/login.do");
    		
    		driver.manage().window().maximize();
    		
    		LoginPage loginPage = new LoginPage(driver);
    	
    		loginPage.sendUserName();
    		
    		loginPage.sendPassword();
    		
    		loginPage.selectMeLogin();
    		
    		loginPage.clickOnLogin();
    	
    	  
      }
      
      
    @Test
    public void toVerifyTheTaskbutton ()
    
    {
    	System.out.println("to verify the test class ");
    	

		
		 applicationHeader = new ApplicationHeader(driver);
		
		applicationHeader.task();
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		if(url.equals("http://localhost/tasks/otasklist.do"))
		{
		System.out.println("pass");
		}
		else
		{
			System.out.println("Fail");
		}
		

		String titel = driver.getTitle();
		
    	if(titel.equals("actiTIME - Open Tasks"))
    	{
    		System.out.println("pass");
    	}
    	
    	else
    	{
    		System.out.println("fail");
    	}
    }

     @AfterMethod
        
     public void logoutFromApplication()
     {
		applicationHeader.logout();
		
    }

     @AfterClass
     
     public void closetheTabs()
     {
    	 driver.quit();
     }
   
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
