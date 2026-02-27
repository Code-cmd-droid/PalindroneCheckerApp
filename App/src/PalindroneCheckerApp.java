import java.util.Stack;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Concrete Strategy: Stack-Based Implementation
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        if (input == null) {
            return false;
        }

        // Normalize (ignore case and spaces)
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Create a stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

// Context Class
class PalindromeContext {
    private PalindromeStrategy strategy;

    public PalindromeContext(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean execute(String input) {
        return strategy.check(input);
    }
}

// Application Class
public class PalindroneCheckerApp {

    public static void main(String[] args) {

        PalindromeStrategy strategy = new StackStrategy();
        PalindromeContext context = new PalindromeContext(strategy);

        String input = "Level";

        if (context.execute(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a palindrome.");
        }
    }
}