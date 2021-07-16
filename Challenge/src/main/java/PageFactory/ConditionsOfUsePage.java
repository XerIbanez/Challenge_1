package PageFactory;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConditionsOfUsePage {
    WebDriver driver;
    @FindBy(id="helpsearch")
    WebElement searchTextbox;
    @FindBy(linkText = "Echo Support")
    WebElement echoSupportLink;
    //@FindBy(className = "a-accordion-row a-declarative")
    @FindBy(xpath ="//a[contains(@data-action,'a-accordion')]//descendant::*[contains(text(),'Getting Started')]")
    WebElement gettingStarted;
    @FindBy(xpath ="//a[contains(@data-action,'a-accordion')]//descendant::*[contains(text(),'Wi-Fi and Bluetooth')]")
    WebElement wiFiAndBlueTooth;
    @FindBy(xpath ="//a[contains(@data-action,'a-accordion')]//descendant::*[contains(text(),'Device Software and Hardware')]")
    WebElement deviceSoftwareAndHardware;
    @FindBy(xpath ="//a[contains(@data-action,'a-accordion')]//descendant::*[contains(text(),'Troubleshooting')]")
    WebElement troubleshooting;

    public void setSearchTextbox(String searchCriteria){
        searchTextbox.sendKeys(searchCriteria);
        searchTextbox.sendKeys(Keys.RETURN);
    }

    public void clickOnEchoSupport(){
        echoSupportLink.click();
    }

    public boolean isGettingStartedPresent(){
        return gettingStarted.getText().contains("Getting Started");
    }

    public boolean isWiFiAndBlueToothPresent(){
        return wiFiAndBlueTooth.getText().contains("Wi-Fi and Bluetooth");
    }

    public boolean isDeviceSoftwareAndHardware(){
        return deviceSoftwareAndHardware.getText().contains("Device Software and Hardware");
    }

    public boolean isTroubleshootingPresent(){
        return troubleshooting.getText().contains("Troubleshooting");
    }

    public void supportResultsPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    
}
