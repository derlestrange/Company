import Employees.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Company google = new Company("Google");

        Employee manager = new Manager();
        Employee topManager = new TopManager();
        Employee operator = new Operator();

        List<Employee> notHiredEmployees = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            notHiredEmployees.add(new Operator());
        }
        for (int i = 0; i < 80; i++) {
            notHiredEmployees.add(new Manager());
        }
        for (int i = 0; i < 10; i++) {
            notHiredEmployees.add(new TopManager());
        }

        google.setCompanyIncome(9000000);
        google.hireAll(notHiredEmployees);
        google.getTopSalaryStaff(15);
        google.getLowestSalaryStaff(30);



    }
}
