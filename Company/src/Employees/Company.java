package Employees;

import java.util.*;

public class Company {

    List<Employee> companyList = new ArrayList<>();
    long companyIncome;
    private String nameCompany;

    public Company(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public void getTopSalaryStaff(int count) {
        companyList.sort((o1, o2) -> Double.compare(o2.getMonthSalary(), o1.getMonthSalary()));
        System.out.println("Список самых высоких зарплат: ");
        for (int i = 0; i < count; i++) {
            System.out.println("№" + i + " " +companyList.get(i) +
                    " Работает в компании: " + nameCompany);
        }
    }

    public void getLowestSalaryStaff(int count) {
        companyList.sort(Comparator.comparingDouble(Employee::getMonthSalary));
        System.out.println("Список самых низких зарплат: ");
        for (int i = 0; i < count; i++) {
            System.out.println("№" + i + " " + companyList.get(i) +
                    " Работает в компании: " + nameCompany);
        }
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
            employee.setCompany(this);
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
