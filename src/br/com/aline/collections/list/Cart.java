package br.com.aline.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> itemsList = new ArrayList<>();

    void addItem(String name, double price,int quantity) {
        itemsList.add(new Item(name, price, quantity));
    }

    void removeItem(String name) {
        List<Item> itemsToRemove = new ArrayList<>();
        this.itemsList.forEach((Item item) -> {
            if(item.getName().equalsIgnoreCase(name)) {
                itemsToRemove.add(item);
            }
        });

        this.itemsList.removeAll(itemsToRemove);
    }

    void showItems() {
        this.itemsList.forEach(System.out::println);
    }

    double getTotalPrice() {
        double total = 0;

        for (Item item : itemsList) {
            total += item.getPrice() * item.getQuantity();
        }

        return total;
    }
}
