public class Main {
    public static void main(String[] args) {
        EmployeeManagement manager = new EmployeeManagement(10);
        manager.addEmployee(new Employee(101, "Aayushi", "Manager", 70000));
        manager.addEmployee(new Employee(102, "Rahul", "Developer", 55000));
        manager.addEmployee(new Employee(103, "Sneha", "Tester", 45000));
        manager.addEmployee(new Employee(104, "Rohan", "Designer", 50000));
        manager.displayEmployees();
        System.out.println("Searching Employee with ID 102");
        Employee emp=manager.searchEmployee(102);
        if (emp!=null)
            emp.display();
        else
            System.out.println("Employee Not Found.");
        System.out.println();
        manager.deleteEmployee(103);
        manager.displayEmployees();
    }
}
