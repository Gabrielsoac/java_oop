package basic;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class matrizTest {
    public static void main(String[] args){
        //settings
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int[][] matriz;
        int lines;
        int colums;

        System.out.println("Enter quantity lines:");
        lines = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter quantity colums");
        colums = sc.nextInt();
        sc.nextLine();

        matriz = new int[lines][colums];

        for (int i = 0; i < lines; i++){
            for (int j = 0; j < colums; j++){
                System.out.printf("Enter the value to line %d, colum %d: ", i, j);
                matriz[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }

        System.out.println("Which number would you like to search?");
        int numberSearch = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < lines; i++){
            for (int j = 0; j < colums; j++){
                if (matriz[i][j] == numberSearch){
                    System.out.printf("Number Localization: Line: %d, Column: %d\n", i, j);
                    if (i < lines - 1){
                        System.out.printf("Down: %d\n", matriz[i+1][j]);
                    }
                    if(i > 0){
                        System.out.printf("Up: %d\n", matriz[i - 1][j]);
                    }
                    if (j > 0) {
                        System.out.printf("Left: %d\n", matriz[i][j - 1]);
                    }
                    if (j < lines - 1) {
                        System.out.printf("Right: %d\n", matriz[i][j + 1]);
                    }
                }
            }
        }
    }
}
