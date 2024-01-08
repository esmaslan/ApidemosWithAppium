package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class PopupPage {

    ElementHelper elementHelper;

    By buttons = By.className("android.widget.Button");
    By title = By.xpath("//android.view.ViewGroup/android.widget.TextView");
    By makeButon = By.xpath("//android.widget.Button[@content-desc=\"Make a Popup!\"]");
    By popup=By.id("android:id/title");


    public PopupPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickButton(String button) {
        elementHelper.clickElementWithText(buttons, button);
    }


    public String  getTitleText() {
        return elementHelper.getText(title);
    }

    public void assertMakeButton() {
      //  Assert.assertTrue(makeButon.);
    }

    public void clickMakePopup() {
        elementHelper.click(makeButon);
    }

    public void clickPopups(String popupText) {
        elementHelper.clickElementWithText(popup,popupText);
    }

    public void clickPopupElement(String editButton) {
        elementHelper.clickElementWithText(popup,editButton);
    }

    public String getTextShare() {
        return elementHelper.getText(popup);
    }
}
