import java.util.ArrayList;

public class Order {
    private String name;
    private ArrayList<Item> items;

    // Constructor
    public Order(String myName) {
        this.name = myName;
        this.items = new ArrayList<Item>();
    }

    // Getters & Setters
    public String getCustomerName() {
        return this.name;
    }

    public void addItem(Item myItem) {
        this.items.add(myItem);
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.println(item.getName() + "--" + item.getPrice());
        }
    }
}
