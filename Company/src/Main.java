import Employees.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company google = new Company();
        Employee manager = new Manager();
        List<Employee> notHiredEmployees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            notHiredEmployees.add(new Manager(google));
        }

//        for (Employee s : notHiredEmployees){
//            System.out.println(s);
//        }

        google.hire(new Manager());
        google.hire(new Manager());
        google.hire(new Manager());
        google.hire(new Manager());

        System.out.println("Доход компании: " + google.getCompanyIncome());
        google.printCompanyList();
        google.fire();
        google.printCompanyList();
        System.out.println("Доход компании: " + google.getCompanyIncome());
        google.hireAll(notHiredEmployees);
        google.printCompanyList();
        System.out.println("Доход компании: " + google.getCompanyIncome());
        google.fire();

        System.out.println();
        Company company1 = new Company();
        company1.hire(new Manager());
        company1.printCompanyList();
        System.out.println("Доход компании 1: " + company1.getCompanyIncome());
        System.out.println("Тестовая хрень: " + manager.getMonthSalary());
    }
}
