public class EmployeeManagement {
    private Employee[] employees;
    private int count;
    public EmployeeManagement(int size){
        employees=new Employee[size];
        count=0;
    }
    public void addEmployee(Employee employee){
        if (count==employees.length){
            System.out.println("Employee array is full.");
            return;
        }
        employees[count]=employee;
        count++;
        System.out.println("Employee Added Successfully.");
    }
    public Employee searchEmployee(int id){
        for (int i=0; i<count; i++){
            if(employees[i].getEmployeeId()==id){
                return employees[i];
            }
        }
        return null;
    }
    public void displayEmployees(){
        System.out.println("Employee Records:");
        System.out.println("ID\tName\tPosition\tSalary");
        for (int i=0; i<count; i++){
            employees[i].display();
        }
    }
    public void deleteEmployee(int id){
        int index=-1;
        for(int i=0; i<count; i++){
            if(employees[i].getEmployeeId()==id){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("Employee Not Found.");
            return;
        }
        for(int i=index; i<count; i++){
            employees[i]=employees[i+1];
        }
        employees[count-1]=null;
        count--;
        System.out.println("Employee Deleted Successfully.");
    }
}
