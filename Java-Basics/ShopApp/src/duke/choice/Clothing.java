package duke.choice;

public class Clothing {

    public static final double MIN_PRICE = 10;
    public static final double TAX_RATE = 0.2;

    private String description;
    private double price;
    private String size = "M";

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * TAX_RATE);
    }

    public void setPrice(double price) {

        //this.price = (price > minimumPrice) ? price : minimumPrice;
        if (price > MIN_PRICE) {
            this.price = price;
        } else {
            System.out.println("Error: The item " + this.description + " cost less than 10");
            this.price = MIN_PRICE;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
