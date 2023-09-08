package employee_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //set default
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> listEmployee = new ArrayList<>();

        System.out.println("how many employee will be registered?");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++){
            System.out.println("Enter data Employee #" + i + ':');

            System.out.print("ID: ");
            Integer id = input.nextInt();
            input.nextLine();

            System.out.print("Name: ");
            String name = input.nextLine();


            System.out.print("Salary: ");
            Double salary = input.nextDouble();

            Employee emp = new Employee(id, name, salary);

            listEmployee.add(emp);
        }

    }
}

