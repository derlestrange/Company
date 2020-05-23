package Employees;

public class Manager implements Employee {

    String managerName;
    int managerId;
    long managerSalary;
    Company managerCompany;
    Manager manager;

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
    public void setMonthSalary() {
        managerSalary = (long) (Math.random()*(60000-35000)+35000);
    }

    @Override
    public long getMonthSalary() {
        return managerSalary;
    }
}
