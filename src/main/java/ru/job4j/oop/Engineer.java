package ru.job4j.oop;

public class Engineer extends Profession{
    private int certificate;

    public Engineer(String name, String surname, String education, int birthday, int certificate) {
        super(name, surname, education, birthday);
        this.certificate = certificate;
    }

    public int getCertificate() {
        return certificate;
    }
}
