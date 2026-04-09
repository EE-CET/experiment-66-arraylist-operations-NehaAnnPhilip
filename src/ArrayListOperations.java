import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Check if there is input before reading N
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        ArrayList<String> cart = new ArrayList<>();
        
        // Read N items and add them to the ArrayList
        for (int i = 0; i < n; i++) {
            cart.add(scanner.next());
        }
        
        // Read the single String representing the item to search for
        String searchItem = scanner.next();
        
        // Sort the items alphabetically (lexicographical order)
        Collections.sort(cart);
        
        // Output Line 1: Sorted Items: [Item1, Item2, ...]
        // ArrayList.toString() matches the required bracket notation exactly
        System.out.println("Sorted Items: " + cart);
        
        // Output Line 2: Found or Not Found
        if (cart.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
        
        scanner.close();
    }
}
