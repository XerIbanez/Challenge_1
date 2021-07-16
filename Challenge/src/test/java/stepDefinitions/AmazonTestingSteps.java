package stepDefinitions;

import PageFactory.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertTrue;

public class AmazonTestingSteps {

    WebDriver driver;
    WebDriverWait wait;
    AmazonMainPage searchSmartPhone= new AmazonMainPage();;
    ItemPage itemDetails =new ItemPage();
    CartPage singleItemCartPage = new CartPage();
    SignInPage signInPage=new SignInPage();
    CreateAccountPage createAccountPage=new CreateAccountPage();
    ConditionsOfUsePage conditionsOfUsePage=new ConditionsOfUsePage();

    String itemToSearch = "Samsung Galaxy Note 20";
    String itemPriceInFirstResult;
    String firstname="Tiger";
    String lastname="Nixon";
    String supportSearchCriteria="Echo Support";


    public void SetDriver(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,5);
    }

    @Given("a user goes to Amazon")
    public void a_user_goes_to_Amazon() {
        // Write code here that turns the phrase above into concrete actions
        SetDriver();
        searchSmartPhone.mainPage(this.driver);
        //throw new cucumber.api.PendingException();
    }

    //@Given("searches for a Samsung Galaxy Note {int}")
    @Given("a User searches for a Samsung Galaxy Note")
    public void searches_for_a_Samsung_Galaxy_Note() {
        // Write code here that turns the phrase above into concrete actions
        searchSmartPhone.searchItem(itemToSearch);
        searchSmartPhone.clickSearchButton();
        //throw new cucumber.api.PendingException();
    }

    @When("results are displayed, user stores the first item's price")
    public void results_are_displayed_user_stores_the_first_item_s_price() {
        // Write code here that turns the phrase above into concrete actions
        itemPriceInFirstResult=searchSmartPhone.getFirstItemPrice();
        //throw new cucumber.api.PendingException();
    }

    @Then("opens the first result and stores the price displayed")
    public void opens_the_first_result_and_stores_the_price_displayed() {
        // Write code here that turns the phrase above into concrete actions
        searchSmartPhone.openItem();
        itemDetails.currentItemPage(this.driver);
        assertTrue(itemDetails.comparesPrices(itemPriceInFirstResult,itemDetails.getPrice()));
        //throw new cucumber.api.PendingException();
    }

    @Then("adds item to cart")
    public void adds_item_to_cart() {
        // Write code here that turns the phrase above into concrete actions
        itemDetails.clickAddToCartButton();
        //throw new cucumber.api.PendingException();
    }

    @Then("goes to Cart and verifies the price of the phone")
    public void goes_to_Cart_and_verifies_the_price_of_the_phone() {
        // Write code here that turns the phrase above into concrete actions
        singleItemCartPage.cartPage(this.driver);
        singleItemCartPage.clickCartButton();
        assertTrue(singleItemCartPage.comparesPrices(itemPriceInFirstResult,singleItemCartPage.getItemPrice()));
    }

    @Then("Deletes Item")
    public void deletes_Item() {
        // Write code here that turns the phrase above into concrete actions
        singleItemCartPage.clearCart();
        //assertTrue(singleItemCartPage.isCartEmpty());
    }

    @Given("goes to Sign in page")
    public void goes_to_Sign_in_page() {
        // Write code here that turns the phrase above into concrete actions
        signInPage.signInPage(this.driver);
        signInPage.clickSignInButton();
        signInPage.clickCreateAccountButton();
        //throw new cucumber.api.PendingException();
    }

    @Given("fills form with Customer information")
    public void fills_form_with_Customer_information() {
        // Write code here that turns the phrase above into concrete actions
        createAccountPage.creationPage(this.driver);
        createAccountPage.setNameField(firstname+lastname);
        createAccountPage.setEmailField(firstname,lastname);
        //throw new cucumber.api.PendingException();
    }

    /*@When("User clicks on Create Customer Account")
    public void user_clicks_on_Create_Customer_Account() {
        // Write code here that turns the phrase above into concrete actions

        //throw new cucumber.api.PendingException();
    }*/

    @When("clicks on Conditions of Use")
    public void clicks_on_Conditions_of_Use() {
        // Write code here that turns the phrase above into concrete actions
        createAccountPage.clickConditionsOfUseLink();
        conditionsOfUsePage.supportResultsPage(this.driver);
        //throw new cucumber.api.PendingException();
    }

    @Then("Searches Echo support")
    public void searches_Echo_support() {
        // Write code here that turns the phrase above into concrete actions
        conditionsOfUsePage.setSearchTextbox(supportSearchCriteria);
        conditionsOfUsePage.clickOnEchoSupport();
        //throw new cucumber.api.PendingException();
    }

    @Then("opens Echos support and verifies elements")
    public void opens_Echos_support_and_verifies_elements() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(conditionsOfUsePage.isGettingStartedPresent());
        assertTrue(conditionsOfUsePage.isWiFiAndBlueToothPresent());
        assertTrue(conditionsOfUsePage.isDeviceSoftwareAndHardware());
        assertTrue(conditionsOfUsePage.isTroubleshootingPresent());
        //throw new cucumber.api.PendingException();
    }

}
