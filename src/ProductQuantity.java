public class ProductQuantity {
    private Product product;
    private int quantity = 0;

    //This is the default constructor;
    public ProductQuantity(){}

    public ProductQuantity(Product product, int quantity){
        this.setProduct(product);
        this.setQuantity(quantity);
    }

    //Setter
    public void setProduct(Product product){this.product =  product;}
    public void setQuantity(int quantity){this.quantity = quantity;}

    //Getter
    public Product getProduct(){return this.product;}
    public int getQuantity(){return this.quantity;}
}
