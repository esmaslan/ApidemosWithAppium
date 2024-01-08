package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.SwitchPage;
import utils.DriverManager;

public class SwitchStep {
    SwitchPage switchPage = new SwitchPage(DriverManager.getDriver());
    CategoriesPage categoriesPage=new CategoriesPage(DriverManager.getDriver());

    @Then("should see Switches {string} Page")
    public void shouldSeeSwitchesPage(String swit) {
        String currentTitle=switchPage.getTitleText();
        Assert.assertTrue(currentTitle.equals(swit));
    }

    @Given("user is on the Switches Page")
    public void userIsOnTheSwitchesPage() {
        categoriesPage.clickCategory("Views");
        categoriesPage.clickCategory("Switches");
    }

    @Then("should see Defaults Switch On{string} on Switches Page")
    public void shouldSeeDefaultsSwitchOnOnSwitchesPage(String defaultBtn) {
        switchPage.checkDefault();
    }

    @When("taps to Defaults Switch on Switches Page")
    public void tapsToDefaultsSwitchOnSwitchesPage() {
        switchPage.clickDeafultBtn();
    }


    @Then("should see Defaults Switch Off {string} on Switches Page")
    public void shouldSeeDefaultsSwitchOffOnSwitchesPage(String kapali) {
      String currentStatement=  switchPage.getDefaultText();
      Assert.assertTrue(currentStatement.contains(kapali));
    }
}
