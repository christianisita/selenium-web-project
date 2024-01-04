package TestCases;

import core.DriverManager;
import core.GlobalVariable;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest extends DriverManager {
    protected WebDriver driver = GlobalVariable.driver;
    public void loadPage(String url){
        driver.get(url);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
