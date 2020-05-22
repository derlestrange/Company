import Employees.Company;
import Employees.Manager;

public class Main {
    public static void main(String[] args) {
        Company testingCompany = new Company();
        testingCompany.setCompanyIncome(212);
        testingCompany.getCompanyIncome();
        System.out.println();
        testingCompany.hire(new Manager(testingCompany, "Vasya",2));
        testingCompany.printCompanyList();
    }
}
