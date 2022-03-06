import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.*;

public class OrderTest {

    @Test
    public void getTotalCostTest(){
        Order order = new Order();
        Product productOne = new Product("Jacket", "Clothing", "300", "Shipping", 2020,300.0);
        Product productTwo = new Product("Blue Jacket", "Clothing", "300", "Shipping", 2020,150.0);
        Product productThree = new Product("Red Jacket", "Clothing", "300", "Shipping", 2020,50.0);
        Product productFour = new Product("Black Jacket", "Clothing", "300", "In Magazine", 2020, 0.0);

        ProductQuantity productQuantityOne = new ProductQuantity(productOne, 2);
        ProductQuantity productQuantityTwo = new ProductQuantity(productTwo,3);
        ProductQuantity productQuantityThree = new ProductQuantity(productThree, 2);
        ProductQuantity productQuantityFour = new ProductQuantity(productFour, 3);

        List<ProductQuantity> listOfProducts = List.of(productQuantityOne, productQuantityTwo, productQuantityThree, productQuantityFour);
        order.setProductQuantities(listOfProducts);

        assertEquals(order.getCost(), 1150.0, 0.0);
    }
}
