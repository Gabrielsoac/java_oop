package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Employee;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> funcionarios = new ArrayList<Employee>();

        System.out.println("Enter the quantity employee: ");
        int numberEmployee = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberEmployee; i++){
            System.out.println("Enter name:");
            String nome = sc.nextLine();

            System.out.println("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            Employee funcionario = new Employee(id, nome, salary);
            funcionarios.add(funcionario);
        }
        System.out.println(funcionarios);
    }
}