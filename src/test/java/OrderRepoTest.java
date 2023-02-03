import org.example.database.OrderRepo;
import org.example.model.Order;
import org.example.model.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrderRepoTest {

    @Test
    public void isListOutputCorrect(){

        OrderRepo order_list = new OrderRepo();
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product("Klopapier",6);
        Product product2 = new Product("Eis",9);
        productList.add(product1);
        productList.add(product2);
        Order order1 = new Order(1, productList);
        order_list.add(order1);

        String result = order_list.list();

        Assertions.assertEquals("[Order(id=1, products=[Product{name='Klopapier', id=6}, Product{name='Eis', id=9}])]", result);


    }



    @Test
    public void isOrderRepoAddCorrect(){
        OrderRepo order_list = new OrderRepo();
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product("Klopapier",6);
        productList.add(product1);
        Order order1 = new Order(1, productList);
        order_list.add(order1);
        Optional<Order> result = order_list.get(1);
       // Order order_final = result.get();
        Assertions.assertEquals(order1, result.get());

    }


}
