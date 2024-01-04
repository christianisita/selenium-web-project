package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    public DriverManager(){
        WebDriverManager.chromedriver().setup();
        GlobalVariable.driver = new ChromeDriver();
    }
}
