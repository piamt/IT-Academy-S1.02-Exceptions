package org.example;

import org.example.Exceptions.IncorrectMenuOptionException;

public class Cine {

    private int numberOfRows;
    private int numberOfSeats;
    CineManagement cineManagement;
    SeatManagement seatManagement;

    public Cine() {
        askForInitialData();
        cineManagement = new CineManagement(this);
        seatManagement = new SeatManagement();
    }

    private void askForInitialData() {
        this.numberOfRows = Entry.readInt("Enter number of rows");
        this.numberOfSeats = Entry.readInt("Enter number of seats per each row");
    }

    public int getNumberOfRows() {
        return this.numberOfRows;
    }

    public int getNumberOfSeats() {
        return this.numberOfSeats;
    }

    public void initiate() {
        boolean close = false;
        int selectedMenuOption = -1;

        do {
            try {
                selectedMenuOption = cineManagement.menu();
            } catch (IncorrectMenuOptionException e) {
                System.out.println(e.getMessage());
            }

            switch (selectedMenuOption) {
                case 1:
                    cineManagement.showAllReservedSeats();
                    break;
                case 2:
                    cineManagement.showSeatsForPerson();
                    break;
                case 3:
                    cineManagement.reserveSeat();
                    break;
                case 4:
                    cineManagement.cancelSeat();
                    break;
                case 5:
                    cineManagement.cancelPerson();
                    break;
                case 0:
                    close = true;
                    break;
                default: break;
            }
        } while (!close);
    }
}
