package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Go");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Passengers: " + number);
    }

    @Override
    public double tankUp(int price) {
        return 0;
    }
}
