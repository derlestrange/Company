package Employees;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> companyList = new ArrayList<>();
    private long companyIncome;
    Manager manager = new Manager();

    public Company() { }

    public void hire(Employee employee) {
        employee.setCompany(new Company());
        employee.setMonthSalary();
        setCompanyIncome(employee.getMonthSalary() + getCompanyIncome());
        companyList.add(employee);
    }

    public void hireAll(List<Employee> listName){
        for (int i = 0; i < listName.size(); i++) {
            manager.setMonthSalary();
            setCompanyIncome(manager.getMonthSalary() + getCompanyIncome());
            System.out.println("зп, когда наняли : " + manager.getMonthSalary());
        }
        companyList.addAll(listName);
    }

    public long getCompanyIncome() {
//        System.out.print("Доход компании: " + companyIncome);
        return companyIncome;
    }

    public void setCompanyIncome(long companyIncome) {
        this.companyIncome = companyIncome;
    }

    public void printCompanyList() {
        for (Employee employee : companyList) {
            System.out.println(employee);
        }
    }

//    @Override
//    public String toString() {
//        return "Компания: " + company;
//    }
}
