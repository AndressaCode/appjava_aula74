/*
 * Enter product data:
 * Name: TV
 * Price: 900.00
 * Quantity in stock: 10
 * Product data: TV, $ 900.00, 10 units, Total: $ 9000.00
 * Enter the number of products to be added in stock: 5
 * Updated data: TV, $ 900.00, 15 units, Total: $ 13500.00
 * Enter the number of products to be removed from stock: 3
 * Updated data: TV, $ 900.00, 12 units, Total: $ 10800.00
 */
package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Program {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        
        Product product = new Product(name, price, quantity);
        
        System.out.print("Product data: " + product);
        
        System.out.printf("%n%n");
        
        System.out.print("Number of products to be added in the stock: ");
        quantity = sc.nextInt();
        product.addProduct(quantity);
        
        System.out.print("Updated data: " + product);
        
        System.out.printf("%n%n");
        System.out.print("Number of products to be removed from the stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        System.out.print("Updated data: " + product);
        
        sc.close();
    
    }    
}
