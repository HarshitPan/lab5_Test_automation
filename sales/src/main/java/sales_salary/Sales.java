package sales_salary;

public class Sales {
    private double salary=0;
    private double sales=0;
    public Sales(double salary,double sales)
    {
        this.salary=salary;
        this.sales=sales;
    }
    public double getSalary()
    {
        return salary;
    }
    public double getSales(){
        return sales;
    }
    public double calculate()
    {
        double com=0;
        if(sales>5000) com=(sales-5000)*.12;
        return salary+com;
    }
}