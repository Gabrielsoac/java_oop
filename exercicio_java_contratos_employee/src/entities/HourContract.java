package entities;
import java.time.LocalDate;
import java.util.Date;
public class HourContract {
    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(){
    }
    public HourContract(LocalDate date, Double valuePerHour, Integer hours){
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public LocalDate getDate() {
        return date;
    }

    public double totalValue(){
        return valuePerHour * hours;
    }

    @Override
    public String toString() {
        return "HourContract{" +
                "date=" + date +
                ", valuePerHour=" + valuePerHour +
                ", hours=" + hours +
                '}';
    }
}
