package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePageObject extends BaseObject {
    @FindBy(xpath = "//*[@data-testid='icnHeaderIcon']")
    private WebElement icon;
}
