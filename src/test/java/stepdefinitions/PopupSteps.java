package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.PopupPage;
import utils.DriverManager;

public class PopupSteps {
    PopupPage popupPage = new PopupPage(DriverManager.getDriver());

    @When("taps {string} button on Popup")
    public void tapsButtonOnPopup(String button) {
        popupPage.clickButton(button);
    }

    @Then("should see Title {string} on Popup Menu Page")
    public void shouldSeeTitleOnPopupMenuPage(String title) {
       String currentTitle= popupPage.getTitleText();
        Assert.assertTrue(currentTitle.equals(title));
    }

    @Given("user is on the Popup Menu Page")
    public void userIsOnThePopupMenuPage() {

    }

    @Then("should Make Popup Button {string} on Popup Menu Page")
    public void shouldMakePopupButtonOnPopupMenuPage(String button) {
        popupPage.assertMakeButton();
    }

    @When("taps Make Popup Button on Popup Menu Page")
    public void tapsMakePopupButtonOnPopupMenuPage() {
        popupPage.clickMakePopup();
    }

    @Then("should see Popup Element {string} on Popup Menu Page")
    public void shouldSeePopupElementOnPopupMenuPage(String popup) {
        popupPage.clickPopups(popup);
    }

    @When("taps Popup Element {string} on Popup Menu Page")
    public void tapsPopupElementOnPopupMenuPage(String popupElement) {
        popupPage.clickPopupElement(popupElement);

    }

    @Then("should see Popup Menu Tite {string} on Popup Menu Page")
    public void shouldSeePopupMenuTiteOnPopupMenuPage(String shareButton) {
        String shareText= popupPage.getTextShare();
        Assert.assertTrue(shareText.equals(shareButton));
    }


}