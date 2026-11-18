package OOPS.CompositionVsInheritance;

class Person {

    String name = "Rajasulochana";

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {

    int employeeId = 111392;

    void displayEmployeeId() {
        System.out.println("Employee ID: " + employeeId);
    }
}

public class Inheritance {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.displayName();
        emp.displayEmployeeId();
    }
}
