import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
import java.io.File;
import java.util.stream.Collectors;

public class OrderTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Creating the very first five products
        final Product productOne = new Product("Jacket", "Clothing", "300", "Shipping", 2020,3000.0);
        final Product productTwo = new Product("Blue Jacket With Topolino", "Clothing", "300", "Shipping", 2020,1500.0);
        final Product productThree = new Product("Red Jacket", "Clothing", "300", "Shipping", 2020,2000.0);
        final Product productFour = new Product("Black Jacket", "Clothing", "300", "In Magazine", 2020, 2500.0);
        final Product productFive = new Product("Grey Jacket", "Clothing", "300", "In Magazine", 2020, 2500.0);


        //Adding  the very first product quantities
        Warehouse warehouse = new Warehouse();
        warehouse.addProductQuantity(productOne.getDescription(), productOne, 100);
        warehouse.addProductQuantity(productTwo.getDescription(), productTwo, 100);
        warehouse.addProductQuantity(productThree.getDescription(),  productThree, 100);
        warehouse.addProductQuantity(productFour.getDescription(), productFour, 100);
        warehouse.addProductQuantity(productFive.getDescription(), productFive, 100);

        System.out.println("ID\t\t\tDescription\t\tPrice");
        System.out.println("-------------------------------------------");
        System.out.println("1\t\t\t"+productOne.getDescription()+"\t\t\t\t"+productOne.getPrice());
        System.out.println("2\t"+productTwo.getDescription()+"\t"+productTwo.getPrice());
        System.out.println("3\t\t\t"+productThree.getDescription()+"\t\t\t"+productThree.getPrice());
        System.out.println("4\t\t\t"+productFour.getDescription()+"\t\t"+productFour.getPrice());
        System.out.println("5\t\t\t"+productFive.getDescription()+"\t\t\t"+productFive.getPrice());
        List<String> tokens = List.of("Jacket", "Red", "Blue", "Black", "Topolino","hello");
        List<ProductQuantity> productQuantities = new ArrayList<>();
        tokens.forEach(token->{
            ProductQuantity productQuantity = warehouse.getProductQuantity(token);
            if (productQuantity != null){
                System.out.println("Adding product to the order:"+productQuantity);
                productQuantities.add(productQuantity);
            }else{
                System.out.println("Product Not In Warehouse");
            }

        });
        System.out.println("Please provide a name for the order file: ");
        String fileName = scanner.nextLine();
        System.out.println("Exporting the order in alphabetical order");
        String path = "/Users/raven/Desktop/frontweb/order/"+fileName+".txt";
        try{
            File file = new File(path);
            file.createNewFile();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        String text = "Description\t\t\tQuantity\t\t\tCost\n";
        text += "-------------------------------------------------\n";
        for(ProductQuantity productQuantity: productQuantities){
            text += productQuantity.getProduct().getDescription()+"\t\t"+productQuantity.getQuantity()+"\t\t"+productQuantity.getProduct().getPrice()+"\n";
        }
        try {
            FileWriter myWriter = new FileWriter(path);
            myWriter.write(text);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
