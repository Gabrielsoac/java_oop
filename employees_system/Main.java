package employee_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean menu = true;

        Menu_main menu_main = new Menu_main();
        Scanner input = new Scanner(System.in);


        int quantity_employees = 0;

        while (menu = true) {

            menu_main.menu_main();

            System.out.print("Enter the option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("How many employees do you want to add?");
                    break;
                case 2:
                    System.out.println("Consult here");
                    break;

                case 3:
                    System.out.println("update here");
                    break;
                case 4:
                    System.out.println("Close here");
                    break;

            }
        }
    }
}
