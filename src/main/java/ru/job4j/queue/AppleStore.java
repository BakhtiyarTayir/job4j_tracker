package ru.job4j.queue;

import java.util.Queue;

public class AppleStore {
    private final Queue<Customer> queue;

    private final int count;

    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    public String getLastHappyCustomer() {
        Customer lastHappyCuctomer = null;
        for (int i = 0; i < count; i++) {
            lastHappyCuctomer = queue.poll();
        }
        return lastHappyCuctomer.name();
    }

    public String getFirstUpsetCustomer() {
        Customer firstUpsetCuctomer = null;
        for (int i = 0; i <= count; i++) {
            firstUpsetCuctomer = queue.poll();
        }
        return firstUpsetCuctomer.name();
    }
}
