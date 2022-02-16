import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.ApplicationHeader;
import pom.LoginPage;

public class Testclass {
	
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\chrome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://localhost/login.do");
		
		driver.manage().window().maximize();
		
		LoginPage loginPage = new LoginPage(driver);
	
		loginPage.sendUserName();
		
		loginPage.sendPassword();
		
		loginPage.selectMeLogin();
		
		loginPage.clickOnLogin();
		
		
		
		ApplicationHeader applicationHeader = new ApplicationHeader(driver);
		
		applicationHeader.task();
		
		applicationHeader.reports();
		
		applicationHeader.userList();
		
		applicationHeader.workSchedule();
		
		applicationHeader.logout();
		
		
		
		
	}
	

	  }
	

