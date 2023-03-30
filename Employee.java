public class Employee {


    private String firstName;
    private String lastName;
    private String department;
    private int salary;
    private int yearsOfService;
    private int employeeId;


    Employee(String firstName, String lastName, String department, int salary, int yearsOfService, int employeeId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        this.employeeId = employeeId;
    }

    @Override
    public String toString(){
        String empInfo = "";

        empInfo = "First Name: " + firstName + " | Last Name: " + lastName + " | Department: " + department + " | Salary: " + salary + " | Years of Service: " + yearsOfService + " | EmployeeID: " + employeeId;

        return empInfo;
    }

    public int getEmployeeId(){
        return this.employeeId;
    }
}
