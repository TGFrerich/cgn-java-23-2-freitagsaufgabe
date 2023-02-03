import org.example.database.OrderRepo;
import org.example.database.ProductRepo;
import org.example.model.Order;
import org.example.model.Product;
import org.example.service.ShopService;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopServiceTest {

    //Create Products
    Product product1 = new Product("Klopapier", 6);
    Product product2 = new Product("Eis", 9);
    Product book1 = new Product("How to become a good developper", 17);
    Product book2 = new Product("Java for dummies", 22);

    //Create product lists
    List<Product> productList = new ArrayList<>(Arrays.asList(product1,product2));

    List<Product> bookList = new ArrayList<>(Arrays.asList(book1, book2));

    ProductRepo productBase = new ProductRepo(productList);

    //Create orders
    Order order1 = new Order(1, productList);
    Order order2 = new Order(3,bookList);

    List<Order> orderList = new ArrayList<>(Arrays.asList(order1,order2));

    OrderRepo allRequets = new OrderRepo(orderList);
    ShopService coolShop = new ShopService(productBase,allRequets);

    @Test
    void getProductTest_expectedSingleProduct(){
        String actual = coolShop.getProduct(6);
        String expected = productBase.getById(6).orElse(new Product()).toString();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void getProductTest_expectedListOfProduct(){
        String actual = coolShop.listProducts();
        String excepted = productList.toString();

        Assertions.assertEquals(excepted,actual);
    }

    @Test
    void addOrderTest_exceptedNewOrder(){
        boolean excepted = coolShop.addOrder(order1);
        Assertions.assertTrue(excepted);
    }

    @Test
    void addOrderTest_exceptedFalse(){
        boolean excepted = coolShop.addOrder(null);
        Assertions.assertFalse(excepted);
    }

}
