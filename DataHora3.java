package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora3 {
    public static void main(String[] args){
        LocalDate diaData = LocalDate.parse("2023-09-14");
        LocalDateTime diaDataHora = LocalDateTime.parse("2023-09-14T16:36:15");
        Instant diaDataHoraZ = Instant.parse("2023-09-14T17:00:38Z");

        DateTimeFormatter formatInstant = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm").withZone(ZoneId.of("Portugal"));


        LocalDateTime result0 = LocalDateTime.ofInstant(diaDataHoraZ, ZoneId.systemDefault());
        LocalDateTime result1 = LocalDateTime.ofInstant(diaDataHoraZ, ZoneId.of("Portugal"));
        System.out.println(formatInstant.format(diaDataHoraZ)+" in Brazil at "+result0);
        System.out.println(formatInstant.format(diaDataHoraZ)+" in Portugal at"+result1);

    }
}
