package org.example.database;

import org.example.model.Order;
import org.example.model.Product;
import org.example.service.ShopService;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopServiceTest {

    Product product1 = new Product("Klopapier", 6);
    Product product2 = new Product("Eis", 9);
    List<Product> productList = new ArrayList<>(Arrays.asList(product1,product2));
    Order order1 = new Order(1, productList);
    ProductRepo productBase = new ProductRepo(productList);

    OrderRepo allRequets = new OrderRepo();
    ShopService coolShop = new ShopService();

    @Test
    void getProductTest_expectedSingleProduct(){

    }
}
