package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.EditorPage;
import utilities.Driver;

public class EditorStepDefinitions {
    EditorPage editorPage = new EditorPage();
    @When("user navigates to editor.datatables.net")
    public void user_navigates_to_editor_datatables_net() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }
    @Then("clicks the new button")
    public void clicks_the_new_button() {
        editorPage.newButton.click();
    }
    @Then("enters {string} as firstname")
    public void enters_as_firstname(String firstname) {
        editorPage.firstnameTextBox.sendKeys(firstname);
    }
    @Then("enters {string} as lastname")
    public void enters_as_lastname(String lastname) {
        editorPage.lastNameBox.sendKeys(lastname);
    }
    @Then("enters {string} as Position")
    public void enters_as_position(String position) {
        editorPage.possitionBox.sendKeys(position);
    }
    @Then("enters {string} as Office")
    public void enters_as_office(String office) {
        editorPage.officeBox.sendKeys(office);

    }
    @Then("enters {string} as Extension")
    public void enters_as_extension(String extension) {
        editorPage.extensionBox.sendKeys(extension);
    }
    @Then("enters {string} as Start date")
    public void enters_as_start_date(String startDate) {
        editorPage.dateBox.sendKeys(startDate);
        Driver.getDriver().findElement(By.xpath("//div[@class='DTE_Body']")).click();
    }
    @Then("enters {string} as Salary")
    public void enters_as_salary(String salary) {
        editorPage.salary.sendKeys(salary);
    }
    @Then("clicks the Create button")
    public void clicks_the_create_button() {
        editorPage.createButton.click();
    }
    @When("user searches for {string}")
    public void user_searches_for(String firstname) {
        editorPage.searchTextbox.sendKeys(firstname);
    }
    @Then("verifies that the name section contains {string}")
    public void verifies_that_the_name_section_contains(String firstname) {
        String actualFirstname= editorPage.actualSearchResult.getText();
        Assert.assertTrue(actualFirstname.contains(firstname));
    }


    @And("waits for {int} second")
    public void waits_for_second(int duration) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
