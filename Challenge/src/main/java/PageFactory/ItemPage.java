package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemPage {
    WebDriver driver;
    @FindBy (id="priceblock_ourprice")
    WebElement itemPrice;
    @FindBy(id="add-to-cart-button")
    WebElement addToCartButton;

    public String getPrice(){
        return itemPrice.getText();
    }

    public void clickAddToCartButton(){
        addToCartButton.click();
    }

    public boolean comparesPrices(String firstValue,String secondValue){
        return secondValue.contains(firstValue);
    }

    public void currentItemPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
}
