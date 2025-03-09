package org.example;

import java.util.ArrayList;

public class Manager implements Employee{
    String title;
    ArrayList<Employee> employees;
    public Manager(String title){
        this.title = title;
        employees = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    @Override
    public void showDetails() {
System.out.println("I'm manager" + this.title +"those are my employees");
 for(Employee e: employees){
  e.showDetails();
  }
    }
}
