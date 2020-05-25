package Employees;

public class Manager implements Employee {

    private String managerName;
    private int managerId;
    private long managerSalary;
    private Company managerCompany;
    private Manager manager;

    public Manager(Company company, String name, int id) {
        this.managerName = name;
        this.managerId = id;
        this.managerCompany = company;
    }

    public Manager(Company company){
        this.managerCompany = company;
    }

//    public Manager(Company company, long managerSalary) {
//        this.managerCompany = company;
//        this.managerSalary = managerSalary;
//    }

    public Manager() {

    }

    //    @Override
//    public String toString() {
//        return "Manager:\n" + "Id менеджера  = " + managerId +
//                "\nИмя менеджера = " + managerName +
//                "\nЗарплата менеджера = " + managerSalary +
//                "\nКомпания менеджера: " + managerCompany.toString();
//    }
    @Override
    public String toString() {
        return "ЗП манагера:" + managerSalary;
    }

    @Override
    public void setCompany(Company company) {
        managerCompany = company;
    }

    @Override
    public void setMonthSalary() {
        managerSalary = (long) (Math.random() * (60000 - 35000) + 35000);
    }

    @Override
    public long getMonthSalary() {
        return managerSalary;
    }
}
