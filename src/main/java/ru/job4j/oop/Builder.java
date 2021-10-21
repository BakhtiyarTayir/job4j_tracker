package ru.job4j.oop;

public class Builder extends Engineer{
    public Builder(String name, String surname, String education, int birthday) {
        super(name, surname, education, birthday);
    }

    public Builder(String name, String surname, String education, int birthday, int certificate) {
        super(name, surname, education, birthday, certificate);
    }

    public Plan drawHousePlan(){return null;}
}
