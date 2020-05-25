import Employees.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> companyWithMoreEmployees = new ArrayList<>();
        Company companyOne = new Company();
        Manager manager = new Manager();
        Operator operator = new Operator();
        TopManager topManager = new TopManager();

        for (int i = 0; i < 100; i++) {
            companyWithMoreEmployees.add(manager);
        }

        companyOne.setCompanyIncome(0);
        companyOne.hire(new Manager(companyOne, "Vasya", 2));
        companyOne.hire(new Manager(companyOne, "max", 3));
        companyOne.hireAll(companyWithMoreEmployees);
        System.out.println("Бабки компании: " + companyOne.getCompanyIncome());
        companyOne.printCompanyList();


        System.out.println("++++++++++++++++++++++++++++++");
        Company company = new Company();
        company.hire(new Manager(company, "lora", 1));
        System.out.println("Бабки второй компании:" + company.getCompanyIncome());

        Company company1 = new Company();
        company1.hireAll(companyWithMoreEmployees);
        System.out.println("бабки третьей компании" + company1.getCompanyIncome());

    }
}
