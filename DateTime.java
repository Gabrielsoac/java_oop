package basic;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args){
        LocalDateTime dataHora = LocalDateTime.now();

        System.out.println(dataHora.getDayOfMonth());
        System.out.println(dataHora.getMonth());
    }
}
