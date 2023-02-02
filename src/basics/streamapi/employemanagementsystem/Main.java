package basics.streamapi.employemanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Employee {
    private final int id;
    private final String name;
    private final double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class EmployeeManagementSystem {
    List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void sortEmployeesBySalary() {
        employees.sort((emp1, emp2) -> Double.compare(emp2.getSalary(), emp1.getSalary()));
    }

    public double averageSalary() {
        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }

    public List<Employee> getEmployeesWithSalaryGreaterThan(double salary) {
        return employees.stream().filter(emp -> emp.getSalary() > salary).collect(Collectors.toList());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        // Add some employees to the system
        ems.addEmployee(new Employee(1, "Rishabh Gupta", 50000));
        ems.addEmployee(new Employee(2, "Abhishek vashisth", 60000));
        ems.addEmployee(new Employee(3, "Pawan Chaudhary", 70000));
        ems.addEmployee(new Employee(4, "Sudeep Roy", 80000));

        while (true) {
            System.out.println("Choose operation: ");
            System.out.println("1. Sort employees by salary");
            System.out.println("2. Calculate average salary");
            System.out.println("3. Show employees with salary greater than...");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            if (choice == 4) {
                break;
            }

            switch (choice) {
                case 1 -> {
                    ems.sortEmployeesBySalary();
                    System.out.println("Employees sorted by salary: ");
                    for (Employee employee : ems.employees) {
                        System.out.println(employee);
                    }
                }
                case 2 -> {
                    double avgSalary = ems.averageSalary();
                    System.out.println("Average salary: " + avgSalary);
                }
                case 3 -> {
                    System.out.println("Enter minimum salary: ");
                    double minSalary = sc.nextDouble();
                    List<Employee> employeesWithSalaryGreaterThan = ems.getEmployeesWithSalaryGreaterThan(minSalary);
                    System.out.println("Employees with salary greater than " + minSalary + ": ");
                    for (Employee employee : employeesWithSalaryGreaterThan) {
                        System.out.println(employee);
                    }
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
        sc.close();
    }
}
