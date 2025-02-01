package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemTest {
    @Test
    public void whenAscSortItemName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Example"));
        items.add(new Item(2, "Super Item"));
        items.add(new Item(3, "Another Item"));

        List<Item> expected = new ArrayList<>();
        expected.add(new Item(3, "Another Item"));
        expected.add(new Item(1, "Example"));
        expected.add(new Item(2, "Super Item"));

        items.sort(new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void whenDescSortItemName() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(1, "Example"));
        items.add(new Item(2, "Super Item"));
        items.add(new Item(3, "Another Item"));

        List<Item> expected = new ArrayList<>();
        expected.add(new Item(2, "Super Item"));
        expected.add(new Item(1, "Example"));
        expected.add(new Item(3, "Another Item"));

        items.sort(new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }
}