package ru.job4j.oop;

public class Surgeon extends Doctor {
    private int operationCount;

    public Surgeon(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public Surgeon(String name, String surname, String education, int birthday, int experience) {
        super(name, surname, education, birthday, experience);
    }

    public Surgeon(String name, String surname, String education, int birthday, int experience, int operationCount) {
        super(name, surname, education, birthday, experience);
        this.operationCount = operationCount;
    }

    public String DoSurgery(){return null;}
}
