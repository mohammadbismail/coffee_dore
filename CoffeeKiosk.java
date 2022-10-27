import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

    // Constructor
    public CoffeeKiosk() {
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }

    // Getters & Setters
    public void addMenuItem(String itemName, double price) {
        Item myItem = new Item(itemName, price);
        this.menu.add(myItem);
    }

    public void displayMenu() {
        // for (Item item : menu) {
        // System.out.printf(item. + item.getName() + "--" + item.getPrice());
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + " " + menu.get(i).getName() + " -- " + "$" + " " + menu.get(i).getPrice());
        }
    }

    public void newOrder() {
        System.out.println("Please enter customer name for new item");
        String customerName = System.console().readLine();
        Order myOrder = new Order(customerName);
        this.orders.add(myOrder);
        System.out.printf("Dear %s, this is our menu for your choice of items\n", customerName);
        displayMenu();
        // Integer itemNumber = Integer.parseInt(System.console().readLine());
        System.out.printf("Dear %s, please enter an item number or q to quit\n", customerName);
        String itemNumber = System.console().readLine();

        while (!itemNumber.equals("q")) {

            System.out.printf("Dear %s, please enter an item number or q to quit\n", customerName);
            String itemNumber2 = System.console().readLine();
            myOrder.addItem(this.menu.get(Integer.parseInt(itemNumber2)));
        }

        System.out.printf("Thank you %s, These are your ordered items\n", customerName);
        myOrder.displayItems();
    }

}
