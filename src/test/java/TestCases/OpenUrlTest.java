package TestCases;

import core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OpenUrlTest extends BaseTest {
    @BeforeSuite
    public void setup(){
        init("https://www.tokopedia.com/");
    }

    @Test
    public void openUrlTest(){
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.tokopedia.com/");
    }
}
