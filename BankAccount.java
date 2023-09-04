package learning_oop.bank;

import java.util.Scanner;

public class BankAccount {
    Scanner input = new Scanner(System.in);
    private int numberBank_account;
    private String nameHolder_account;
    private double balance;
    public static final double withDrawTax = 5.00;

    public BankAccount(int numberBank_account, String nameHolder_account, double initialDeposit){ //constructor with all attributes
        this.nameHolder_account = nameHolder_account;
        this.numberBank_account = numberBank_account;
        depositMoney(initialDeposit);
    }
    public BankAccount(int numberBank_account, String nameHolder_account){ // Constructor without balance
        this.nameHolder_account = nameHolder_account;
        this.numberBank_account = numberBank_account;
    }
    public int getNumberBank_account() {
        return numberBank_account;
    }
    public String getNameHolderAccount() {
        return nameHolder_account;
    }
    public void setNameHolderAccount(String new_name){
        this.nameHolder_account = new_name;
        System.out.printf("Name holder account apdate as %s\n", new_name);
    }
    public double getBalance() {
        return balance;
    }
    public void depositMoney(double depositValue){
        this.balance += depositValue;
        System.out.printf("New balance update as: %.2f\n", getBalance());
    }
    public void depositMoney(){
        double valueMoney = input.nextDouble();
        this.balance += valueMoney;
        System.out.printf("New balance update as: %.2f\n", getBalance());
    }
    public void withdrawMoney(){
        double valueMoney = input.nextDouble();
        this.balance = balance - withDrawTax - valueMoney;

        System.out.println("Tax value:" + withDrawTax);
        System.out.printf("New balance update as: %.2f\n", getBalance());
    }
    public void withdrawMoney(double withDrawValue){

        this.balance = balance - withDrawTax - withDrawValue;

        System.out.println("Tax value:" + withDrawTax);
        System.out.printf("New balance update as: %.2f", getBalance());

    }
    public String toString(){
        return String.format("Name: %s\n", getNameHolderAccount())
                + String.format("Balance: %.2f\n", getBalance())
                + String.format("Number Account: %d\n", getNumberBank_account());
    }
}
