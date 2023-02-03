package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.database.OrderRepo;
import org.example.database.ProductRepo;
import org.example.model.Order;

import java.util.List;
import java.util.NoSuchElementException;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ShopService {

    ProductRepo storage;
    OrderRepo bookings;


    public String getProduct(int i) {
        try{
        return storage.getById(i).get().toString();
        }
        catch(NoSuchElementException e){
            return "Kein Produkt mit dieser ID";
        }

    }

    public String listProducts() {
        try {
            return storage.listProducts();
        }
        catch (NoSuchElementException e){
            return "Kein Produkt in dieser Liste";
        }
    }

    public boolean addOrder(Order order){
        if(bookings.add(order)){
            return true;
        }
        return false;
    }

    public String getOrder(int id){
        return bookings.getSingleOrder(id).get().toString();
    }

    public List<Order> listOrders(){
        return bookings.list();
    }
}
