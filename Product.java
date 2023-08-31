package learning_oop;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String Name, double Price, int Quantity){
        this.name = Name;
        this.price = Price;
        this.quantity = Quantity;
    }
    public void consultProduct(){
        System.out.printf("Consult Product:\nName: %s\nPrice: %.2f\nQuantity: %d\n", name, price, quantity);
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
        return "Name:" + name + "\nPrice: " + String.format("%.2f", price) + "\nin Stock:" + quantity + "\nTotal Value in Stock:"+ String.format("%.2f",totalValueInStock());
    }
}
