package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class SearchViewPage {

    ElementHelper elementHelper;

    By title = By.id("android:id/action_bar_title");
    By searchButton = By.id("io.appium.android.apis:id/action_search");
    By textArea = By.id("android:id/search_src_text");
    By textInPage = By.id("io.appium.android.apis:id/txt_query");
    By gitButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout");


    public SearchViewPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public String getTitleText() {

        return elementHelper.getText(title);
    }


    public void checkSearchButton() {
        elementHelper.checkElement(searchButton);
    }

    public void clickSearchButton() {
        elementHelper.click(searchButton);
    }

    public void sendKeysSearchButton(String  text) {
        elementHelper.sendKeys(textArea,text);
        elementHelper.pressEnter();
    }

    public String getTextArea() {
        return elementHelper.getText(textInPage);
    }
}