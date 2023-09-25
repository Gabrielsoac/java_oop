package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String departmentName = input.nextLine();
        System.out.println("Enter the Worker Data:");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Enter Level: ");
        String workerLevel = input.nextLine();
        System.out.print("Enter the base Salary: ");
        Double baseSalary = input.nextDouble();
        input.nextLine();

        Worker worker = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this Worker: ");
        int numberContracts = input.nextInt();
        input.nextLine();

        DateTimeFormatter formatDateBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (int i =0; i < numberContracts; i++){

            System.out.printf("CONTRACT %d\n", i);
            System.out.println("Enter Date Contract : (DD/MM/YYYY): ");
            String dataString = input.nextLine();
            LocalDate dataDate = LocalDate.parse(dataString, formatDateBR);

            System.out.print("Enter the value perHour: ");
            Double valuePerHour = input.nextDouble();
            input.nextLine();

            System.out.print("Enter the Duration Hours: ");
            int hoursDuration = input.nextInt();
            input.nextLine();

            HourContract contract = new HourContract(dataDate, valuePerHour, hoursDuration);
            worker.addContract(contract);
        }

        System.out.println("Enter mouth and Year to calculate income: ");
        String monthAndYear = input.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name:" + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income For: " + monthAndYear + String.format(" Date and Value: %.2f", worker.income(year, month)));



        input.close();
    }
}
