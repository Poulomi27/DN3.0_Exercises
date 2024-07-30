import java.util.ArrayList;

public class EmployeeMS {
    private ArrayList<Employee> employees;

    public EmployeeMS() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee details added successfully");
    }

    public Employee searchEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmployeeId() == employeeId) {
                employees.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Create an EmployeeManagementSystem instance
        EmployeeMS ems = new EmployeeMS();

        // Add employees
        ems.addEmployee(new Employee(1, "John Doe", "Developer", 50000));
        ems.addEmployee(new Employee(2, "Jane Smith", "Manager", 70000));

        // Traverse employees
        System.out.println("\n Employees:");
        ems.traverseEmployees();

        // Search for an employee
        System.out.println("\n Searching for Employee");
        Employee employee = ems.searchEmployee(1);
        if (employee != null) {
            System.out.println("Employee found: " + employee);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee
        System.out.println("\n Deleting an  Employee details");
        boolean success = ems.deleteEmployee(1);
        if (success) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }

        // Traverse employees again to see changes
        System.out.println("\n Employees after deletion:");
        ems.traverseEmployees();
    }
}
