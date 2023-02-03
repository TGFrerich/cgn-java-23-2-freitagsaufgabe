package org.example.database;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.model.Order;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderRepo {
    List<Order> orders = new ArrayList<>();

    public boolean add(Order request){
        if(request != null){
            return orders.add(request);
        }
        return false;
    }

    public Optional<Order> getSingleOrder(int id) {
        for (Order request : orders){
            if ( request.getId() == id){
                return Optional.ofNullable(request);
            }
        }
        return Optional.empty();
    }


    public List<Order> list() {
        return orders;
    }
}
