class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class SalaryIncrementThread extends Thread {
    private Employee employee;

    public SalaryIncrementThread(Employee employee) {
        this.employee = employee;
    }

    public void run() {
        double incrementedSalary = employee.getSalary() * 0.05;
        double salary1 = incrementedSalary+employee.getSalary();
        employee.setSalary(salary1);
        System.out.println("Salary of " + employee.getName() + " incremented to: " + salary1);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class practical6_2 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Dhruv", 50000.0);
        employees[1] = new Employee("Nikunj", 60000.0);
        employees[2] = new Employee("Soham", 70000.0);
        employees[3] = new Employee("Nitya", 80000.0);
        employees[4] = new Employee("Jenil", 90000.0);

        for (Employee employee : employees) {
            SalaryIncrementThread thread = new SalaryIncrementThread(employee);
            thread.start();
        }
    }
}