package tests.searchapartmans;

import org.testng.annotations.Test;

public class TestSOUT {
    @Test(dataProvider ="dataProviderMethod",dataProviderClass = DataProviderClass.class)
    public void testSOUT(String number,String string){
        System.out.println("Test SOUT !!!"+number+string);

    }
}
