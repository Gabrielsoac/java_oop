package entities;

import entities.Enums.OrderStatus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    //Attributes
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> listItems = new ArrayList<>();

    //Constructors
    public Order(){
    }
    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    //Methods
    public void addItem(OrderItem item){
        listItems.add(item);
    }
    public void removeItem(OrderItem item){
        listItems.remove(item);
    }

    @Override
    public String toString(){
        StringBuilder stringFormatted = new StringBuilder();
        stringFormatted.append("Order moment : " + moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n"
                + "Order Status: " + status + "\n"
                + "Client: "+ client + "\n"+ "Order Items: ");
        for (OrderItem item : listItems){
            stringFormatted.append(item + "\n");
        }

        return stringFormatted.toString();
    }



}
