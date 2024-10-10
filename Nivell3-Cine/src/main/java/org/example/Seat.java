package org.example;

import java.util.Objects;

public class Seat {

    private int row;
    private int number;
    private String person;

    public Seat(int row, int number, String person) {
        this.row = row;
        this.number = number;
        this.person = person;
    }

    public int getRow() {
        return row;
    }

    public int getNumber() {
        return number;
    }

    public String getPerson() {
        return person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seat seat = (Seat) o;
        return getRow() == seat.getRow() && getNumber() == seat.getNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRow(), getNumber());
    }

    public boolean fromPerson(String person) {
        return this.person.equals(person);
    }

    @Override
    public String toString() {
        return "Row:" + row + ", Seat:" + number + ", Person:" + person;
    }
}
