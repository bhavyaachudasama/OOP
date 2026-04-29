import java.util.Scanner;

public class Employee {

    
    private String employeeName;
    private double employeeSalary;

    
    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        employeeSalary = sc.nextDouble();
    }

    
    public void displayEmployeeData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }

    
    public static void main(String[] args) {

        
        Employee emp = new Employee();

        
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}