package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By Email = By.id("mat-input-0");

    By Password = By.id("mat-input-1");
    By LoginBtn = By.xpath("//button[contains(text(),'Sign In')]");

    By WelcomeDasboardText = By.xpath("//p[contains(text(),'Welcome To Dashboard')]");
    
    By Account = By.xpath("//img[@src='assets/images/user.svg']");
    
    By LogoutBtn = By.xpath("//li[contains(text(),'Logout')]");
    
    By SigninText = By.xpath("//h3[contains(text(),'Sign In')]");

    public void Login(String username, String password)
    {
        wait.until(ExpectedConditions.presenceOfElementLocated(Email));
        setTextElementText(Email,username);
        setTextElementText(Password,password);
        clickButton(LoginBtn);
    }

    public String getWelcomeDashboardTxt() {
        wait.until(ExpectedConditions.presenceOfElementLocated(WelcomeDasboardText));
        return getText(WelcomeDasboardText);
    }
    
    public void logout() {
    	clickButton(Account);
    	clickButton(LogoutBtn);
    }
    
    public String getSigninTxt() {
        wait.until(ExpectedConditions.presenceOfElementLocated(SigninText));
        return getText(SigninText);
    }

  
}
