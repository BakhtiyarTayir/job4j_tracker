package ru.job4j.oop;

public class Builder extends Engineer {
    private int draw;

    public Builder(String name,
                   String surname,
                   String education,
                   int birthday,
                   int certificate,
                   int draw) {
        super(name, surname, education, birthday, certificate);
        this.draw = draw;
    }

    public int getDraw() {
        return draw;
    }

    public Plan drawHousePlan() {
        return null;
    }
}
