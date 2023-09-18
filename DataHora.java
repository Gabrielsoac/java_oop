package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args){
        LocalDate day01 = LocalDate.now();
        LocalDateTime day02 = LocalDateTime.now();
        Instant day03 = Instant.now();
        LocalDate day04 = LocalDate.parse("2023-09-12");
        LocalDateTime day05 = LocalDateTime.parse("2023-09-12T09:35:59");
        Instant day06 = Instant.parse("2023-09-22T09:40:59Z");
        Instant day07 = Instant.parse("2023-09-22T09:40:59-03:00");
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate day08 = LocalDate.parse("20/07/2000", formato1);
        LocalDate day09 = LocalDate.parse("20/07/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate day10 = LocalDate.of(2023, 9, 12);
        LocalDateTime day11 = LocalDateTime.of(2023, 9, 12, 10,20, 35);

        System.out.println(day01);
        System.out.println(day02);
        System.out.println(day03);
        System.out.println(day04);
        System.out.println(day05);
        System.out.println(day06);
        System.out.println(day07);
        System.out.println(day08);
        System.out.println(day09);
        System.out.println(day10);
        System.out.println(day11);
    }
}