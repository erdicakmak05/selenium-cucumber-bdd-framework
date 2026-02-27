package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPages;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPages amazonPages = new AmazonPages();

    @Given("user navigates to amazon page")
    public void user_navigates_to_amazon_page() {
        Driver.getDriver().get(ConfigReader.getProperty("AmazonUrl"));
    }

    @Given("searches for iPhone")
    public void searches_for_iPhone() {
        amazonPages.aramaKutusu.sendKeys("Iphone"+ Keys.ENTER);

    }

    @Then("verifies that results contain iPhone")
    public void verifies_that_results_contain_iPhone() {
        String sonucYazisiStr = amazonPages.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiStr.contains("Iphone"));
    }

    @Given("searches for tea pot")
    public void searches_for_tea_pot() {
        amazonPages.aramaKutusu.sendKeys("tea pot"+ Keys.ENTER);
    }

    @Then("verifies that results contain tea pot")
    public void verifies_that_results_contain_tea_pot() {
        String sonucYazisiStr = amazonPages.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiStr.contains("tea pot"));
    }

    @Given("searches for flower")
    public void searches_for_flower() {
        amazonPages.aramaKutusu.sendKeys("Flower"+ Keys.ENTER);
    }

    @Then("verifies that results contain flower")
    public void verifies_that_results_contain_flower() {
        String sonucYazisiStr = amazonPages.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiStr.contains("Flower"));
    }

    @Given("searches for {string}")
    public void searches_for(String searchKeyword) {
        amazonPages.aramaKutusu.sendKeys(searchKeyword+Keys.ENTER);
    }
    @Then("verifies that results contain {string}")
    public void verifies_that_results_contain(String searchKeyword) {
        String sonucYazisiStr = amazonPages.sonucYazisiElementi.getText();
        Assert.assertTrue(sonucYazisiStr.contains(searchKeyword));
    }

    @And("closes the page")
    public void closes_the_page() {
        Driver.closeDriver();
    }

    @Given("user navigates to {string} page")
    public void user_navigates_to_page(String desiredUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(desiredUrl));
    }
}
