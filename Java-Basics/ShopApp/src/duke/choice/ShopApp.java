package duke.choice;

import java.util.Arrays;
import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.UnknownHostException;
import java.net.InetAddress;

public class ShopApp {

    public static void main(String[] args) {

        //Variable Declaration
        double tax = 0.2;
        double total = 0;
        int measurement = 3;

        //Print Message
        System.out.println("Welcome to Duke Choice Shop");

        //Create new object c1 of the class customer
        Customer c1 = new Customer("Pinky", 14);

        //Give name atributte of c1
        //c1.setName("Pinky");
        //System.out.println("Welcome " + c1.getName());
        //c1.setSize("S");
        System.out.println("The minimun price is " + Clothing.MIN_PRICE);
        //System.out.println("Pinky size: " + c1.getSize());
        //Create 2 new objects of Clothing class
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "S");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarg", 5.0, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

        //
        Clothing[] items = {item1, item2, item3, item4};

        try{
            ItemList list = new ItemList(items);
            Routing routing = Routing.builder()
            .get("/items", list).build();
        ServerConfiguration config = ServerConfiguration.builder()
                .bindAddress(InetAddress.getLocalHost())
                .port(8888).build();
        WebServer ws = WebServer.create(config, routing);
        ws.start();
        }catch(UnknownHostException ex){
            ex.printStackTrace();
            
        
        }
        
        
//        //Give description, size, price atributtes to both objects
//        item1.setDescription("Blue Jacket");
//        item1.setPrice(20.9);
//        item2.setDescription("Orange T-Shirt");
//        item2.setPrice(10.5);
//        item2.setSize("S");
//        item3.setDescription("Green Scarf");
//        item3.setPrice(5.0);
//        item3.setSize("S");
//        item4.setDescription("Blue T-Shirt");
//        item4.setPrice(10.5);
//        item4.setSize("S");
        //Print atributtes of both items
        //System.out.println("Item 1: " + item1.description + ", " + item1.price + ", " + item1.size);
        //System.out.println("Item 2: " + item2.description + ", " + item2.price + ", " + item2.size);
        //total = (2*item2.price + item1.price) * (1 + tax);
        //System.out.println("Total = " + total);
        c1.addItems(items);
        //c1.setSize(measurement);

        System.out.println("Customer is " + c1.getName() + ", " + c1.getSize());
        System.out.println("Pinky Items: ");
        
        Arrays.sort(c1.getItems());
        
        int i = 0;
        for (Clothing unitItem : items) {

//            System.out.println("Item " + (i + 1) + ": " + unitItem.getDescription() + ", " + unitItem.getPrice() + ", " + unitItem.getSize());
            i++;
            System.out.println("Item " + (i) + ": " + unitItem);

        }

        System.out.println("Total = " + c1.getTotalClothingCost());

        int average = 0;
        int count = 0;

        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                average += item.getPrice();
                count++;
            }
        }
        try {
            average = (count == 0) ? 0 : average / count;
            average = average / count;
            System.out.println("Average = " + average + ", Count = " + count);
        } catch (ArithmeticException e) {
            System.out.println("Don't Divide by zero");
        }
    }
}
