import java.util.*;

interface PalindromeStrategy {
    boolean check(String input);
}

// Strategy 1: Stack
class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Strategy 2: Two-Pointer
class TwoPointerStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0, right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

// Strategy 3: Deque
class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        List<PalindromeStrategy> strategies = Arrays.asList(
                new StackStrategy(),
                new TwoPointerStrategy(),
                new DequeStrategy()
        );

        for (PalindromeStrategy strategy : strategies) {

            long startTime = System.nanoTime();

            boolean result = strategy.check(input);

            long endTime = System.nanoTime();
            long duration = endTime - startTime;

            System.out.println(strategy.getClass().getSimpleName()
                    + " -> Result: " + result
                    + " | Time: " + duration + " ns");
        }
    }
}