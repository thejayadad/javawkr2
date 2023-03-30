import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class Job {


    public static void main(String[] args) {
        //CRUD OPERATIONS WITH EMPLOYEE DATABASE
        Scanner scan = new Scanner(System.in);
        List<Employee> employee = new ArrayList<Employee>();

        int num;

        do{
            System.out.println("====WELCOME TO JOB DAY====");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. See All Employees");
            System.out.println("4. Update Employee");
            System.out.println("5. Search Employee");

            System.out.println("Please enter your choice: ");
            num = scan.nextInt();

            switch(num){
                case 1:
                    System.out.println("Please enter the First Name");
                    String fName = scan.next();
                    System.out.println("Please enter the Last Name");
                    String lName = scan.next();
                    System.out.println("Please enter the Department");
                    String dep = scan.next();
                    System.out.println("Please enter the Salary");
                    int sal = scan.nextInt();
                    System.out.println("Please enter the Years of Service");
                    int yOs = scan.nextInt();
                    System.out.println("Please enter the Employee Id");
                    int eeID = scan.nextInt();

                    employee.add(new Employee(fName, lName, dep, sal, yOs, eeID));
                    break;

                case 2:
                    boolean found = false;
                    System.out.println("Please enter the EEID to be removed");
                    int eEiD = scan.nextInt();
                    System.out.println("===================================");
                    Iterator<Employee> e = employee.iterator();
                    e = employee.iterator();
                    while(e.hasNext()){
                        Employee emp = e.next();
                        if(emp.getEmployeeId() == eEiD){
                            found = true;
                            System.out.println("Employee Record Removed");
                            e.remove();
                        }
                        System.out.println("===================================");

                        if(!found){
                            System.out.println("Record Note Found");
                        }
                    }
                    break;
                case 3:
                System.out.println("===================================");
                e = employee.iterator();
                while(e.hasNext()){
                    Employee emp = e.next();
                    System.out.println(emp);
                }
                System.out.println("===================================");
                break;

                case 4:
                    found = false;
                    System.out.println("Please enter the EEID to be updated");
                    eEiD = scan.nextInt();
                    System.out.println("===================================");
                    ListIterator<Employee> li = employee.listIterator();
                    while(li.hasNext()){
                        Employee e = li.next();
                        if(e.getEmployeeId() == eeID){
                            
                        }
                    }

            }


        } while (num !=0);
    }
}
