package org.example.database;

import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    List<Product> products = new ArrayList<>();

    public List<Product> get() {
        return products;
    }

    public void list(List<Product> products) {
        this.products = products;
    }
}
