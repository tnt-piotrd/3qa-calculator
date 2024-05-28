package po.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import po.CalculatorPage;

public class AdditionTest extends BaseTest {
    @DataProvider(name = "Numbers")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"1", "3", "4"},
                {"4", "0", "4"},
                {"0", "0", "0"},
        };
    }

    @Test(dataProvider = "Numbers")
    public void additionTest(String a, String b, String expectedResult) {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        String result = calculatorPage.add(a, b);
        Assert.assertEquals(result, expectedResult);
    }
}
