import Employees.Company;
import Employees.Employee;
import Employees.Manager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> newCompany = new ArrayList<>();
        newCompany.add(new Manager(new Company(), "alex", 1));


        Company companyOne = new Company();
        companyOne.setCompanyIncome(10);
        companyOne.hire(new Manager(companyOne, "Vasya", 2));
        companyOne.hire(new Manager(companyOne, "max", 3));
        System.out.println("Бабки компании: " + companyOne.getCompanyIncome());
        companyOne.printCompanyList();

        System.out.println("++++++++++++++++++++++++++++++");
        Company company = new Company();
        company.hire(new Manager(company, "lora", 1));
        System.out.println("Бабки второй компании:" + company.getCompanyIncome());

    }
}
