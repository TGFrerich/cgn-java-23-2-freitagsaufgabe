package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.database.OrderRepo;
import org.example.database.ProductRepo;
@Data
@NoArgsConstructor
@AllArgsConstructor


public class ShopService {

    ProductRepo storage;
    OrderRepo bookings;



}
