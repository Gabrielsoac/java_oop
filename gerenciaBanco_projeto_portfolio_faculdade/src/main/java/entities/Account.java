package entities;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import entities.enums.StatusOperation;
import entities.enums.TypeOperation;
/**
 *
 * @author gabriel
 */
public class Account {
    private Integer number_account;
    private Double balance;
    private LocalDateTime dateTimeCreateAccount;
    private List<Register> registerAccount = new ArrayList();

    public Account() {
    }

    public Account(Integer number_account, Double balance) {
        this.number_account = number_account;
        this.balance = balance;
        this.dateTimeCreateAccount = LocalDateTime.now();
    }

    public Integer getNumber_account() {
        return number_account;
    }

    public void setNumber_account(Integer number_account) {
        this.number_account = number_account;
    }

    private Double getBalance() {
        return balance;
    }
    
    public String consultBalance(){
        StringBuilder stringFormatted = new StringBuilder();
        
        stringFormatted.append("Balance: ").append(getBalance()).append("\n");
        
        return stringFormatted.toString();
    }
    
    public String deposit(Double value){
        LocalDateTime time = LocalDateTime.now();
        StringBuilder stringFormatted = new StringBuilder();
        
        balance += value;
        
        Register register = new Register(time, value, StatusOperation.DONE, TypeOperation.DEPOSIT);
        
        registerAccount.add(register);
        stringFormatted.append("New balance: " + getBalance() + "\n" + time);
        
        
        return stringFormatted.toString();
    }
    public String withdraw(Double value){
        LocalDateTime time = LocalDateTime.now();
        StringBuilder stringFormatted = new StringBuilder();
        
        Register register = new Register(time, value, StatusOperation.DONE, TypeOperation.WITHDRAW);
        
        registerAccount.add(register);
        
        balance -= value;
        
         stringFormatted.append("New balance: " + getBalance() + "\n" + time);
         
         return stringFormatted.toString();
       
    }
    public void getRegister(){
        if (registerAccount.size() == 0){
            System.out.println("Ainda não há nenhum registro de atividades em sua conta!\n");
        }
        for (Register register: registerAccount) {
            System.out.println(register);
        }
    }

    @Override
    public String toString() {
        return "\nNúmero da conta: " + number_account + "\n" +
                "Saldo: " + balance + "\n" +
                "Data da criação da conta: " + dateTimeCreateAccount.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }
}
