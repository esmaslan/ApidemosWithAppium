package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class SwitchPage {

    ElementHelper elementHelper;

    By title = By.className("android.widget.TextView");
    By defaultTab = By.xpath("//android.widget.Switch[@content-desc=\"Default is on\"]");


    public SwitchPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public String getTitleText() {

        return elementHelper.getText(title);
    }


    public void checkDefault() {
        elementHelper.checkElement(defaultTab);
    }

    public void clickDeafultBtn() {
        elementHelper.click(defaultTab);
    }

    public String  getDefaultText() {
        return elementHelper.getText(defaultTab);
    }
}