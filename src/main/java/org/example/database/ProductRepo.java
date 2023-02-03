package org.example.database;

import org.example.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepo {

    List<Product> products = new ArrayList<>();

    public Optional<Product> get(int id) {
        for (Product product : products){
            if ( product.getId() == id){
                return Optional.ofNullable(product);
            }
        }
        return Optional.empty();
    }

    public Optional<Product> get(String name) {
        for (Product product : products){
            if ( product.getName() == name){
                return Optional.ofNullable(product);
            }
        }
        return Optional.empty();
    }


    public void list() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public ProductRepo(List<Product> products) {
        this.products = products;
    }
}
