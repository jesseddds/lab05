import java.util.Scanner;
public class task01 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter price of item");
        double price = input.nextDouble();

        while (price <= 0) {
            System.out.println("Invalid Choice,Please enter a positive number");
            price = input.nextDouble();
        }
        double shipping;
        if (price >= 100) {
            shipping = 0;
        } else {
            shipping = price * 0.2;
        }
        double total = price + shipping;

        System.out.printf("Shipping cost: $%.2f%n", shipping);
        System.out.printf("Total cost: $%.2f%n", total);
        
    }
}
