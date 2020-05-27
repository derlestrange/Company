package Employees;

import java.util.ArrayList;
import java.util.List;

public class Company {
    List<Employee> companyList = new ArrayList<>();
    long companyIncome;

    public void hire(Employee employee) {
        employee.setEmployeeIncome();
        employee.setCompany(this);
        setCompanyIncome((long) (getCompanyIncome() + employee.getEmployeeIncome()));
        companyList.add(employee);
    }

    public void hireAll(List<Employee> list) {
        companyList.addAll(list);
    }

    public void fire() {
        int firedEmployee = (int) (Math.random() * (companyList.size()));
        System.out.println("ЗП уволенного: " + companyList.get(firedEmployee).getEmployeeIncome());
        setCompanyIncome((long) (getCompanyIncome() - companyList.get(firedEmployee).getEmployeeIncome()));
        companyList.remove(firedEmployee);
    }

    public void setCompanyIncome(long companyIncome) {
        this.companyIncome = companyIncome;
    }

    public long getCompanyIncome() {
        return companyIncome;
    }

    public void printCompanyList() {
        for (Employee employee : companyList) {
            System.out.println(employee);
        }
        System.out.println("число сотрудников: " + companyList.size());
    }
}
