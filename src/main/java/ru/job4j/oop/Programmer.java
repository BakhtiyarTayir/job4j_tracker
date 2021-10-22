package ru.job4j.oop;

public class Programmer extends Engineer{
    private String[] language;

    public Programmer(String name, String surname, String education, int birthday, int certificate, String[] language) {
        super(name, surname, education, birthday, certificate);
        this.language = language;
    }

    public String[] getLanguage() {
        return language;
    }

    public Program createProgramm(){
        return null;
    }
}