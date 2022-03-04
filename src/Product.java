public class Product  {

    private String description;
    private String type;
    private double  price = 0;
    private int year;
    private String capacity;
    private String processing;

    //default constructor
    public Product(){}

    public Product(String description, String type,String capacity, String processing, int year, double price){
        this.setDescription(description);
        this.setType(type);
        this.setCapacity(capacity);
        this.setProcessing(processing);
        this.setYear(year);
        this.setPrice(price);
    }

    //Setter functions
    public void setDescription(String description){this.description  = description;}
    public void setType(String type){this.type = type;}
    public void setPrice(double price){this.price  = price;}
    public void setYear(int year){this.year = year;}
    public void setCapacity(String capacity){this.capacity = capacity;}
    public void setProcessing(String processing){this.processing = processing;}

    //Getter functions
    public String getDescription(){return this.description;}
    public String getType(){return this.type;}
    public double getPrice(){return this.price;}
    public int getYear(){return this.year;}
    public String getCapacity(){return this.capacity;}
    public String getProcessing(){return this.processing;}
}
