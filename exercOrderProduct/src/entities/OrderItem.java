package entities;

public class OrderItem {
    //attributes
    private Integer quantity;
    private Product product;


    //Constructors
    public OrderItem(){

    }
    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    //Methods
    public Double subTotal(){
        return quantity * product.getPrice();
    }

    @Override
    public String toString(){
        StringBuilder stringFormatted = new StringBuilder();
        stringFormatted.append(product.getName() + "\n"
                + product.getPrice() + "\n"
                + "Quantity: " + quantity + "\n" + "Sub Total: " + subTotal());

        return stringFormatted.toString();
    }



}
