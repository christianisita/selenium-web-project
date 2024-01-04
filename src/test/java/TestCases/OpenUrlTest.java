package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.HomePageObject;

public class OpenUrlTest extends BaseTest  {
    private HomePageObject homePageObject = new HomePageObject();

    /**
     * This used for testing that init driver and base test is working
     */

    @BeforeSuite
    public void setup(){
        loadPage("https://www.tokopedia.com/");
    }

    @Test
    public void openUrlTest(){
        String currentUrl = driver.getCurrentUrl();
        boolean isIconVisible = homePageObject.getIcon().isDisplayed();
        Assert.assertEquals(currentUrl, "https://www.tokopedia.com/");
        Assert.assertTrue(isIconVisible);
    }
}
