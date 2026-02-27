import java.util.ArrayDeque;
import java.util.Deque;

public class PalindroneCheckerApp {

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        // Normalize input (remove non-alphanumeric and convert to lowercase)
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : cleaned.toCharArray()) {
            deque.addLast(c);
        }

        // Compare front and back
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }
}