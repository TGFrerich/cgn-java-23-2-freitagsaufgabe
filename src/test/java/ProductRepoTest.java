import org.example.model.Product;
import org.example.database.ProductRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.*;

public class ProductRepoTest {


    Product product1 = new Product("Klopapier", 6);
    Product product2 = new Product("Eis", 9);
    List<Product> productList = new ArrayList<>(Arrays.asList(product1,product2));
    ProductRepo productBase = new ProductRepo(productList);


    @Test
    void getProductById_expectProduct() {

        Product actual = productBase.getById(6).get();
        Product expected = product1;

        Assertions.assertEquals(expected, actual);


    }
    @Test
    void getProductByName_expectProduct() {

        Product actual = productBase.getByName("Eis").get();
        Product expected = product2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void listProductsTest() {

        String actual = productBase.listProducts();
        String expected = productList.toString();

        Assertions.assertEquals(expected, actual);
    }
}
