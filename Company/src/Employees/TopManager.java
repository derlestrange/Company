package Employees;

public class TopManager implements Employee {

    private double topManagerIncome;
    private Company topManagerCompany;
    private final double FIXED_POINT = 50000;

    public TopManager() {
        setEmployeeIncome();
    }

    @Override
    public String toString() {
        return "Топ Менеджер: Зарплата " + getMonthSalary() + ",";
    }

    @Override
    public double getMonthSalary() {
        if (topManagerCompany.getCompanyIncome() > 10000000) {
            return FIXED_POINT + (getEmployeeIncome() * 1.5);
        } else {
            return FIXED_POINT;
        }
    }

    @Override
    public double getEmployeeIncome() {
        return topManagerIncome;
    }

    //назначаем рандомный доход для компании, из которого высчитывается ЗП
    @Override
    public void setEmployeeIncome() {
        topManagerIncome = Math.random() * (50000) + 100000;
    }

    @Override
    public void setCompany(Company company) {
        this.topManagerCompany = company;
    }
}
