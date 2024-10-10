package org.example;

import org.example.Exceptions.*;

import java.util.ArrayList;
import java.util.List;

public class CineManagement {

    private Cine cine;

    public CineManagement(Cine cine) {
        this.cine = cine;
    }

    public int menu() throws IncorrectMenuOptionException {
        System.out.println(
                "Menú:" +
                        "\n1.- Mostrar totes les butaques reservades. " +
                        "\n2.- Mostrar les butaques reservades per una persona. " +
                        "\n3.- Reservar una butaca. " +
                        "\n4.- Anul·lar la reserva d’una butaca. " +
                        "\n5.- Anul·lar totes les reserves d’una persona. " +
                        "\n0.- Sortir."
        );

        int menuOption = Entry.readInt("Select a menu option between 0 and 5");
        if (menuOption < 0 || menuOption > 5) throw new IncorrectMenuOptionException("Menu option should be between 0 and 5.");
        else return menuOption;
    }

    public void reserveSeat() {
        try {
            int row = readRow();
            int seat = readSeat();
            String person = readName();
            cine.seatManagement.addSeat(new Seat(row, seat, person));
        } catch (IncorrectNameException|IncorrectRowException|IncorrectNumberException|OccupiedSeatException e) {
            System.out.println(e.getMessage());
        }
    }

    public void cancelSeat() {
        try {
            int row = readRow();
            int seat = readSeat();
            cine.seatManagement.removeSeat(row, seat);
        } catch (FreeSeatException|IncorrectRowException|IncorrectNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public void cancelPerson() {
        String person = null;
        List<Seat> seatsToRemove; //= new ArrayList<>();
        try {
             person = readName();
        } catch (IncorrectNameException e) {
            System.out.println(e.getMessage());
        } finally {
            seatsToRemove = cine.seatManagement.getSeats(person);
        }

        seatsToRemove.forEach(x -> {
            try {
                cine.seatManagement.removeSeat(x.getRow(), x.getNumber());
            } catch (FreeSeatException e) {
                System.out.println(e.getMessage());
            }
        });
    }

    public void showSeatsForPerson() {
        String person = Entry.readString("Enter your name and surname:");
        cine.seatManagement.getSeats(person).forEach(System.out::println);
    }

    public void showAllReservedSeats() {
        cine.seatManagement.getALlReservedSeats().forEach(System.out::println);
    }

    private String readName() throws IncorrectNameException {
        String person = Entry.readString("Enter your name and surname:");
        if (checkContainsNumbers(person)) {
            throw new IncorrectNameException("Incorrect name, it contains numbers.");
        } else {
            return person;
        }
    }

    private int readRow() throws IncorrectRowException {
        int row = Entry.readInt("Enter number of row:");
        if (row <= cine.getNumberOfRows() && row > 0) {
            return row;
        } else {
            throw new IncorrectRowException("Introduced row is out of range.");
        }
    }

    private int readSeat() throws IncorrectNumberException {
        int seat = Entry.readInt("Enter number of seat:");
        if (seat <= cine.getNumberOfSeats() && seat > 0) {
            return seat;
        } else {
            throw new IncorrectNumberException("Introduced seat is out of range.");
        }
    }

    private boolean checkContainsNumbers(String input) {
        return input.matches(".*\\d.*");
    }
}
