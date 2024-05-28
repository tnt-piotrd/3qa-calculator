package po.test;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.util.Strings;
import po.CalculatorPage;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        String resolution = System.getProperty("resolution");
        if (Strings.isNullOrEmpty(resolution)){
            resolution="1920,1080";
        }
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments(
                "--headless", "--window-size=%s".formatted(resolution), "--ignore-certificate-errors");
        Capabilities cap = options;

        driver = new ChromeDriver(options);
        driver.get("https://www.theonlinecalculator.com/");
    }

    @AfterMethod
    public void clear() {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.clear();
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
