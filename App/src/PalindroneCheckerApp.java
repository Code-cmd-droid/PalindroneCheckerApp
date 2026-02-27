import java.util.Stack;
public class PalindroneCheckerApp {
    public static void main(String[] args){
        String input = "noon";
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The String is a palindrome.");
        } else {
            System.out.println("The String is not a palindrome.");
        }
    }
}
