package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("bakhtiyarTayirov@gmail.com", "Bakhtiyar Tayirov");

        for (String key : hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        }
    }
}
