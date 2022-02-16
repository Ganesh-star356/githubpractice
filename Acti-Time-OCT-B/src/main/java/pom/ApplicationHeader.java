package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	
	
	@FindBy (xpath = "(//img[@height='93'])[2]")
	
	private WebElement enterTimeTrack;
	
	
	

	
	@FindBy (xpath = "((//td[@class='navItem relative'])[2]")
	
	private WebElement task;
	
	

	
	@FindBy (xpath = "(//img[@width='84'])[3]")
	
	private WebElement reports;
	
	

	
	@FindBy (xpath = "(//img[@height='93'])[8]")
	
	private WebElement userList;
	
	
	
	


	
	@FindBy (xpath = "(//img[@height='93'])[10]")
	
	private WebElement workSchedule;
	
	
	
	

	@FindBy (xpath = "//a[@id='logoutLink']")
	
	private WebElement logout;
	
	
	
	public ApplicationHeader(WebDriver driver123)
	{	
		
		PageFactory.initElements( driver123,this);
		
	}
	
      public void task()
      {
    	  task.click();
      }
	
	

      public void reports()
      {
    	  reports.click();
      }
	

      public void userList()
      {
    	  userList.click();
      }
      

      public void workSchedule()
      {
    	  workSchedule.click();
      }
      
      
      public void logout()
      {
    	  logout.click();
      }
      
      
//
//	public void nextPage()
//	
//	{   	enterTimeTrack.click();
//		 task.click();
//		 reports.click();
//		 userList.click();
//		 workSchedule.click();
//		 logout.click();
//		}
//	
//	
//	

	
	
	
	
	
	
	
	

}
