package Employees;

public class Operator implements Employee {

    private double operatorIncome;
    private Company operatorCompany;
    private final double FIXED_POINT = 25000;

    public Operator(Company company) {
        this.operatorCompany = company;
        setEmployeeIncome();
    }

    public Operator() {
        setEmployeeIncome();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerSalary = " + operatorIncome + '}';
    }

    @Override
    public double getMonthSalary() {
        return FIXED_POINT;
    }

    @Override
    public double getEmployeeIncome() {
        return operatorIncome;
    }

    @Override
    public Company getCompany() {
        return operatorCompany;
    }

    @Override
    public void setEmployeeIncome() {

    }

    @Override
    public void setCompany(Company company) {
        this.operatorCompany = company;
    }
}
