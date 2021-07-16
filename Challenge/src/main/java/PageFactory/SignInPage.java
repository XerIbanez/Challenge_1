package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    WebDriver driver;
    @FindBy (id="nav-link-accountList-nav-line-1")
    WebElement signInButton;
    @FindBy (id="createAccountSubmit")
    WebElement createAccountButton;

    public void clickSignInButton(){
        signInButton.click();
    }

    public void clickCreateAccountButton(){
        createAccountButton.click();
    }

    public void signInPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


}
