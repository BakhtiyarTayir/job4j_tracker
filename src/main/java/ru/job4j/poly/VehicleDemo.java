package ru.job4j.poly;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle aircraft = new Aircraft();
        Vehicle bus = new Autobus();
        Vehicle train = new Train();

        Vehicle[] vehicles = new Vehicle[]{aircraft, bus, train};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}
