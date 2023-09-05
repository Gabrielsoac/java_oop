package basic;

import java.util.Locale;
import java.util.Scanner;

public class fixed_array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter the n peoples: ");
        int n = input.nextInt();

        String[] name = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Enter the dates pearson %d\n", i);
            System.out.println("Name: ");
            name[i] = input.next();
            System.out.println("Idade: ");
            idade[i] = input.nextInt();
            System.out.println("Altura: ");
            altura[i] = input.nextDouble();
        }
        double alturaTotal = 0;
        for (int i = 0; i < n; i++){
           alturaTotal += altura[i];
        }
        alturaTotal /= n;
        System.out.printf("A altura média é: %.2f\n",alturaTotal);

        int cont_menor16 = 0;
        for (int i = 0; i < n; i++){
            if (idade[i] < 16){
                cont_menor16 += 1;
            }
        }
        double porcentMenos16 = (100.0 / n) * cont_menor16;
        System.out.printf("A porcentagem de pessoas com menos de 16 anos é de: %.2f%%\n", porcentMenos16);
    }
}
