import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive, even number that is divisible by 7: ");
        int userNumber = scanner.nextInt();
        boolean not = true;
        boolean found = false;

        while (true) {
            if (userNumber > 0 && userNumber % 2 == 0 && userNumber % 7 == 0) {
                not = false;
            } else {
                if (userNumber <= 0) {
                    System.out.println("Not positive");
                }
                if (userNumber % 2 != 0) {
                    System.out.println("Not even");
                }
                if (userNumber % 7 != 0) {
                    System.out.println("Not divisible by 7");
                }
                System.out.println("Try Again: ");
                userNumber = scanner.nextInt();
            }
        }

        System.out.println("Thank you, goodbye!");
    }
}

