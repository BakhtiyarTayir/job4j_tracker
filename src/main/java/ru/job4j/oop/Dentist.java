package ru.job4j.oop;

public class Dentist extends Doctor {
    private int officeNumber;

    public Dentist(String name,
                   String surname,
                   String education,
                   int birthday,
                   int experience,
                   int officeNumber) {
        super(name, surname, education, birthday, experience);
        this.officeNumber = officeNumber;
    }
}
