package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.VisibiltyPage;
import utils.DriverManager;

public class VisibilityStep {
    VisibiltyPage visibiltyPage = new VisibiltyPage(DriverManager.getDriver());
    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());


    @Then("should see Visibility {string}  Page")
    public void shouldSeeVisibilityPage(String title) {
        String currentTitle=visibiltyPage.getTitleText();
        Assert.assertTrue(currentTitle.equals(title));
    }

    @Given("user is on the Visibility Page")
    public void userIsOnTheVisibilityPage() {
        categoriesPage.clickCategory("Views");
        categoriesPage.clickCategory("Visibility");
    }

    @Then("should see View Text {string} on Visibility Page")
    public void shouldSeeViewTextOnVisibilityPage(String viewB) {
        visibiltyPage.checkViewB();
    }

    @Then("should see Buttons {string} on Visibility Page")
    public void shouldSeeButtonsOnVisibilityPage(String invis) {
        visibiltyPage.checkInvisBtn(invis);

    }

    @When("taps to Buttons {string} on Visibility Page")
    public void tapsToButtonsOnVisibilityPage(String btn) {
        visibiltyPage.clickInvisBtn(btn);
    }

    @Then("should not see View Text {string} on Visibility Page")
    public void shouldNotSeeViewTextOnVisibilityPage(String viewB) {
        Boolean b=visibiltyPage.checkNotSeeView();
        Assert.assertTrue(b==true);

    }
}
