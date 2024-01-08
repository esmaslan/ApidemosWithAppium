package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.CategoriesPage;
import utils.DriverManager;

public class CategoriesPageSteps {
    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());

    @When("taps {string} on Categories Page")
    public void tapsOnCategoriesPage(String tab) {
        categoriesPage.clickTab(tab);
    }

    @When("taps Close Button on Categories Page")
    public void tapsCloseButtonOnCategoriesPage() {
        categoriesPage.clickCloseButton();
    }

    @Given("user should see the Categories Page")
    public void userShouldSeeTheCategoriesPage() {
        categoriesPage.categoriesAssert();
    }
}