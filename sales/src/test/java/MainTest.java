import org.testng.Assert;
import org.testng.annotations.Test;

import sales_salary.Sales;

public class MainTest {
    @Test
    public static void FirstTest(){
        Sales obj=new Sales(6000,15000);
        double salary=obj.getSalary();
        double sales=obj.getSales();
        double expected=7200.00;
        double actual=obj.calculate();
        Assert.assertEquals(actual,expected,"Calc method Failed...");
    }
    @Test
    public static void SecondTest(){
        Sales obj=new Sales(5000,15000);
        double salary=obj.getSalary();
        double sales=obj.getSales();
        double expected=6200.00;
        double actual=obj.calculate();
        Assert.assertEquals(actual,expected,"Calc method Failed...");
    }
}
