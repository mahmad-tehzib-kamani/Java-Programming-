import java.util.Scanner;
// Parent class
class User {
    int id;
    String name;
    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
// Child class
class Employee extends User {
    double salary; 

    Employee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }
    double calculateAnnualSalary() {
        return salary * 12;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Id: ");
        int id = sc.nextInt();
        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print("Enter Monthly Salary: ");
        double salary = sc.nextDouble();
        Employee emp = new Employee(id, name, salary);
        System.out.println("Annual Salary of " + emp.name + " is: " 
                            + emp.calculateAnnualSalary());

        sc.close();
    }
}
