package practise;

import org.testng.annotations.DataProvider;

public class TestData {

    @DataProvider
    public static Object[][] getData() {
        return new Object[][]
                {
                        {"hello"},{"£&@"}
                };
    }
}
