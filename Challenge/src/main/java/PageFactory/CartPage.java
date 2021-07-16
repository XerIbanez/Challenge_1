package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;
    @FindBy(id="nav-cart-count-container")
    WebElement cartButton;
    @FindBy(id="sc-subtotal-amount-activecart")
    WebElement itemPrice;
    @FindBy(xpath = "//input[@value='Delete']")
    WebElement deleteLink;
    /*@FindBy(xpath = "//*[text()='Your Amazon Cart is empty']")
    WebElement cartEmptyMessage;*/

    public void clickCartButton(){
        cartButton.click();
    }

    public String getItemPrice(){
        return itemPrice.getText();
    }

    public void clearCart(){
        deleteLink.click();
    }

    public boolean comparesPrices(String firstValue,String secondValue){
        return secondValue.contains(firstValue);
    }

    /*public boolean isCartEmpty(){
        return cartEmptyMessage.getText().contains("Your Amazon Cart is empty");
    }*/

    public void cartPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
