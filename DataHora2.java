package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DataHora2 {
    public static void main(String[] args){

        LocalDate diaData = LocalDate.parse("2023-09-14");
        LocalDateTime diaDataHora = LocalDateTime.parse("2023-09-14T16:36:15");
        Instant diaDataHoraZ = Instant.parse("2023-09-14T17:00:38Z");

       // DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyy");
       // DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       // DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd MM yyyy HH:mm");
        DateTimeFormatter formato4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

       // System.out.println("dia = "+ diaDataHora.format(formato3));
       // System.out.println("dia = "+ formato1.format(diaData));

        System.out.println("Dia formatado: "+ diaData.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Dia com hora: "+ diaDataHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("Dia com data-hora GMT UTC ZULU: "+ formato4.format(diaDataHoraZ));

    }
}
