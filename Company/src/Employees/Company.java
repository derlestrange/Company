package Employees;

import java.util.ArrayList;
import java.util.List;

public class Company {

    protected List<Employee> companyList = new ArrayList<>();
    private long companyIncome;
    Company company;

    public Company() {
    }

    public void hire(Employee employee) {
        companyList.add(employee);
        employee.setCompany(new Company());
        employee.setMonthSalary();
    }

    public void getCompanyIncome() {
        System.out.print("Доход компании: " + companyIncome);
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
