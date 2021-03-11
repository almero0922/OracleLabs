package duke.choice;

public class Customer {

    private String name;
    private String size;
    private Clothing[] items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setSize(int measurement) {

        switch (measurement) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
                break;
        }

    }

    public void addItems(Clothing[] items2) {
        items = items2;

    }

    public Clothing[] getItems() {
        return items;
    }

    public double getTotalClothingCost() {

        int i = 0;
        double total = 0.0;
        
        for (Clothing unitItem : items) {

            //if (this.getSize() == unitItem.getSize()) {
                total = total + unitItem.getPrice();
                System.out.println("Item " + (i + 1) + ": " + unitItem.getDescription() + ", " + unitItem.getPrice() + ", " + unitItem.getSize());
                i++;
//                if (total > 15) {
//                    break;
//                }
           // }

        }
        return total;
    }
}