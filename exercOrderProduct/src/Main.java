import entities.Client;
import entities.Enums.OrderStatus;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter client data: ");

        System.out.print("Name: ");
        String name = input.nextLine();

        System.out.print("Email: ");
        String email = input.nextLine();

        System.out.print("BirthD Date: ");
        String birthDate = input.nextLine();

        System.out.println("Status: PENDING_PAYMENT, PROCESSING, SHIPPEDA OR DELIVERED");
        String status = input.nextLine();

        System.out.println("Enter the quantity order to buy: ");
        Integer orderQuantity = input.nextInt();
        input.nextLine();

        Order pedido = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), new Client(name, email, LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

        for (int i = 0; i < orderQuantity; i++) {
            System.out.print("Product Name: ");
            String nameProduct = input.nextLine();

            System.out.print("Product Price: ");
            Double productPrice = input.nextDouble();
            input.nextLine();

            System.out.print("Quantity: ");
            Integer quantity = input.nextInt();

            OrderItem item = new OrderItem(quantity, new Product(nameProduct, productPrice));
            pedido.addItem(item);

        }

        System.out.println(pedido);
    }
}