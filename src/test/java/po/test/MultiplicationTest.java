package po.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import po.CalculatorPage;

public class MultiplicationTest extends BaseTest {
    @DataProvider(name = "Numbers")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"100", "0", "0"},
                {"0", "100", "0"},
                {"450", "2", "900"},
        };
    }

    @Test(dataProvider = "Numbers")
    public void multiplicationTest(String a, String b, String expectedResult) {
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        String result = calculatorPage.multiply(a, b);
        Assert.assertEquals(result, expectedResult);
    }
}
