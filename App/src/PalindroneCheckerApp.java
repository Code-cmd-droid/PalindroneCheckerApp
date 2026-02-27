public class PalindroneCheckerApp {

    // Service class (Object-Oriented approach)
    static class PalindromeService {

        public boolean checkPalindrome(String input) {
            if (input == null) {
                return false;
            }

            // Normalize (ignore case and spaces)
            input = input.replaceAll("\\s+", "").toLowerCase();

            // Initialize pointers
            int start = 0;
            int end = input.length() - 1;

            // Compare characters moving inward
            while (start < end) {
                if (input.charAt(start) != input.charAt(end)) {
                    return false;
                }
                start++;
                end--;
            }

            return true;
        }
    }

    public static void main(String[] args) {

        PalindromeService service = new PalindromeService();

        String input = "Never Odd Or Even";

        if (service.checkPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }
}