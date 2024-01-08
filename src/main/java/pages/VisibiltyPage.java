package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class VisibiltyPage {

    ElementHelper elementHelper;

    //By title = By.id("android:id/action_bar");
    By title = By.className("android.widget.TextView");
    By viewB = By.id("io.appium.android.apis:id/victim");
    By buttons = By.className("android.widget.Button");


    public VisibiltyPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public String getTitleText() {
        return elementHelper.getText(title);
    }

    public void checkViewB() {
        elementHelper.checkElement(viewB);
    }

    public void checkInvisBtn(String button) {
        elementHelper.checkElementWithText(buttons,button);
    }

    public void clickInvisBtn(String button) {
        elementHelper.clickElementWithText(buttons,button);
    }

    public Boolean checkNotSeeView() {
       return elementHelper.checkElemenEnabled(viewB);
    }
}