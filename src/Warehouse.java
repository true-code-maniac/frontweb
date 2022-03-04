import java.util.Arrays;
import java.util.HashMap;
public class Warehouse {
    private HashMap<String, ProductQuantity> storage = new HashMap<>();
    private int quantity = 0;

    public Warehouse(){}

    public Warehouse(HashMap<String, ProductQuantity> storage, int quantity) {
        this.storage = storage;
        this.quantity = quantity;
    }

    public  void addProductQuantity(String description, Product product, int quantity){
        ProductQuantity productQuantity = new ProductQuantity(product, quantity);
        storage.put(description,productQuantity);
    }

    /**
     *
     * @param description The description of product, to be searched for;
     * @return
     * @description The function returns the product quantity of a HashMapList based on a given description.
     * If the description key on the table is just a simple keyword and in the description input has been given the key
     * than it is probable that it is the product quantity looking for.
     * In case the input description of the function is a text, the returned product quantity it is determined based
     * on term  frequency.
     * Otherwise if the input string is a simple keyword and the description in the hashtable is returned, then the prodduct
     * quantity that it is returned is simply the first occurrence from the keyset that contains the specific keyword.
     *
     */

    public ProductQuantity getProductQuantity(String description){
        if(description.split(" ").length == 0){
            if(storage.containsKey(description)){
                return storage.get(description);
            }else{
                int index = 0;
                for(String desKey: storage.keySet()){
                    String[] desKeyTokens = desKey.split(" ");
                    if(Arrays.stream(desKeyTokens).toList().contains(description))storage.get(desKeyTokens[index]);
                    else index+=1;
                }
            }
        }else{

        }
    }


    //The getters and setters
    public HashMap<String, ProductQuantity> getStorage() {
        return storage;
    }
    public void setStorage(HashMap<String, ProductQuantity> storage) {this.storage = storage;}
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}