package application;

import model.entities.Reservation;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        //Declarando scanner e formato da data padrao
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatdefault = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //dados iniciais

        try {
            System.out.println("Room number: ");
            int roomNumber = input.nextInt();
            input.nextLine();

            System.out.println("Check-in date (dd/MM/yyyy): ");
            LocalDate checkIn = LocalDate.parse(input.next(), formatdefault);


            System.out.println("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOut = LocalDate.parse(input.next(), formatdefault);

            //instanciando objeto reserva
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println(reservation);

            //atualizando reserva
            System.out.println("Atualizar check-in and check-out: ");

            System.out.println("New Room number: ");
            roomNumber = input.nextInt();
            input.nextLine();

            System.out.println("New Check-in date (dd/MM/yyyy): ");
            checkIn = LocalDate.parse(input.next(), formatdefault);


            System.out.println("New Check-out date (dd/MM/yyyy): ");
            checkOut = LocalDate.parse(input.next(), formatdefault);

            //instanciando atualização da reserva
            reservation.updateDates(checkIn, checkOut);

        }
        catch (DomainException error) {
            System.out.println("Error in resertavion" + error.getMessage());
        }
        catch (InputMismatchException error){
            System.out.println("Por favor, digite um valor válido!");
        }
    }
}

