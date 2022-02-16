package pom;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy (xpath = "(//input[@type='text'])[1]")
	
	private WebElement userNamE;
	
	
	

	@FindBy (xpath = "(//input[@type='password'])[1]")
	
	private WebElement password;
	
	

	@FindBy (xpath = "//a[@id='loginButton']")
	
	private WebElement login;
	
	

	@FindBy (xpath = "//input[@type='checkbox']")
	
	private WebElement keepMeLoginCheckbox;
	
	
	public void sendUserName()
	{
		userNamE.sendKeys("Admin");
		
	}
	
	
	public void sendPassword()
	{
		password.sendKeys("manager");
	}
	
	
	public void selectMeLogin()
	
	{
		keepMeLoginCheckbox.click();
	}
	
	public void clickOnLogin()
	{
		login.click();
	}
	
	
	
	
	
	public LoginPage(WebDriver driver123) {
		
    PageFactory.initElements(driver123, this);
	  
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
