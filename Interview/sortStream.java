package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", department=" + department + ", salary=" + salary + "]";
    }

}

public class sortStream {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Areeb", "It", 90000),
                new Employee("Ilma", "Hr", 50000),
                new Employee("Arman", "It", 80000),
                new Employee("Ram", "Hr", 70000),
                new Employee("Sona", "Hr", 66000));

        List<Employee> hrEmpList = employees.stream().filter(emp -> "Hr".equalsIgnoreCase(emp.getDepartment()))
                .collect(Collectors.toList());

        double avgHrSalary = hrEmpList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println("Average Salary of Hr depart ment :"+avgHrSalary);

    }

}
