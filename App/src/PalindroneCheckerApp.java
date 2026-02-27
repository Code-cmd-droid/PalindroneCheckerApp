import java.util.LinkedList;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "Level";

        // Normalize input (remove non-alphanumeric and convert to lowercase)
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the LinkedList
        for (char c : cleaned.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }
}