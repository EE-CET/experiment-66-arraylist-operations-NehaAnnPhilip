import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        String line = scanner.nextLine();
        String[] items = line.split(" ");

        ArrayList<String> cart = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            cart.add(items[i]);
        }

        // Sort the list
        Collections.sort(cart);

        // Read search item
        String searchItem = scanner.nextLine();

        // Print sorted list
        System.out.println("Sorted Items: " + cart);

        // Check existence
        if (cart.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
