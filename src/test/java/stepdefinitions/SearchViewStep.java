package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.SearchViewPage;
import utils.DriverManager;

public class SearchViewStep {
    SearchViewPage searchViewPage = new SearchViewPage(DriverManager.getDriver());
    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());

    @Then("should see Title {string} on Search View Page")
    public void shouldSeeTitleOnSearchViewPage(String title) {
        String currentTitle=searchViewPage.getTitleText();
        Assert.assertTrue(currentTitle.equals(title));
    }

    @Given("user is on the Search View Page")
    public void userIsOnTheSearchViewPage() {
        categoriesPage.clickCategory("Views");
        categoriesPage.clickCategory("Search View");
        categoriesPage.clickCategory("Action Bar");
    }


    @Then("should see Search Button on Search View Page")
    public void shouldSeeSearchButtonOnSearchViewPage() {
        searchViewPage.checkSearchButton();
    }

    @When("taps to Search Button on Search View Page")
    public void tapsToSearchButtonOnSearchViewPage() {
        searchViewPage.clickSearchButton();
    }

    @When("sendkeys to Search Area {string} on Search View Page")
    public void sendkeysToSearchAreaOnSearchViewPage(String text) {
        searchViewPage.sendKeysSearchButton(text);

    }

    @Then("should see Result {string} on Search View Page")
    public void shouldSeeResultOnSearchViewPage(String text) {
        String currentText=searchViewPage.getTextArea();
        Assert.assertTrue(currentText.equals(text));
    }
}
