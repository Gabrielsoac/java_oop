package basic;

import java.util.Scanner;

public class hello_world {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.printf("Hello %s, welcome the World Java, language with Object Oriented Programming! :)", name);
    }
}