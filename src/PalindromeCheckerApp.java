import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Define the input string
        String input = "level";

        // Use a deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare characters from both ends
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
