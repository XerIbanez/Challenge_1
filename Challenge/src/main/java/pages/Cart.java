package pages;

import org.openqa.selenium.WebElement;

public class Cart {
    private WebElement itemPrice;
    private WebElement deleteItem;


    public WebElement getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(WebElement itemPrice) {
        this.itemPrice = itemPrice;
    }

    public WebElement getDeleteItem() {
        return deleteItem;
    }

    public void setDeleteItem(WebElement deleteItem) {
        this.deleteItem = deleteItem;
    }



}
