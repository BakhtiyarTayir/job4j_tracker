package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime localDateTime = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTime = localDateTime.format(formatter);
        System.out.println(currentDateTime);

        Item item1 = new Item("Andrei");
        System.out.println(item1);
    }
}
