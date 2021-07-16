package pages;

import org.openqa.selenium.WebElement;

public class Item {
    private WebElement itemPrice;
    private WebElement cart;


    public WebElement getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(WebElement itemPrice) {
        this.itemPrice = itemPrice;
    }

    public WebElement getCart() {
        return cart;
    }

    public void setCart(WebElement cart) {
        this.cart = cart;
    }
}
