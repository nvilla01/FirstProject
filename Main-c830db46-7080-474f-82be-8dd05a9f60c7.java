import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // TODO A1: Ask the user for item name, price, and quantity
        // Example:
        // Item: Milk
        // Price: 3.49
        // Quantity: 2
        System.out.println("Enter Item name: ");
        String item = sc.nextLine();

        System.out.println("Enter price: ");
        double price = sc.nextDouble();

        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();

        // TODO B1: Calculate the total cost (price * quantity)
        double totalCost = price * quantity;

        // TODO C1: Create a FileWriter for "receipt.txt"
        FileWriter writer = new FileWriter("receipt.txt");

        // TODO C2: Write all purchase details to the file
        writer.write("Item: " + item + "\n");
        writer.write("Price: $" + price + "\n");
        writer.write("Quantity: " + quantity + "\n");
        writer.write("Total: $" + totalCost + "\n");

        writer.close();

        // TODO C3: Close the FileWriter and print "Receipt saved!"
        System.out.println("Receipt saved!");

    }
}