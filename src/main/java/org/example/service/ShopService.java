package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.database.OrderRepo;
import org.example.database.ProductRepo;
import org.example.model.Product;

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

}
