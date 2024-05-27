package po.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import po.CalculatorPage;

public class SubtractionTest extends BaseTest {
    @DataProvider(name = "Numbers")
    public Object[][] dataProvider() {
        return new Object[][]{
            {"100", "1", "99"},
            {"1", "0", "1"},
            {"100", "100", "0"}
            {"100", "200", "-100"}
        };
    }

    @Test(dataProvider = "Numbers")
    public void additionTest(String a, String b, String expectedResult) {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        String result = calculatorPage.subtract(a, b);
        Assert.assertEquals(result, expectedResult);
    }
}
