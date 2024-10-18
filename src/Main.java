import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte num = 5;
        System.out.println("\n I have thought of a number. You have 3 tries to guess: ");
        int i = 2;
        boolean won = false;
        while (i >= 0) {
            byte ans = scan.nextByte();
            switch (ans) {
                case 5:
                    System.out.println("You have guessed correctly! Congratulations! ");
                    won = true;
                    i = 0;
                    break;
                default:
                    System.out.println("You have guessed incorrectly! You have " + i + " tries left. ");
                    break;

            }
            i--;
        }
        if (won) {
            System.out.println("YOU WON!!!!");
        } else {
            System.out.println("YOU LOST!!!");
        }
    }
}