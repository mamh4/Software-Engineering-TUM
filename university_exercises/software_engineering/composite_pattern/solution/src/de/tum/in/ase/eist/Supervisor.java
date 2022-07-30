package de.tum.in.ase.eist;

import java.util.ArrayList;
import java.util.List;

// TODO 1: Implement the Supervisor class
public class Supervisor extends Employee{
    private List<Employee> employeeList = new ArrayList<>();

    public Supervisor(String name) {
        super(name);
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }
    public void fireEmployee(Employee employee){
        employeeList.remove(employee);
    }

    @Override
    public void list(int level) {
        printName(level);
        for (Employee i : employeeList) {
            if (level <= employeeList.size()) {
                i.list(level + 1);
            }
        }
    }
    // TODO 3: Implement list() for Supervisor
}
