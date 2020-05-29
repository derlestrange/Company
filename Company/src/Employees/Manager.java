package Employees;

public class Manager implements Employee {

    private double managerIncome;
    private Company managerCompany;
    private final double FIXED_POINT = 60000;

    public Manager() {
        setEmployeeIncome();
    }

    @Override
    public String toString() {
        return "Менеджер: Зарплата " + getMonthSalary() + ",";
    }

    @Override
    public double getMonthSalary() {
        return FIXED_POINT + (getEmployeeIncome() * 0.05);
    }

    @Override
    public double getEmployeeIncome() {
        return managerIncome;
    }

    //назначаем рандомный доход для компании, из которого высчитывается ЗП
    @Override
    public void setEmployeeIncome() {
        managerIncome = Math.random() * (25000) + 35000;
    }

    @Override
    public void setCompany(Company company) {
        this.managerCompany = company;
    }
}
