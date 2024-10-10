package org.example;

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

    public boolean equals(int row, int seat) {
        return (this.row == row && this.number == seat);
    }

    public boolean fromPerson(String person) {
        return this.person.equals(person);
    }

    @Override
    public String toString() {
        return "Row:" + row + ", Seat:" + number + ", Person:" + person;
    }
}
