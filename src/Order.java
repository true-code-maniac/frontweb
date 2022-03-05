import java.util.List;
import java.util.Date;

public class Order {

    private int id;
    private List<ProductQuantity> productQuantities;
    private String description;
    private double totalCost = 0;
    Date date;

    //The default constructor
    public Order(){
        this.setDate();
    }

    public Order(int id, String description, Date date, List<ProductQuantity> productQuantities){
        this.setId(id);
        this.setDescription(description);
        this.setDate();
    }

    //Setter
    public void setId(int id){
        this.id = id;
    }

    public void setProductQuantities(List<ProductQuantity> productQuantities){
        this.productQuantities = productQuantities;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setDate(){
        this.date  = new Date();
    }

    //Getter
    public int getId(){return this.id;}
    public List<ProductQuantity> getProductQuantities(){return this.productQuantities;}
    public String getDescription(){return this.description;}
    public String getDate(){return this.date.toGMTString();}

    /**
     *
     * @return It returns the total cost from the given product quanttities
     */
    
    public double getCost(){
        return this.productQuantities.stream().map(productQuantity -> productQuantity.getProduct().getPrice()*productQuantity.getQuantity()).reduce(0.0, (a, b) -> a + b);}

}
