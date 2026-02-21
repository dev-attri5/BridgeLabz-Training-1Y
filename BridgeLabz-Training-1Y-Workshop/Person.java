class Human {
    String name;
    int age;

    // Parent class constructor
    Human (String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Human {
    int employeeId;

    // Child class constructor
    Employee(String name, int age, int employeeId) {
        super(name, age);   // calling parent constructor
        this.employeeId = employeeId;
    }

    void displayEmployee() {
        super.displayPerson();  // calling parent method
        System.out.println("Employee ID: " + employeeId);
    }
}

public class Person {
    public static void main(String[] args) {
        Employee e1 = new Employee("Akshansh", 20, 101);
        e1.displayEmployee();
    }
}
