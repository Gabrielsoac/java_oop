package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args){
        // settings
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter the length Matriz: ");
        int lengthMatriz = sc.nextInt();
        sc.nextLine();

        int[][] matriz = new int[lengthMatriz][lengthMatriz];

        for (int i = 0; i < lengthMatriz; i++){
            for (int j = 0; j < lengthMatriz; j++){
                System.out.printf("Enter the value line %d column %d: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Main Diagonal: ");
        for (int i= 0; i < lengthMatriz; i++){
            for (int j = 0; j < lengthMatriz; j++){
                if (i == j){
                    System.out.println(matriz[i][j]);
                }
            }
        }
        List<Integer> negativeList = new ArrayList<>();
        for (int i= 0; i < lengthMatriz; i++){
            for (int j = 0; j < lengthMatriz; j++) {
                if (matriz[i][j] < 0){
                    negativeList.add(matriz[i][j]);
                }
            }
        }
        System.out.printf("Negative numbers = %d \n", negativeList.size());
        System.out.println(negativeList);
    }
}

