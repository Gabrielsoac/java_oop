package entities;
import java.time.LocalDateTime;
import entities.enums.StatusOperation;
import entities.enums.TypeOperation;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gabriel
 */
public class Register {
    private LocalDateTime dateTime;
    private Double value;
    private StatusOperation status;
    private TypeOperation type; 

    public Register(LocalDateTime dateTime, Double value, StatusOperation status, TypeOperation type) {
        this.dateTime = dateTime;
        this.value = value;
        this.status = status;
        this.type = type;
    }
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    @Override
    public String toString() {
        return type + "\n" + "Horário: " + dateTime.format(formato) + "\n" + "Valor: " + value + "\n"+ "STATUS: " + status;
    }
}
