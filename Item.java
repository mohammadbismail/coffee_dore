public class Item {
    private String name;
    private double price;
    
    // Constructor
    public Item(String name,double price){
        this.name = name;
        this.price = price;
    }

    //getters & setters 
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }

}
