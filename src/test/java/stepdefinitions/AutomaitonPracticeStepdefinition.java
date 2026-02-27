package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AutomationPracticePage;
import utilities.ConfigReader;

public class AutomaitonPracticeStepdefinition {
    AutomationPracticePage automationPracticePage = new AutomationPracticePage();
    @Given("user clicks on the sign in link")
    public void user_clicks_on_the_sign_in_link() {
       automationPracticePage.signInElement.click();
    }
    @Given("enters an email address without @ symbol and clicks enter")
    public void enters_an_email_address_without_at_symbol_and_clicks_enter() {
        String invalidMail = ConfigReader.getProperty("AutomationPracticeInvalidMail");
        automationPracticePage.emailTextBox.sendKeys(invalidMail+ Keys.ENTER);
    }
    @Then("verify that the error message is {string}")
    public void verify_that_the_error_message_is(String expectedMessage) {
        Assert.assertTrue(automationPracticePage.invalidMailMessage.getText().contains(expectedMessage));
    }

}
