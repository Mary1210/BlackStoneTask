package Tests;

import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase{
    LoginPage login;

    @BeforeClass
    public void LoginPageBeforeClass() {
        login = new LoginPage(driver);
    }

    @Test
    public void UserLogin()
    {
        login.Login("store@admin.com","P@ssw0rd");
        Assert.assertEquals("Welcome To Dashboard", login.getWelcomeDashboardTxt());
        System.out.println(driver.getTitle());
        login.logout();
        Assert.assertEquals("Sign In", login.getSigninTxt());
        
    }
}
