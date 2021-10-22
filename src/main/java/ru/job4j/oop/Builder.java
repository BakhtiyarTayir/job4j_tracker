package ru.job4j.oop;

public class Builder extends Engineer{
    private int Draw;

    public Builder(String name, String surname, String education, int birthday, int certificate) {
        super(name, surname, education, birthday, certificate);
    }

    public int getDraw() {
        return Draw;
    }

    public Plan drawHousePlan(){return null;}
}
