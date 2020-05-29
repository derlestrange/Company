package Employees;

import java.util.*;

public class Company {

    List<Employee> companyList = new ArrayList<>();
    long companyIncome;
    private String nameCompany;

    public Company(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    //получаем список из самых высоких зарплат
    public void getTopSalaryStaff(int count) {
        if (count > companyList.size() || count <= 0) {
            System.out.println("Ошибка! Некорректный ввод.");
        } else {
            companyList.sort((o1, o2) -> Double.compare(o2.getMonthSalary(), o1.getMonthSalary()));
            System.out.println();
            System.out.println("=====================");
            System.out.println("Список самых высоких зарплат: ");
            for (int i = 1; i <= count; i++) {
                System.out.println("№" + i + " " + companyList.get(i) +
                        " Работает в компании: " + nameCompany);
            }
            System.out.println("=====================");
            System.out.println();
        }
    }

    //получаем список из самых низких зарплат
    public void getLowestSalaryStaff(int count) {
        if (count > companyList.size() || count <= 0) {
            System.out.println("Ошибка! Некорректный ввод.");
        } else {
            companyList.sort(Comparator.comparingDouble(Employee::getMonthSalary));
            System.out.println();
            System.out.println("=====================");
            System.out.println("Список самых низких зарплат: ");
            for (int i = 1; i <= count; i++) {
                System.out.println("№" + i + " " + companyList.get(i) +
                        " Работает в компании: " + nameCompany);
            }
            System.out.println("=====================");
            System.out.println();
        }
    }

    //нанимаем сотрудника, прибавляем его доход к доходу компании
    public void hire(Employee employee) {
        employee.setEmployeeIncome();
        employee.setCompany(this);
        setCompanyIncome((long) (getCompanyIncome() + employee.getEmployeeIncome()));
        companyList.add(employee);
    }

    //нанимаем список сотрудников, прибавляем их доход к доходу компании
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

    //увольняем случайного сотрудника, вычитаем из дохода компании его прибыль
    public void fire() {
        int firedEmployee = (int) (Math.random() * (companyList.size()));
        System.out.println("ЗП уволенного: " + companyList.get(firedEmployee).getEmployeeIncome());
        setCompanyIncome((long) (getCompanyIncome() - companyList.get(firedEmployee).getEmployeeIncome()));
        companyList.remove(firedEmployee);
    }

    //увольняем случайных 50% сотрудников, вычитаем из дохода компании их прибыль
    public void fireHalf() {
        int countEmployees = companyList.size();
        long countEmployeesIncome = 0;
        for (int i = 0; i < countEmployees / 2; i++) {
            int firedEmployee = (int) (Math.random() * (companyList.size()));
            countEmployeesIncome += companyList.get(firedEmployee).getEmployeeIncome();
            companyList.remove(firedEmployee);
        }
        System.out.println("Зарплаты уволенных сотрудников: " + countEmployeesIncome);
        setCompanyIncome(getCompanyIncome() - countEmployeesIncome);
    }

    //устанавливаем изначальный доход компании. можно проверить начисление ЗП для топа
    public void setCompanyIncome(long companyIncome) {
        this.companyIncome = companyIncome;
    }

    //получение дохода компании
    public long getCompanyIncome() {
        return companyIncome;
    }

    //распечатка количества сотрудников, в комментарии - распечатка всех сотрудников компании
    public void printCompanyList() {
//        for (Employee employee : companyList) {
//            System.out.println(employee);
//        }
        System.out.println("Число сотрудников: " + companyList.size());
    }

}
