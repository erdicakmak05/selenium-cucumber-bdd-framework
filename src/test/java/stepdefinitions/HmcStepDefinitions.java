package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HMCPage;
import utilities.ConfigReader;

public class HmcStepDefinitions {
    HMCPage hmcPage = new HMCPage();

    @Given("user clicks on login link")
    public void user_clicks_on_login_link() {
        hmcPage.mainPageLogin.click();
    }
    @Then("user enters {string} as username")
    public void user_enters_as_username(String userType) {
        hmcPage.userNameTextBox.sendKeys(ConfigReader.getProperty(userType));
    }
    @Then("enters {string} as password")
    public void enters_as_password(String passwordType) {
        hmcPage.passwordTextBox.sendKeys(ConfigReader.getProperty(passwordType));
    }
    @Then("clicks the login button")
    public void clicks_the_login_button() {
        hmcPage.loginButonu.click();
    }
    @Then("verifies that login is successful")
    public void verifies_that_login_is_successful() {
        Assert.assertTrue(hmcPage.basariliGirisYaziElementi.isDisplayed());
    }

    @And("verifies that login has failed")
    public void verifies_that_login_has_failed() {
        Assert.assertTrue(hmcPage.girisYapilamadiYaziElementi.isDisplayed());
    }

    @Then("enters username as {string} from scenario outline")
    public void enters_username_from_scenario_outline(String username) {
        hmcPage.userNameTextBox.sendKeys(username);
    }

    @And("enters password as {string} from scenario outline")
    public void enters_password_from_scenario_outline(String password) {
        hmcPage.passwordTextBox.sendKeys(password);
    }


}
