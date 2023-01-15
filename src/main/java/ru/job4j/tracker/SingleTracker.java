package ru.job4j.tracker;

public class SingleTracker {
    private Tracker tracker = new Tracker();
    public static SingleTracker instance = null;

    private SingleTracker(){ }

    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findByItem(int id) {
        return null;
    }

    public Item[] findAll(){
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}
