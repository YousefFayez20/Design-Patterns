package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee no1 = new FrontEndDev("hassan na2a4");
        Employee no2 = new BackEndDev("mohsen el mohandas");
        Employee no3 = new BackEndDev("Sayed El 3asfora");

        Manager no4 = new Manager("EL Boss");
        no4.addEmployee(no1);
        no4.addEmployee(no2);
        no4.addEmployee(no3);
        Employee no5 = new BackEndDev("Said El 3ian");
        Manager no6 = new Manager("EL Boss El kabeer");
        no6.addEmployee(no5);
        no6.addEmployee(no4);
        no4.showDetails();
        no6.showDetails();



    }
}