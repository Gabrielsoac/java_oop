package entities;
/**
 *
 * @author gabriel
 */
public class Client {
    private String name;
    private String surname;
    private String cpf; 
    private Account holderAccount;
    
    
    public Client(){
        
    }
    public Client(String name, String surname, String cpf, Integer numberAccount, Double firstDeposit){
        this.name = name;
        this.surname = surname;
        this.cpf = cpf;
        this.holderAccount = new Account(numberAccount, firstDeposit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void deposit(Double value){
        holderAccount.deposit(value);
    }
    public void withdraw(Double value){
        holderAccount.withdraw(value);
    }
    public void getRegisterHolder(){
        holderAccount.getRegister();
    }

    @Override
    public String toString() {
        return "Nome: " + name +" "+ surname + "\n" + "CPF: " + cpf + "\n" + "Dados da conta: " + holderAccount + "\n";
    }
}
