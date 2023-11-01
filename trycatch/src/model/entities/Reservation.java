package model.entities;

import model.exceptions.DomainException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reservation {
    // Attributes
    private Integer roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;

    // Constructors
    public Reservation() {
    }

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException{
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Check-out date must be afeter check in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    //Methods Getters and Setters
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }


    public LocalDate getCheckout() {
        return checkOut;
    }


    //Methods
    public long duration(){
        Duration diff = Duration.between(checkIn.atStartOfDay(), checkOut.atStartOfDay());

        return diff.toDays();
    }

    public void updateDates(LocalDate checkin, LocalDate checkout) throws DomainException {

        LocalDate now = LocalDate.now();

        if (checkIn.isBefore(now) || checkOut.isBefore(now)) {
            throw new DomainException("Error in reservation: Reservation dates for update must be future dates!");
        }
        if (!checkOut.isAfter(checkIn)) {
            throw new DomainException("Error in reservation: check-out date must be after check-in date");
        }

        this.checkIn = checkin;
        this.checkOut = checkout;

    }

    public static DateTimeFormatter formatdefault = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public String toString(){
        return "Room: " + roomNumber
                + ", check-in: "
                + formatdefault.format(checkIn)
                + ", check-out: "
                + formatdefault.format(checkOut)
                + ", "
                + duration()
                + "nights";
    }
}
