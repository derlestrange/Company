package Employees;

public class Manager implements Employee {

    String managerName;
    int managerId;
    double managerSalary;
    Company managerCompany;

    public Manager(Company company, String name, int id) {
        this.managerName = name;
        this.managerId = id;
        this.managerCompany = company;
    }

    @Override
    public String toString() {
        return "Manager:\n" + "Id менеджера  = " + managerId +
                "\nИмя менеджера = " + managerName +
                "\nЗарплата менеджера = " + managerSalary +
                "\nКомпания менеджера: " + managerCompany.toString();
    }

    @Override
    public void setCompany(Company company) {
        managerCompany = company;
    }

    @Override
    public void setMonthSalary(double monthSalary) {
        managerSalary = monthSalary;
    }

    @Override
    public int getMonthSalary() {
        return 0;
    }
}
