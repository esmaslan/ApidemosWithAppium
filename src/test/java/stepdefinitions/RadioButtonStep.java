package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.RadioButtonPage;
import utils.DriverManager;

public class RadioButtonStep {
    RadioButtonPage radioButtonPage = new RadioButtonPage(DriverManager.getDriver());
    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());



    @Then("should see Title {string} on Radio Button Page")
    public void shouldSeeTitleOnRadioButtonPage(String title) {
        String currentTitle=radioButtonPage.getTitleText();
        Assert.assertTrue(currentTitle.equals(title));
    }

    @Given("user is on the Radio Button Page")
    public void userIsOnTheRadioButtonPage() {
        categoriesPage.clickCategory("Views");
        categoriesPage.clickCategory("Radio Group");
    }

    @Then("should see Radio Button {string} on Radio Button Page")
    public void shouldSeeRadioButtonOnRadioButtonPage(String radioButton) {
        String currentText=radioButtonPage.checkRadioButtons();
        Assert.assertTrue(currentText.equals(radioButton));
    }

    @Then("should see Clear Button {string} on Radio Button Page")
    public void shouldSeeClearButtonOnRadioButtonPage(String clear) {
        String currentClear=radioButtonPage.checkClearButton();
        Assert.assertTrue(currentClear.equals(clear));
    }

    @When("taps to Radio Button {string} on Radio Button Page")
    public void tapsToRadioButtonOnRadioButtonPage(String radioElement) {
        radioButtonPage.clickRadioElement(radioElement);
    }

    @Then("should see Selected Text {string} on Radio Button Page")
    public void shouldSeeSelectedTextOnRadioButtonPage(String selectedText) {
        String currentText=radioButtonPage.getTextDinnerAndLunch();
        Assert.assertTrue(currentText.equals(selectedText));
    }
}
