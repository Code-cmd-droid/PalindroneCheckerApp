public class PalindroneCheckerApp {

    // Recursive method
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        // Normalize input (remove non-alphanumeric and convert to lowercase)
        str = str.replaceAll("[^a-zA-Z0-9]", "")
                .toLowerCase();

        return checkRecursive(str, 0, str.length() - 1);
    }

    // Helper recursive function
    private static boolean checkRecursive(String str, int left, int right) {
        // Base case: if pointers cross or meet
        if (left >= right) {
            return true;
        }

        // If characters don't match
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call moving inward
        return checkRecursive(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String input = "Racecar";

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }
}