package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class RadioButtonPage {

    ElementHelper elementHelper;

    By title = By.className("android.widget.TextView");
    By radioButtonsElements = By.className("android.widget.RadioButton");
    By clearButton=By.id("io.appium.android.apis:id/clear");
    By choiceButton=By.id("io.appium.android.apis:id/choice");


    public RadioButtonPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public String getTitleText() {
        return elementHelper.getText(title);
    }

    public String checkRadioButtons() {
        return elementHelper.getText(radioButtonsElements);
    }

    public String checkClearButton() {
return elementHelper.getText(clearButton);
    }

    public void clickRadioElement(String raio) {
        elementHelper.checkElementWithText(radioButtonsElements,raio);
    }

    public String  getTextDinnerAndLunch() {
        return elementHelper.getText(choiceButton);
    }
}