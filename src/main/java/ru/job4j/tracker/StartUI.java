package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    Item item = new Item();
    LocalDateTime localDateTime = item.getCreated();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
    String currentDateTime = localDateTime.format(formatter);
    System.out.println(currentDateTime);
}
