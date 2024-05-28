package po.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import po.CalculatorPage;

public class DivisionTest extends BaseTest {
    @DataProvider(name = "Numbers")
    public Object[][] dataProvider() {
        return new Object[][] {
            {"0", "100", "0"},
            {"60", "3", "20"},
            {"5", "0", "Not a Number"},
            {"20", "100", "0.2"}
        };
    }

    @Test(dataProvider = "Numbers")
    public void divisionTest(String a, String b, String expectedResult) {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        String result = calculatorPage.divide(a, b);
        Assert.assertEquals(result, expectedResult);
    }
}
