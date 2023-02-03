package org.example.database;
import java.util.*;
import org.example.model.Order;
import org.example.model.Product;


public class OrderRepo {
    List<Order> orders = new ArrayList<>();

    public void add(Order request){
        orders.add(request);
    }

    public Optional<Order> get(int id) {
        for (Order request : orders){
            if ( request.getId() == id){
                return Optional.ofNullable(request);
            }
        }
        return Optional.empty();
    }
}
