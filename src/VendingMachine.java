import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Choose snack number {A1, B2, C3 or D4}:  ");
        String ans = scan.next();
        switch (ans) {
            case "A1":
                System.out.println("Product \"Soda\" - Price: $1.50");
                break;
            case "B2":
                System.out.println("Product \"Chips\" - Price: $1.25");
                break;
            case "C3":
                System.out.println("Product \"Candy\" - Price: $0.75");
                break;
            case "D4":
                System.out.println("Product \"Water\" - Price: $1.00");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
