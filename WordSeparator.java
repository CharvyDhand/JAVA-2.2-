import java.util.Scanner;

public class WordSeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
        System.out.println("Output: " + result.toString());
    }
}
