package Employees;

public class Manager implements Employee {
    private double managerIncome;
    private Company managerCompany;
    private final double FIXED_POINT = 30000;

    public Manager(Company company) {
        this.managerCompany = company;
        setEmployeeIncome();
    }

    public Manager() {
        setEmployeeIncome();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerSalary = " + managerIncome +
                ", company = " + managerCompany.toString() +
                '}';
    }

    @Override
    public double getMonthSalary() {
        return FIXED_POINT + (getEmployeeIncome() * 0.05);
    }

    @Override
    public double getEmployeeIncome() {
        return managerIncome;
    }


    @Override
    public void setEmployeeIncome() {
        managerIncome = Math.random() * (25000) + 35000;
    }

    @Override
    public void setCompany(Company company) {
        this.managerCompany = company;
    }
}
