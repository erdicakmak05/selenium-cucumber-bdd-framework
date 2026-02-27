package stepdefinitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HerokuappAddElementPages;
import utilities.ReusableMethods;

public class HerokuappAddElementDefinitions {
    HerokuappAddElementPages herokuappAddElementPages = new HerokuappAddElementPages();
    @When("user clicks on Add Element button")
    public void user_clicks_on_add_element_button() {
        herokuappAddElementPages.addElementButtonn.click();
    }
    @When("waits until the Delete button becomes visible")
    public void waits_until_the_delete_button_becomes_visible() {
        ReusableMethods.waitForVisibility(herokuappAddElementPages.firstDeleteButton,15);
    }
    @When("verifies that the Delete button is visible")
    public void verifies_that_the_delete_button_is_visible() {
        Assert.assertTrue(herokuappAddElementPages.firstDeleteButton.isDisplayed());
    }
    @When("clicks the Delete button to remove it")
    public void clicks_the_delete_button_to_remove_it() {
        herokuappAddElementPages.firstDeleteButton.click();
    }

}
