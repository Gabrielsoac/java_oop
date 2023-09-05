package basic;

import java.util.Scanner;
import learning_oop.classes.Product;

public class array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Product[] produtos;

        System.out.println("Enter the quantity products: ");
        int quantityProducts = input.nextInt();
        produtos = new Product[quantityProducts];

        for (int i = 0; i < produtos.length; i++){
            input.nextLine();
            System.out.println("Enter the product name: ");
            String name = input.nextLine();
            System.out.println("Enter the product price: ");
            double price = input.nextDouble();
            produtos[i] = new Product(name, price);
        }
        for (int j = 0; j < produtos.length; j++){
            System.out.println(produtos[j].getName());
        }
    }
}
