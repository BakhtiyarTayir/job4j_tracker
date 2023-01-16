package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        String s = System.lineSeparator();
       if (position == 1) {
           System.out.println("Пусть бегут неуклюже"
                    + s + "Пешеходы по лужам,"
                    + s + "А вода по асфальту рекой."
                    + s + "И неясно прохожим"
                    + s + "В этот день непогожий,"
                    + s + "Почему я веселый такой?");
       } else if (position == 2) {
           System.out.println("Спят усталые игрушки, книжки спят."
                   + s + "Одеяла и подушки ждут ребят."
                   + s + "Даже сказка спать ложится,"
                   + s + "Чтобы ночью нам присниться."
                   + s + "Ты ей пожелай:"
                   + s + "Баю-бай.");
       } else {
           System.out.println("Песня не найдена");
       }
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        System.out.println("");
        jukebox.music(2);
        System.out.println("");
        jukebox.music(3);
    }
}
