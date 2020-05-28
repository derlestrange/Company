package Employees;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Employee> companyList = new ArrayList<>();
    long companyIncome;
    private String nameCompany;

    public Company(String nameCompany){
        this.nameCompany = nameCompany;
    }

    List<Employee> getTopSalaryStaff(int count) {
        return null;
    }

    List<Employee> getLowestSalaryStaff(int count) {
        return null;
    }


    public void hire(Employee employee) {
        employee.setEmployeeIncome();
        employee.setCompany(this);
        setCompanyIncome((long) (getCompanyIncome() + employee.getEmployeeIncome()));
        companyList.add(employee);
    }

    public void hireAll(List<Employee> list) {
        long income = 0;
        for (Employee employee : list) {
            employee.setEmployeeIncome();
            income += employee.getEmployeeIncome();
        }
        setCompanyIncome(income + getCompanyIncome());
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
            System.out.println(employee + "Работает в компании: " + nameCompany);
        }
        System.out.println("число сотрудников: " + companyList.size());
    }
}
