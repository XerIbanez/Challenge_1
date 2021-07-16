package pages;

import org.openqa.selenium.WebElement;

public class Search {
    private WebElement searchTextBox;

    public WebElement getSearchTextBox() {
        return searchTextBox;
    }

    public void setSearchTextBox(WebElement searchTextBox) {
        this.searchTextBox = searchTextBox;
    }
}
