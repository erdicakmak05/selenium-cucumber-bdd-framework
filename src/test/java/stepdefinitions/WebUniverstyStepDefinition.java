package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebUniverstyPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebUniverstyStepDefinition {
    WebUniverstyPage webUniverstyPage = new WebUniverstyPage();

    @Given("scrolls down to Login Portal")
    public void scrolls_down_to_login_portal() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();

    }
    @Given("clicks on Login Portal")
    public void clicks_on_login_portal() {
        webUniverstyPage.webUniversityLoginMainButton.click();

    }
    @Then("switches to the other opened window")
    public void switches_to_the_other_opened_window() {
        ReusableMethods.switchToWindow("WebDriver | Login Portal");
    }
    @Then("enters {string} and {string} into the fields")
    public void enters_and_into_the_fields(String username, String password) {
        webUniverstyPage.webUniversityUserNameTextbox.sendKeys(username);
        webUniverstyPage.webUniversityPasswordTextbox.sendKeys(password);
    }
    @Then("clicks the login button on the page")
    public void clicks_the_login_button_on_the_page() {
        webUniverstyPage.WebUniversityLoginButton.click();
    }
    @Then("verifies that the popup text is validation failed")
    public void verifies_that_the_popup_text_is_validation_failed() {
        System.out.println(Driver.getDriver().switchTo().alert().getText());
       String actualPopupMessage =  Driver.getDriver().switchTo().alert().getText();
       String expectedPopupMessage = "validation failed";
        System.out.println(actualPopupMessage);
        Assert.assertTrue(actualPopupMessage.equals(expectedPopupMessage));
    }
    @Then("closes the popup by clicking ok")
    public void closes_the_popup_by_clicking_ok() {
        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("returns to the first page")
    public void returns_to_the_first_page() {
        ReusableMethods.switchToWindow("WebDriverUniversity.com");
    }
    @Then("verifies that returned to the first page")
    public void verifies_that_returned_to_the_first_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().equals("WebDriverUniversity.com"));
    }

}
