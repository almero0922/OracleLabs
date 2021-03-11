package duke.choice;

public class Clothing {
    
    private final double minimunPrice = 10;
    private final double tax = 0.2;
    
    private String description;
    private double price;
    private String size = "M";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price * tax);
    }

    public void setPrice(double price) {
        
        //this.price = (price > minimumPrice) ? price : minimumPrice;
        
        if(price > minimunPrice){
        this.price = price;
        }
        else{
            System.out.println("Error: The item " + this.description + " cost less than 10");
            this.price = minimunPrice;
        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

 
    
}
