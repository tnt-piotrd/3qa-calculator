package po.test;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments(
                "--headless", "--window-size=1920,1200", "--ignore-certificate-errors");
        Capabilities cap = options;

        driver = new ChromeDriver(options);
        driver.get("https://www.theonlinecalculator.com/");
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
