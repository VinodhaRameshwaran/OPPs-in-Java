import java.util.Scanner;
import employee.Employee;

public class Main5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);

        System.out.println("\nEmployee Details");
        emp.displayEmployee();

        sc.close();
    }
}