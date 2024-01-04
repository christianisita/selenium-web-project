package pages;

import core.GlobalVariable;
import org.openqa.selenium.support.PageFactory;

public class BaseObject {
    public BaseObject(){
        PageFactory.initElements(GlobalVariable.driver, this);
    }
}
