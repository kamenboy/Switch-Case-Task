import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Choose a subject: \n 1. Science \n 2. History \n 3. Sports");
        byte ans = scan.nextByte();
        double ans2;
        switch (ans) {
            case 1:
                System.out.println("You have chosen science. Answer this question: \nWhat is the magnitude of gravitational acceleration?");
                ans2 = scan.nextDouble();
                switch ((int) ans2) {
                    case (int) 9.81:
                        System.out.println("You are correct! ");
                        break;
                    default:
                        System.out.println("You are not correct! ");
                        break;
                }
                break;
            case 2:
                System.out.println("You have chosen history. Answer this question: \nWhat year was the First Bulgarian Empire founded?");
                ans2 = scan.nextDouble();
                switch ((int) ans2) {
                    case 681:
                        System.out.println("You are correct! ");
                        break;
                    default:
                        System.out.println("You are not correct! ");
                        break;
                }
                break;
            case 3:
                System.out.println("You have chosen sport. Answer this question: \nWhat is the fastest time for a 100m dash?");
                ans2 = scan.nextDouble();
                switch ((int) ans2) {
                    case (int) 9.58:
                        System.out.println("You are correct! ");
                        break;
                    default:
                        System.out.println("You are not correct! ");
                        break;
                }
        }
    }
}
