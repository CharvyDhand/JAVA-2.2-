import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nSelect a program to run:");
            System.out.println("1. Reverse a Number");
            System.out.println("2. Quotient with Exception Handling");
            System.out.println("3. String with Separator");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    reverseNumber(sc);
                    break;
                case 2:
                    quotientWithException(sc);
                    break;
                case 3:
                    stringWithSeparator(sc);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // Q2: Reverse a Number
    static void reverseNumber(Scanner sc) {
        System.out.print("Enter number to reverse: ");
        int num = sc.nextInt();
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed number: " + rev);
    }

    // Q5: Quotient with Exception Handling
    static void quotientWithException(Scanner sc) {
        try {
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator: ");
            int b = sc.nextInt();
            System.out.println("The quotient of " + a + "/" + b + " = " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("DivideByZeroException caught");
        } finally {
            System.out.println("Inside finally block");
        }
    }

    // Q9: String with Separator
    static void stringWithSeparator(Scanner sc) {
        System.out.print("Enter word: ");
        String word = sc.next();
        System.out.print("Enter separator: ");
        String sep = sc.next();
        System.out.print("Enter count: ");
        int count = sc.nextInt();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(word);
            if (i < count - 1) result.append(sep);
        }
        System.out.println("Result: " + result.toString());
    }
}
