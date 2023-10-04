package application;

import entities.Client;
import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int statusMenu = 1;

        String name;
        String surname;
        String cpf;
        Integer numberAccount;
        Double firstDeposit;

            System.out.println("Bem-vindo ao nosso banco, que bom ter você por aqui!");

            System.out.println("Para seu cadastro, são necessários alguns dados!");

            System.out.print("Nome: ");
            name = input.nextLine();

            System.out.print("Sobrenome: ");
            surname = input.nextLine();

            System.out.print("CPF: ");
            cpf = input.nextLine();

            System.out.print("Agência da sua conta: ");
            numberAccount = input.nextInt();
            input.nextLine();

            System.out.print("Valor do primeiro depósito: ");
            firstDeposit = input.nextDouble();
            input.nextLine();


            Client newClient = new Client(name, surname, cpf, numberAccount, firstDeposit);

            System.out.println("Sua conta foi criada com sucesso!\n");

            System.out.println("########################################################################");



        while (statusMenu >= 1){

            System.out.println("(1) Visualizar dados de Cadastro\n" +
                    "(2)Depositar\n" +
                    "(3)Realizar Saque\n" +
                    "(4)Registro de atividades\n" +
                    "(5)Sair\n");

            System.out.println("Escolha uma opção: ");
            statusMenu = input.nextInt();
            input.nextLine();

            switch (statusMenu){

                case(1):
                    System.out.println(newClient.toString());

                    System.out.println("Gostaria de realizar outra ação?\n");
                    System.out.println("(1) CONTINUAR\n" +
                            "(2) SAIR\n");

                    System.out.print("Opção: ");
                    int menu = input.nextInt();
                    input.nextLine();

                    if (menu == 1){
                        continue;
                    }
                    else if (menu == 2){
                        System.out.println("Obrigado por ter escolhido o nosso banco! Volte sempre :)");
                        statusMenu = 0;
                    }

                case(2):
                    System.out.println("Insira o valor de depósito: ");
                    Double valueDeposit = input.nextDouble();
                    input.nextLine();

                    newClient.deposit(valueDeposit);

                    System.out.println("Gostaria de realizar outra ação?\n");
                    System.out.println("(1) CONTINUAR\n" +
                            "(2) SAIR\n");

                    System.out.print("Opção: ");
                    menu = input.nextInt();
                    input.nextLine();

                    if (menu == 1){
                        continue;
                    }
                    else if (menu == 2) {
                        System.out.println("Obrigado por ter escolhido o nosso banco! Volte sempre :)");
                        statusMenu = 0;
                    }

                case(3):
                    System.out.println("Insira o valor de saque: ");
                    Double valueWithdraw = input.nextDouble();
                    newClient.withdraw(valueWithdraw);

                    System.out.println("Gostaria de realizar outra ação?\n");
                    System.out.println("(1) CONTINUAR\n" +
                            "(2) SAIR\n");

                    System.out.print("Opção: ");
                    menu = input.nextInt();
                    input.nextLine();

                    if (menu == 1){
                        continue;
                    }
                    else if (menu == 2) {
                        System.out.println("Obrigado por ter escolhido o nosso banco! Volte sempre :)");
                        statusMenu = 0;
                    }

                case(4):

                    newClient.getRegisterHolder();

                    System.out.println("Gostaria de realizar outra ação?\n");
                    System.out.println("(1) CONTINUAR\n" +
                            "(2) SAIR\n");

                    System.out.print("Opção: ");
                    menu = input.nextInt();
                    input.nextLine();

                    if (menu == 1){
                        continue;
                    }
                    else if (menu == 2) {
                        System.out.println("Obrigado por ter escolhido o nosso banco! Volte sempre :)");
                        statusMenu = 0;
                    }

                case(5):
                    System.out.println("Obrigado por ter escolhido o nosso banco! Volte sempre :)");
                    statusMenu = 0;

                default:
                    System.out.println("Escolha uma opção válida!\n");
                    continue;
            }
        }
    }
}
