import Employees.Company;
import Employees.Manager;

public class Main {
    public static void main(String[] args) {
        Company testingCompany = new Company();
        testingCompany.setCompanyIncome(10);
        testingCompany.hire(new Manager(testingCompany, "Vasya", 2));
        testingCompany.hire(new Manager(testingCompany, "max", 3));
        System.out.println("Бабки компании: " + testingCompany.getCompanyIncome());
        testingCompany.printCompanyList();

        System.out.println("++++++++++++++++++++++++++++++");
        Company company = new Company();
        company.hire(new Manager(company, "lora", 1));
        System.out.println("Бабки второй компании:" + company.getCompanyIncome());

    }
}
