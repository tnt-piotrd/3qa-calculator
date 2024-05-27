package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    private final WebDriver driver;

    @FindBy(id = "display")
    private WebElement displayInput;

    @FindBy(name = "add")
    private WebElement addBtn;

    @FindBy(name = "calculate")
    private WebElement calculateBtn;

    @FindBy(name = "multiply")
    private WebElement multiplyBtn;

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String add(String a, String b) {
        displayInput.sendKeys(a);
        addBtn.click();
        displayInput.sendKeys(b);
        calculateBtn.click();
        return getDisplayContent();
    }

    private String getDisplayContent() {
        return displayInput.getAttribute("value");
    }

    public String multiply(String a, String b) {
        displayInput.sendKeys(a);
        multiplyBtn.click();
        displayInput.sendKeys(b);
        calculateBtn.click();
        return getDisplayContent();
    }
}
