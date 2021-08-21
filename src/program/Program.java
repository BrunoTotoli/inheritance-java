package program;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        System.out.println("Enter the number of employees: ");
        int numberOfEmployees = in.nextInt();
        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.println("Outsourced (y/n)? ");
            String a = in.next();
            System.out.println("Name: ");
            String name = in.next();
            System.out.println("Hours: ");
            Integer hours = in.nextInt();
            System.out.println("Value per hour: ");
            Double valuerPerHour = in.nextDouble();
            Employee employee = new Employee(name, hours, valuerPerHour);
            if (a.equals("y")) {
                System.out.println("Additional charge: ");
                Double additionalCharge = in.nextDouble();
                Employee outsourcedEmployee = new OutsourcedEmployee(name, hours, valuerPerHour, additionalCharge);
                list.add(outsourcedEmployee);
            } else {
                list.add(employee);
            }
        }
        System.out.println("PAYMENTS: ");
        for (Employee a : list) {
            System.out.println(a);
        }
    }
}
