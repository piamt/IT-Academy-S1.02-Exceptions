package org.example;

import org.example.Exceptions.FreeSeatException;
import org.example.Exceptions.OccupiedSeatException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SeatManagement {

    private List<Seat> seats;

    public SeatManagement() {
        seats = new ArrayList<>();
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void addSeat(Seat seat) throws OccupiedSeatException {
        if (checkSeat(seat.getRow(), seat.getNumber()) > -1) {
            throw new OccupiedSeatException("Seat occupied. Try with another seat.");
        } else {
            seats.add(seat);
        }
    }

    public void removeSeat(int row, int seat) throws FreeSeatException {
        if (checkSeat(row, seat) == -1) {
            throw new FreeSeatException("Seat is not occupied yet.");
        } else {
            seats.removeIf(x -> x.equals(new Seat(row, seat, "")));
        }
    }

    public int checkSeat(int row, int seat) {
        Optional<Seat> foundSeat = seats.stream().filter(x -> x.equals(new Seat(row, seat, ""))).findFirst();
        return foundSeat.map(value -> seats.indexOf(value)).orElse(-1);
    }

    public List<Seat> getSeats(String person) {
        return seats.stream().filter(x -> x.fromPerson(person)).toList();
    }

    public List<String> getALlReservedSeats() {
        return seats.stream().map(Seat::toString).toList();
    }
}
