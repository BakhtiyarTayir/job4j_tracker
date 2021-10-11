package ru.job4j.oop;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int maxNumber = max(second, third);
        return first > maxNumber ? first : maxNumber;
    }

    public static int max(int first, int second, int third, int fourth){
        int maxNumber = max(second, third, fourth);
        return first > maxNumber ? first : maxNumber;
    }
}
