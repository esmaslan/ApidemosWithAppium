package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.ElementHelper;

import java.util.List;

public class CategoriesPage {

    ElementHelper elementHelper;

    //By tabs = By.id("com.sahibinden:id/util_primary_text");
    By tabs = By.id("android:id/text1");
    By closeButton = By.xpath("//android.widget.FrameLayout/android.widget.ImageView[2]");
    By categories=By.id("android:id/text1");



    public CategoriesPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public void clickTab(String tab) {
        elementHelper.clickElementWithText(tabs, tab);
    }

    public void clickCloseButton() {
        elementHelper.click(closeButton);
    }


    public void categoriesAssert() {
        List<WebElement> catList= elementHelper.findElements(categories);
        Assert.assertTrue(catList.size()>0);

    }

    public void clickCategory(String category) {
        elementHelper.clickElementWithText(categories,category);
    }

}
