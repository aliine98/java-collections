package br.com.aline.collections.set.product_register;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private long cod;
    private  double price;
    private int quantity;

    public Product(String name, long cod, double price, int quantity) {
        this.name = name;
        this.cod = cod;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cod=" + cod +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compareTo(Product p) {
        return name.compareTo(p.getName());
    }

    // Para garantir que o mesmo produto não será adicionado no set do cadastro de produtos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return cod == product.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod);
    }
}
