package br.com.aline.collections.list.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> itemsList = new ArrayList<>();

    public void addItem(String name, double price,int quantity) {
        itemsList.add(new Item(name, price, quantity));
    }

    public void removeItem(String name) {
        List<Item> itemsToRemove = new ArrayList<>();
        this.itemsList.forEach((Item item) -> {
            if(item.getName().equalsIgnoreCase(name)) {
                itemsToRemove.add(item);
            }
        });

        this.itemsList.removeAll(itemsToRemove);
    }

    public void showItems() {
        this.itemsList.forEach(System.out::println);
    }

    public double getTotalPrice() {
        double total = 0;

        for (Item item : itemsList) {
            total += item.getPrice() * item.getQuantity();
        }

        return total;
    }
}
