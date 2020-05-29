package Employees;

public class Operator implements Employee {

    private Company operatorCompany;
    private final double FIXED_POINT = 25000;

    public Operator() { }

    @Override
    public String toString() {
        return "Оператор: Зарплата " + getMonthSalary() + ",";
    }

    @Override
    public double getMonthSalary() {
        return FIXED_POINT;
    }

    @Override
    public void setCompany(Company company) {
        this.operatorCompany = company;
    }

    @Override
    public double getEmployeeIncome() {
        return 0;
    }

    @Override
    public void setEmployeeIncome() {

    }
}
