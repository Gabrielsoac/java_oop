package basic;

import java.util.Locale;
import java.util.Scanner;

public class pensionato {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Rent[] rooms = new Rent[10];
        int numeroQuartos;

        System.out.println("Insira quantos quartos gostaria de alugar: ");
        numeroQuartos = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numeroQuartos; i++){
            System.out.println("Cadastro N°" + i);

            System.out.println("Insira o nome:");
            String name = input.nextLine();

            System.out.println("Insira o Email:");
            String email = input.next();

            System.out.println("Qual quarto deseja alugar? Escolha um numero de 0 a 9!");
            int room = input.nextByte();
            input.nextLine();

            rooms[room] = new Rent(name, email);
        }
        for (int i = 0; i < 10; i++){
            if (rooms[i] != null){
                System.out.println("Room #" + i + " : " + rooms[i]);
            }
        }
    }
}

