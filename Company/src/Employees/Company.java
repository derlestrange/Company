package Employees;

import java.util.ArrayList;

public class Company implements Comparable<Company>{
    private final ArrayList<Employee> employeeArrayList = new ArrayList<>();

//    public ArrayList<Employee> getEmployeeArrayList() {
//        employeeArrayList.add(1, new Manager());
//    }
    
    @Override
    public int compareTo(Company company) {
        return 0;
    }
}
