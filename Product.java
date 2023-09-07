package learning_oop.classes;

public class Product { // Set var
    private String name;
    private Double price;
    private Integer quantity;

    public Product(String name, double price, int quantity){ //Constructor all attributes
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product(String name, double price){ //Constructor name and price attributes
        this.name = name;
        this.price = price;
    }
    public Product(){ //Constructor without attributes
    }

    //set and get attributes:
    //name
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    //price

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    //quantity
    public int getQuantity(){
        return quantity;
    }

    //Methods
    public void consultProduct(){
        System.out.printf("Consult Product:\nName: %s\nPrice: %.2f\nQuantity: %d\n"
                , name, price, quantity);
    }
    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantityAdd){
        this.quantity += quantityAdd;
        System.out.printf("Quantity in stock %s update as: %d\n", name, quantity);
    }
    public void removeProducts(int quantityRemove){
        this.quantity -= quantityRemove;
        System.out.printf("Quantity in stock %s update as: %d\n", name, quantity);
    }
    public String toString(){
        return "Name:" + name +
                "\nPrice: " + String.format("%.2f", price) +
                "\nin Stock:" + quantity +
                "\nTotal Value in Stock:"+ String.format("%.2f",totalValueInStock());
    }
}
