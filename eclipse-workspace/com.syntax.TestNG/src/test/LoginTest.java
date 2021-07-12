package test;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.CommonMethods;
import com.utils.ConfigsReader;

/*TestNG Class03

US 12456 As admin user i should be able to login to HRMS
US 12457 As an ESS user I should be able to login to HRMS
US 12367 As an Invalid use is should see error message 

    Acceptance criteries:

1- When user enters valid username and invalid password
   "Invalid credentials" error message should be displayed

2-When user enters valid username and empty password 
   "Password cannot be empty" error message should displayed

3-When user enters empty username and valid password 
   "Username cannot be empty" error message should be displayed  */ 

public class LoginTest extends CommonMethods {
	
	
	

	
	
	@Test
	public void validAdminLogin() {
	    
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		
		//DashBoardPageElements db= new DashBoardPageElements();  ======> Cause  dashboard referring 
		String excpected="Welcome Admin";
		String actualUser= dashboard.welcome.getText();
		Assert.assertEquals(actualUser, excpected,"Admin is NOT logged in ");
		Assert.assertTrue(actualUser.contains(ConfigsReader.getProperty("username")));
		}
	
	
	
	@Test
	public void invalidPasswordLogin() {
		//LoginPageElements login=new LoginPageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "marwati");
		click(login.loginBtn);
		
		String expected="Csrf token validation failed";
		Assert.assertEquals(login.errorMsg.getText(), expected,"error message text is not matched");
		
	}
	
	
	
	@Test
	public void emptyUserName() {
		
	
		//sendText(login.username,"");
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		
		String expected="Username cannot be empty";
		Assert.assertEquals(login.errorMsg.getText(), expected,"Error message text is not matched");
		}
	

}
