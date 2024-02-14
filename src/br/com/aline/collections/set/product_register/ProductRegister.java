package br.com.aline.collections.set.product_register;

import java.util.*;

public class ProductRegister {
    private Set<Product> productSet = new HashSet<>();

    public void addProduct(String name, long cod, double price, int quantity) {
        productSet.add(new Product(name, cod, price, quantity));
    }

    public List<Product> sortByName() {
        List<Product> sorted = new LinkedList<>(productSet);
        Collections.sort(sorted);
        return sorted;
    }

    public List<Product> sortByPrice() {
        List<Product> sorted = new LinkedList<>(productSet);
        sorted.sort(new ComparatorByPrice());
        return sorted;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }
}
