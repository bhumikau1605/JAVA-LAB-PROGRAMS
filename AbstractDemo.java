// Abstract base class
abstract class Employee {
    String name;
    int id;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method (must be implemented by subclasses)
    abstract double calcSal();
}

// Subclass: Manager
class Manager extends Employee {
    double baseSalary;
    double bonus;

    Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calcSal() {
        return baseSalary + bonus;
    }
}

// Subclass: Developer
class Developer extends Employee {
    double hourlyRate;
    int hoursWorked;

    Developer(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calcSal() {
        return hourlyRate * hoursWorked;
    }
}

// Subclass: Intern
class Intern extends Employee {
    double stipend;

    Intern(String name, int id, double stipend) {
        super(name, id);
        this.stipend = stipend;
    }

    @Override
    double calcSal() {
        return stipend;
    }
}

// Main class
public class AbstractDemo{
    public static void main(String[] args) {
        // Create an array of Employee references
        Employee[] employees = new Employee[3];

        // Initialize with different subclass objects
        employees[0] = new Manager("Alice", 101, 80000, 15000);
        employees[1] = new Developer("Bob", 102, 50, 160);
        employees[2] = new Intern("Charlie", 103, 1000);

        // Dynamic method dispatch
        for (Employee emp : employees) {
            System.out.println("Employee: " + emp.name + " | Salary: $" + emp.calcSal());
        }
    }
}
