package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
    WebDriver driver;
    @FindBy (id="ap_customer_name")
    WebElement nameField;
    @FindBy(id="ap_email")
    WebElement emailField;
    //Conditions of Use
    @FindBy(linkText = "Conditions of Use")
    WebElement conditionsOfUseLink;

    public void setNameField(String value){
        nameField.sendKeys(value);
    }

    public void setEmailField(String firstName,String lastName){
        emailField.sendKeys(firstName+"."+lastName+"@fake.com");

    }
    public void clickConditionsOfUseLink(){
        conditionsOfUseLink.click();
    }

    public void creationPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
