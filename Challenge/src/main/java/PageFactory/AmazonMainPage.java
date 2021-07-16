package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMainPage {
    WebDriver driver;
    @FindBy (id="twotabsearchtextbox")
    WebElement searchTextBox;
    @FindBy (id="nav-search-submit-button")
    WebElement searchButton;
    @FindBy (className = "a-price-whole")
    WebElement item;


    public void mainPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void searchItem(String searchCriteria){
        searchTextBox.sendKeys(searchCriteria);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

    public String getFirstItemPrice(){
        return item.getText();
    }

    public void openItem(){
        item.click();
    }


}
