import static org.junit.Assert.*;
import org.junit.*;

public class WarehouseTest {

    private final Product productOne = new Product("Jacket", "Clothing", "300", "Shipping", 2020,300.0);
    private final Product productTwo = new Product("Blue Jacket", "Clothing", "300", "Shipping", 2020,150.0);
    private final Product productThree = new Product("Red Jacket", "Clothing", "300", "Shipping", 2020,50.0);
    private final Product productFour = new Product("Black Jacket", "Clothing", "300", "In Magazine", 2020, 0.0);

    /**
     * @Test getStorageSizeOne
     * @description The first test is  a very simple test in  order to check if
     * if the specified product quantities are added in storage. If test passes then it is
     * a success otherwise it is a failure.
     */

    @Test
    public void getStorageSizeOne(){
        Warehouse warehouse = new Warehouse();
        warehouse.addProductQuantity(productOne.getDescription(), productOne, 30);
        warehouse.addProductQuantity(productTwo.getDescription(), productTwo, 20);
        warehouse.addProductQuantity(productThree.getDescription(), productTwo, 10);
        assertTrue(warehouse.getStorage().keySet().size() > 0);
        assertEquals(warehouse.getStorage().keySet().size(), 3);
    }

    /**
     * @Test getStorageSizeOne
     * @description The following test is to check the storage  size. Differently to the previous function though.
     * In this case it is added two different quantities of the same product. Thus if in the previous case are added
     * product  quantities of different products. Here we add the same product twice with a specified quantity value.
     * This is to check if the quantity is added to the existing product quantity in the storage hashtable in the warehouse.
     */

    @Test
    public void getStorageSizeTwo(){
        Warehouse warehouse = new Warehouse();
        warehouse.addProductQuantity(productOne.getDescription(), productOne, 30);
        warehouse.addProductQuantity(productOne.getDescription(), productOne, 30);
        warehouse.addProductQuantity(productFour.getDescription(), productFour,  10);
        warehouse.addProductQuantity(productFour.getDescription(), productFour,10);
        assertTrue(warehouse.getStorage().keySet().size() > 0);
        assertEquals(warehouse.getStorage().keySet().size(), 2);
        assertEquals(warehouse.getStorage().get(productOne.getDescription()).getQuantity(), 60);
        assertEquals(warehouse.getStorage().get(productFour.getDescription()).getQuantity(), 20);
    }

    /**
     * @Test getProductQuantityTestOne
     * @description This is a very simple first test where you get the product quantity by keyword.
     */

    @Test
    public void getProductQuantityTestOne(){
        Warehouse warehouse = new Warehouse();
        warehouse.addProductQuantity(productOne.getDescription(), productOne, 10);
        assertNotNull(warehouse.getProductQuantity(productOne.getDescription()));
        assertEquals(warehouse.getProductQuantity(productOne.getDescription()).getQuantity(), 10);
    }

}
