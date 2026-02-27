import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class PalindroneCheckerApp {
    public static void main(String[] args){
        String input = "civic";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
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
