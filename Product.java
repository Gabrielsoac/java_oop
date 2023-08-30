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
        double totalValueInStock = price * quantity;
        System.out.printf("Value Total in Stock:\nName:%s\nTotal Value:%.2f\n", name, totalValueInStock);
        return totalValueInStock;
    }
    public void addProducts(int quantityAdd){
        this.quantity += quantityAdd;
        System.out.printf("Quantity in stock %s update as: %d\n", name, quantity);
    }
    public void removeProducts(int quantityRemove){
        this.quantity -= quantityRemove;
        System.out.printf("Quantity in stock %s update as: %d\n", name, quantity);
    }
}
